package fr.diginamic.json;

public class ChiffreAffaire {
	
	@JsonProperty("année")
	protected int annee;

	protected double montant;
	

	public ChiffreAffaire(int annee, double montant) {
		super();
		this.annee = annee;
		this.montant = montant;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	

}
