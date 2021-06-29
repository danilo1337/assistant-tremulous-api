package br.com.danilo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import br.com.danilo.dto.PlayerDTO;
import br.com.danilo.dto.RootDTO;

public class Util {
	public static String converteJsonString(BufferedReader buffereReader) throws IOException {
		String resposta, jsonString = "";
		while ((resposta = buffereReader.readLine()) != null) {
			jsonString += resposta;
		}
		return jsonString;
	}
	

	public static String tratarPlayers(List<RootDTO> lista) {
		String resultado = "";
			
		
//			for (RootDTO rootDTO : lista) {
//				resultado+= rootDTO.toString();
//				resultado+="\n";
//			}
		RootDTO root = null;
		for (int i = 0; i < lista.size(); i++) {
			root = lista.get(i);
			if(root.getRules() != null) {
			String hostname = tratarCaracteres(root.getRules().getSv_hostname());
			resultado+= hostname
					+ "\nMapa: "+ root.getMap()
					+  "\nOnline: "+root.getNumplayers()
					+  "\nIp: "+ root.getAddress();
					
			resultado+="\n";
			
			for (int j = 0; j < root.getPlayers().size(); j++) {
				PlayerDTO players = root.getPlayers().get(j);
//				String nameTrim[] = players.getName().split(";");
//				int tam = nameTrim.length;
				String name = tratarCaracteres(players.getName());
				resultado+="\n🙍: "+ name
					  +"\n📈Score: "+players.getScore()
					  +"\n🌐Ping: "+ players.getPing();
				
				resultado+="\n";
			}
			resultado+="\n============================\n";
		}
		}
		return resultado;
	}
	
	private static String tratarCaracteres(String nome) {
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

}
