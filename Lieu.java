package fr.diginamic.json;

public class Lieu {
	@JsonProperty("adresse/ville")
	protected String adresse;
	
	@JsonProperty("état/région")
	protected String etat;
	
	@JsonProperty("United States")
	protected String pays;

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
	

}
