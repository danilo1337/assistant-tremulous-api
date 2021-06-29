package br.com.danilo.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import br.com.danilo.dto.RootDTO;
import br.com.danilo.enumerator.WebServiceEnumerator;

@Service
public class ConsultaServidorService {
	
	public List<RootDTO> consultarComJogadoresOnline() {
		String url = WebServiceEnumerator.URL.getDescricao();
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Void> request = RequestEntity
				.get(URI.create(url))
				.build();
		
		ResponseEntity<RootDTO[]> response = restTemplate.exchange(request, RootDTO[].class);
		
		List<RootDTO> body = Arrays.asList(response.getBody());
		
		List<RootDTO> servidoresContendoPlayer = body.stream()
				.filter(e -> e.getNumplayers() > 0)
				.collect(Collectors.toList());
		
		//tratar caracteres
		servidoresContendoPlayer.stream()
//		.filter(w -> w.getName() != null)
		.forEach(e ->{
			 e.setName(tratarCaracteres(e.getName()));
			 
			 e.getPlayers().stream()
			 .forEach(f -> f.setName(tratarCaracteres(f.getName())));
			 
		});
		
		
		return servidoresContendoPlayer;
	}
	
	private String tratarCaracteres(String nome) {
		String resultado = "";
		
		String tratamento[] = nome.split("\\^");
		
		if (tratamento.length > 1) {
		for (int i = 0; i < tratamento.length; i++) {
			if(!tratamento[i].isBlank())
				resultado += tratamento[i].substring(1);
		}
		
		return resultado;
		}
		
		return nome;
	}

	public List<RootDTO> consultarTodosServidores() {
		String url = WebServiceEnumerator.URL.getDescricao();
		RestTemplate restTemplate = new RestTemplate();
		
		RequestEntity<Void> request = RequestEntity
				.get(URI.create(url))
				.build();
		
		ResponseEntity<RootDTO[]> response = restTemplate.exchange(request, RootDTO[].class);
		
		List<RootDTO> body = Arrays.asList(response.getBody());
		
		//tratar caracteres
		body.stream()
//		.filter(w -> w.getName() != null)
		.forEach(e ->{
			 e.setName(tratarCaracteres(e.getName()));
			 
			 e.getPlayers().stream()
			 .forEach(f -> f.setName(tratarCaracteres(f.getName())));
			 
		});
		
		return body;
	}
	
}
