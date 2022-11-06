package tn.tuniprob.gestionproduit;

public class ProduitLegume extends Produits {
	private String saison;
	public final String[] SAISONS = {"Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "September", "October", "Novembre", "Decembre"};
	
	public ProduitLegume(int id, String libelle, float quantité, String saison) {
		super(id, libelle, quantité);
		this.saison = saison;
		this.setType("Legume");
	}
	
	@Override
	public boolean estFrais(String saison) {
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < SAISONS.length; i++) {
			if (saison == SAISONS[i]){
					x = i;
					break;
			}		
		}
		
		for (int i = 0; i < SAISONS.length; i++) {
			if (this.getSaison() == SAISONS[i]){
					y = i;
					break;
			}		
		}
		
		if ( x == y)
			return true;
		else if (y == x - 1)
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
