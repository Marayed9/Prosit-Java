package tn.tuniprob.gestionproduit;

import tn.tuniprob.gestionmagasin.Caissier;
import tn.tuniprob.gestionmagasin.Employee;
import tn.tuniprob.gestionmagasin.Magasin;
import tn.tuniprob.gestionmagasin.Responsable;
import tn.tuniprob.gestionmagasin.Vendeur;

public class Produits {
	
	private int id;
	private String libelle;
	private String marque;
	private double prix; 
	
	Produits() {};
	
	Produits(int id, String libelle, String marque) {
		this.id = id;
		this.libelle = libelle;
		this.marque = marque;
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
	
	public static void main(String[] args) {
		
		Produits prod0 = new Produits();
		Produits prod1 = new Produits(1021, "Lait", "Delice");
		Produits prod2 = new Produits(2510, "Yaourt", "Vitlait");
		Produits prod3 = new Produits(3250, "Tomate", "Sicam", 1.200);
		
		/*prod1.Afficher();
		prod2.Afficher();
		prod3.Afficher();
		
		prod1.prix = 0.700;
		
		prod1.Afficher();
		
		prod2.prix = 0.400;
		
		prod0.id = 800;
		prod0.libelle = "Chocolat";
		prod0.marque = "Saiid";
		prod0.prix = 2.000;
		
		prod0.Afficher();
		prod1.Afficher();
		prod2.Afficher();
		
		System.out.println(prod0.toString());
		System.out.println(prod1.toString());
		System.out.println(prod2.toString());
		System.out.println(prod3.toString());
		
		Magasin mag1 = new Magasin(1, "Monoprix");
		
		mag1.ajouterProduit(prod1);
		mag1.ajouterProduit(prod3);
		mag1.ajouterProduit(prod3);
		mag1.ajouterProduit(prod3);
		
		System.out.println(mag1.toString());*/
		
		Magasin mag1 = new Magasin(1, "Carrefour", "Centre-Ville");
		Magasin mag2 = new Magasin(2, "Monoprix", "Menzah 6");
		
		//mag1
		Caissier cas1 = new Caissier(1, 2, "Amine1", "Ville1", 1);
		Caissier cas2 = new Caissier(2, 4, "Amine2", "Ville2", 2);
		Vendeur ven1 = new Vendeur(3, 6, "Amine3", "Ville3", 30);
		Responsable res1 = new Responsable(4, 3, "Amine4", "Ville4", 6);
		mag1.ajouterEmployee(cas1);
		mag1.ajouterEmployee(cas2);
		mag1.ajouterEmployee(ven1);
		mag1.ajouterEmployee(res1);
		mag1.ajouterProduit(prod1);
		mag1.ajouterProduit(prod2);
		mag1.ajouterProduit(prod3);
		
		//mag2
		Caissier cas3 = new Caissier(5, 15, "Salah1", "City1", 6);
		Vendeur ven2 = new Vendeur(6, 10, "Salah2", "CIty2", 60);
		Vendeur ven3 = new Vendeur(7, 18, "Salah3", "CIty3", 20);
		Vendeur ven4 = new Vendeur(8, 17, "Salah4", "CIty4", 40);
		Responsable res2 = new Responsable(9, 6, "Salah5", "Ville5", 4);
		mag2.ajouterEmployee(cas3);
		mag2.ajouterEmployee(ven2);
		mag2.ajouterEmployee(ven3);
		mag2.ajouterEmployee(ven4);
		mag2.ajouterEmployee(res2);
		mag2.ajouterProduit(prod3);
		
		System.out.println(cas1.toString());
		System.out.println(cas2.toString());
		System.out.println(cas3.toString());
		System.out.println(ven1.toString());
		System.out.println(ven2.toString());
		System.out.println(ven3.toString());
		System.out.println(ven4.toString());
		System.out.println(res1.toString());
		System.out.println(res2.toString());
		
		
		System.out.println(mag1.toString());
		System.out.println(mag2.toString());
		
		
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
	
}
