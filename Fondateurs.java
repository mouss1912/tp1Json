package fr.diginamic.json;

import java.util.List;

public class Fondateurs {
	
	protected String nom;
	 protected String prenom;
	 
	 @JsonProperty("date de naissance")
	 protected String dateDeNaissance;
	 
	 protected Lieu lieux;

	public Fondateurs(String nom, String prenom, String dateDeNaissance, Lieu lieux) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.lieux = lieux;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public Lieu getLieux() {
		return lieux;
	}

	public void setLieux(Lieu lieux) {
		this.lieux = lieux;
	}

	 
}
