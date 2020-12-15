package fr.diginamic.json;

import java.util.List;

public class Societe {
	
	private String nom;
	@JsonProperty("siege-social")
	protected List<SiegeSocial> siegeSocial;
	protected List<Fondateurs> fondateurs;
	protected List<ChiffreAffaire> chiffreAffaire;
	
	
	public Societe(String nom, List<SiegeSocial> siegeSocial, List<Fondateurs> fondateurs,
			List<ChiffreAffaire> chiffreAffaire) {
		super();
		this.nom = nom;
		this.siegeSocial = siegeSocial;
		this.fondateurs = fondateurs;
		this.chiffreAffaire = chiffreAffaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<SiegeSocial> getSiegeSocial() {
		return siegeSocial;
	}
	public void setSiegeSocial(List<SiegeSocial> siegeSocial) {
		this.siegeSocial = siegeSocial;
	}
	public List<Fondateurs> getFondateurs() {
		return fondateurs;
	}
	public void setFondateurs(List<Fondateurs> fondateurs) {
		this.fondateurs = fondateurs;
	}
	public List<ChiffreAffaire> getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(List<ChiffreAffaire> chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	
	
	
	
	

}
