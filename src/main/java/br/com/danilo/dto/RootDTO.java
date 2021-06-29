package br.com.danilo.dto;

import java.util.List;

public class RootDTO {
	private String protocol;
	private String address;
	private String status;
	private String hostname;
	private String name;
	private String gametype;
	private String map;
	private int numplayers;
	private int maxplayers;
	private int numspectators;
	private int maxspectators;
	private int ping;
	private int retries;
	private RulesDTO rules;
	private List<PlayerDTO> players;

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGametype() {
		return gametype;
	}

	public void setGametype(String gametype) {
		this.gametype = gametype;
	}

	public String getMap() {
		return map;
	}

	public void setMap(String map) {
		this.map = map;
	}

	public int getNumplayers() {
		return numplayers;
	}

	public void setNumplayers(int numplayers) {
		this.numplayers = numplayers;
	}

	public int getMaxplayers() {
		return maxplayers;
	}

	public void setMaxplayers(int maxplayers) {
		this.maxplayers = maxplayers;
	}

	public int getNumspectators() {
		return numspectators;
	}

	public void setNumspectators(int numspectators) {
		this.numspectators = numspectators;
	}

	public int getMaxspectators() {
		return maxspectators;
	}

	public void setMaxspectators(int maxspectators) {
		this.maxspectators = maxspectators;
	}

	public int getPing() {
		return ping;
	}

	public void setPing(int ping) {
		this.ping = ping;
	}

	public int getRetries() {
		return retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public RulesDTO getRules() {
		return rules;
	}

	public void setRules(RulesDTO rules) {
		this.rules = rules;
	}

	public List<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(List<PlayerDTO> players) {
		this.players = players;
	}

	@Override
	public String toString() {
		return address
			+ "\nMapa: "+ map
			+  "\nOnline: "+numplayers
			+ "\nPlayers:\n"+players.toString();
	}
	
	
	
}
