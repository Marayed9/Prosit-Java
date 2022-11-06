package tn.tuniprob.gestionproduit;

public class ProduitFruit extends Produits {
	private String saison;
	
	public ProduitFruit(int id, String libelle, float quantité, String saison) {
		super(id, libelle, quantité);
		this.saison = saison;
		this.setType("Fruit");
	}

	
	@Override
	public boolean estFrais(String saison) {
		if (saison == this.getSaison())
			return true;
		else
			return false;
	}
	
	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}


}
