package br.com.danilo.dto;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class RulesDTO {
	private String game;
	private String pure;
	private String gamename;
	private String protocol;
	private String sv_minRate;
	private String sv_minPing;
	private String sv_maxRate;
	private String sv_maxPing;
	private String sv_dlURL;
	private String sv_allowDownload;
	private String sv_dlRate;
	private String g_unlagged;
	private String timelimit;
	private String g_suddenDeathTime;
	private String g_allowShare;
	private String g_friendlyFire;
	private String g_friendlyBuildableFire;
	private String g_creditOverflow;
	private String g_suddenDeathMode;
	private String sv_hostname;
	private String version;
	private String com_gamename;
	private String sv_privateClients;
	private String p;
	private String ff;
	private String qvm_version;
	private String g_maxGameClients;
	private String g_suddenDeath;
	private String g_needpass;
	private String g_autoGhost;
	private String g_speed;
	private String g_gravity;
	private String g_knockback;
	private String g_humanBuildPoints;
	private String g_alienBuildPoints;

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String getPure() {
		return pure;
	}

	public void setPure(String pure) {
		this.pure = pure;
	}

	public String getGamename() {
		return gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getSv_minRate() {
		return sv_minRate;
	}

	public void setSv_minRate(String sv_minRate) {
		this.sv_minRate = sv_minRate;
	}

	public String getSv_minPing() {
		return sv_minPing;
	}

	public void setSv_minPing(String sv_minPing) {
		this.sv_minPing = sv_minPing;
	}

	public String getSv_maxRate() {
		return sv_maxRate;
	}

	public void setSv_maxRate(String sv_maxRate) {
		this.sv_maxRate = sv_maxRate;
	}

	public String getSv_maxPing() {
		return sv_maxPing;
	}

	public void setSv_maxPing(String sv_maxPing) {
		this.sv_maxPing = sv_maxPing;
	}

	public String getSv_dlURL() {
		return sv_dlURL;
	}

	public void setSv_dlURL(String sv_dlURL) {
		this.sv_dlURL = sv_dlURL;
	}

	public String getSv_allowDownload() {
		return sv_allowDownload;
	}

	public void setSv_allowDownload(String sv_allowDownload) {
		this.sv_allowDownload = sv_allowDownload;
	}

	public String getSv_dlRate() {
		return sv_dlRate;
	}

	public void setSv_dlRate(String sv_dlRate) {
		this.sv_dlRate = sv_dlRate;
	}

	public String getG_unlagged() {
		return g_unlagged;
	}

	public void setG_unlagged(String g_unlagged) {
		this.g_unlagged = g_unlagged;
	}

	public String getTimelimit() {
		return timelimit;
	}

	public void setTimelimit(String timelimit) {
		this.timelimit = timelimit;
	}

	public String getG_suddenDeathTime() {
		return g_suddenDeathTime;
	}

	public void setG_suddenDeathTime(String g_suddenDeathTime) {
		this.g_suddenDeathTime = g_suddenDeathTime;
	}

	public String getG_allowShare() {
		return g_allowShare;
	}

	public void setG_allowShare(String g_allowShare) {
		this.g_allowShare = g_allowShare;
	}

	public String getG_friendlyFire() {
		return g_friendlyFire;
	}

	public void setG_friendlyFire(String g_friendlyFire) {
		this.g_friendlyFire = g_friendlyFire;
	}

	public String getG_friendlyBuildableFire() {
		return g_friendlyBuildableFire;
	}

	public void setG_friendlyBuildableFire(String g_friendlyBuildableFire) {
		this.g_friendlyBuildableFire = g_friendlyBuildableFire;
	}

	public String getG_creditOverflow() {
		return g_creditOverflow;
	}

	public void setG_creditOverflow(String g_creditOverflow) {
		this.g_creditOverflow = g_creditOverflow;
	}

	public String getG_suddenDeathMode() {
		return g_suddenDeathMode;
	}

	public void setG_suddenDeathMode(String g_suddenDeathMode) {
		this.g_suddenDeathMode = g_suddenDeathMode;
	}

	public String getSv_hostname() {
		return sv_hostname;
	}

	public void setSv_hostname(String sv_hostname) {
		this.sv_hostname = sv_hostname;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCom_gamename() {
		return com_gamename;
	}

	public void setCom_gamename(String com_gamename) {
		this.com_gamename = com_gamename;
	}

	public String getSv_privateClients() {
		return sv_privateClients;
	}

	public void setSv_privateClients(String sv_privateClients) {
		this.sv_privateClients = sv_privateClients;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public String getFf() {
		return ff;
	}

	public void setFf(String ff) {
		this.ff = ff;
	}

	public String getQvm_version() {
		return qvm_version;
	}

	public void setQvm_version(String qvm_version) {
		this.qvm_version = qvm_version;
	}

	public String getG_maxGameClients() {
		return g_maxGameClients;
	}

	public void setG_maxGameClients(String g_maxGameClients) {
		this.g_maxGameClients = g_maxGameClients;
	}

	public String getG_suddenDeath() {
		return g_suddenDeath;
	}

	public void setG_suddenDeath(String g_suddenDeath) {
		this.g_suddenDeath = g_suddenDeath;
	}

	public String getG_needpass() {
		return g_needpass;
	}

	public void setG_needpass(String g_needpass) {
		this.g_needpass = g_needpass;
	}

	public String getG_autoGhost() {
		return g_autoGhost;
	}

	public void setG_autoGhost(String g_autoGhost) {
		this.g_autoGhost = g_autoGhost;
	}

	public String getG_speed() {
		return g_speed;
	}

	public void setG_speed(String g_speed) {
		this.g_speed = g_speed;
	}

	public String getG_gravity() {
		return g_gravity;
	}

	public void setG_gravity(String g_gravity) {
		this.g_gravity = g_gravity;
	}

	public String getG_knockback() {
		return g_knockback;
	}

	public void setG_knockback(String g_knockback) {
		this.g_knockback = g_knockback;
	}

	public String getG_humanBuildPoints() {
		return g_humanBuildPoints;
	}

	public void setG_humanBuildPoints(String g_humanBuildPoints) {
		this.g_humanBuildPoints = g_humanBuildPoints;
	}

	public String getG_alienBuildPoints() {
		return g_alienBuildPoints;
	}

	public void setG_alienBuildPoints(String g_alienBuildPoints) {
		this.g_alienBuildPoints = g_alienBuildPoints;
	}

}
