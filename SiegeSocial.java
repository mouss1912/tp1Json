package fr.diginamic.json;

public class SiegeSocial {
	@JsonProperty("adresse/ville")
	protected String adresseVille;
	
	@JsonProperty(" état/région")
	 protected String etatRegion;
	 
	 protected String pays;

	 
	public SiegeSocial(String adresseVille, String etatRegion, String pays) {
		super();
		this.adresseVille = adresseVille;
		this.etatRegion = etatRegion;
		this.pays = pays;
	}

	public String getAdresseVille() {
		return adresseVille;
	}

	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	public String getEtatRegion() {
		return etatRegion;
	}

	public void setEtatRegion(String etatRegion) {
		this.etatRegion = etatRegion;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	 
	 
}
