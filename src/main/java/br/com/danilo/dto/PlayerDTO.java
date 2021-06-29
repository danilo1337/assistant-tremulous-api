package br.com.danilo.dto;

public class PlayerDTO {
	private String name;
	private int score;
	private int ping;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getPing() {
		return ping;
	}
	public void setPing(int ping) {
		this.ping = ping;
	}
	@Override
	public String toString() {
		String nameTrim[] = name.split(";");
		int tam = nameTrim.length;
		return "\n🙍‍♂️: "+nameTrim[tam-1]
			  +"\n📈: "+score+"\n";
			  
	}
	
	
}
