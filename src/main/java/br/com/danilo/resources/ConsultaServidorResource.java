package br.com.danilo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.danilo.dto.RootDTO;
import br.com.danilo.service.ConsultaServidorService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("servidores")
public class ConsultaServidorResource {
	
	@Autowired
	private ConsultaServidorService service;
	
	@GetMapping("jogadores-online")
	private List<RootDTO> consultarJogadoresOnline(){
		return service.consultarComJogadoresOnline();
	}
	
	@GetMapping
	private List<RootDTO> consultarTodos(){
		return service.consultarTodosServidores();
	}
}
