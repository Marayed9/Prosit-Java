package tn.tuniprob.gestionproduit;

import tn.tuniprob.gestionmagasin.Magasin;

public class Produits implements Critere {
	
	private int id;
	private String libelle;
	private String marque;
	private double prix;
	private String type;
	private float quantité;
	
	Produits() {};
	
	Produits(int id, String libelle, String marque) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
	}
	
	public Produits(int id, String libelle, float quantité) {
		this.id = id;
		this.libelle = libelle;
		this.setQuantité(quantité);
	}
	
	Produits(int id, String libelle, String marque, double prix) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
		if (prix >= 0)
			this.prix = prix;	
	}
	
	void Afficher() {
		System.out.println("ID = " + this.id);
		System.out.println("Libelle = " + this.libelle);
		System.out.println("Marque = " + this.marque);
		System.out.println("Prix = " + this.prix);
	}
	
	@Override
	public String toString() {
		return "id = " + this.id + " libelle = "  + this.libelle + " marque = " + this.marque + " prix = " + this.prix;
	}
	
	private static String determinerTypeProduit(Produits p) {
		if (p instanceof ProduitFruit || p instanceof ProduitLegume)
			return p.getType();
		else
			return "Autre";
	}
	
	public boolean estFrais(String saison) {
		return false;
	}
	
	public static void main(String[] args) {
		
		Magasin mag1 = new Magasin(1, "Carrefour", "Centre-Ville");
		Magasin mag2 = new Magasin(2, "Monoprix", "Menzah 6");
		
		Produits P1 = new ProduitFruit(1254, "Fraise", 12.3f, "Mars" );
		Produits P2 = new ProduitFruit(1224, "Pastèque", 50f, "Juin" );
		Produits P3 = new ProduitFruit(7896, "Mandarine", 25.6f, "Décembre" );
		Produits P4 = new ProduitLegume(8521, "Artichauts", 14f, "Janvier");
		
		mag1.ajouterProduit(P1);
		mag1.ajouterProduit(P2);
		mag1.ajouterProduit(P3);
		mag1.ajouterProduit(P4);
		
		System.out.println(mag1.calculStock());
		System.out.println(P4.estFrais("Mars"));
		
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public float getQuantité() {
		return quantité;
	}

	public void setQuantité(float quantité) {
		this.quantité = quantité;
	}

}
