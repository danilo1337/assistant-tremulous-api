package br.com.danilo.enumerator;

import lombok.Getter;

public enum WebServiceEnumerator {
	
	URL("http://dpmaster.deathmask.net/?game=tremulous&json=1&nocolors=1&hidehtmltags=1&utf8=1");
	
	@Getter
	private final String descricao;

	private WebServiceEnumerator(String descricao) {
		this.descricao = descricao;
	}
	
}
