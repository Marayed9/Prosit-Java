package tn.tuniprob.gestionmagasin;


import tn.tuniprob.gestionproduit.Produits;

public class Magasin {
	private int id;
	private String adresse;
	private String nom;
	private int capacite;
	private int capaciteEmp;
	
	private Produits[] ensembleProduits;
	private Employee[] ensembleEmployee;
	
	public Magasin() {
		this.ensembleProduits = new Produits[50];
		this.ensembleEmployee = new Employee[20];
		
	}
	
	public Magasin(int id, String nom , String adresse) {
		this.id = id;
		this.adresse = adresse;
		this.nom = nom;
		this.ensembleProduits = new Produits[50];
		this.ensembleEmployee = new Employee[20];
	}
	
	public void ajouterProduit(Produits p) {
		if (this.getCapacite() < 50) {
			ensembleProduits[this.getCapacite()] = p;
			capacite++;
		} else {
			System.out.println("Full ..");
		}
	}
	
	//Ajouter Emplyoee
	public void ajouterEmployee(Employee emp) {
		if (this.getCapaciteEmp() < 20) {
			ensembleEmployee[this.getCapaciteEmp()] = emp;
			capaciteEmp++;
		} else {
			System.out.println("Full ..");
		}
	}
	
	
	
	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < this.getCapacite(); i++) {
			str += "\nNom = " +ensembleProduits[i].getLibelle();
		}
		
		for (int i = 0; i < this.getCapaciteEmp(); i++) {
			str += "\nNom Employee = " + ensembleEmployee[i].empNom;
		}
		
		return "Le magasin est id: "+ this.id + "\nNom: " + this.nom + "\nCapacite: " + this.getCapacite() + "\nAdresse: " + this.getAdresse() + "\nProduits: " + str; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Produits[] getEnsembleProduits() {
		return ensembleProduits;
	}

	public void setEnsembleProduits(Produits[] ensembleProduits) {
		this.ensembleProduits = ensembleProduits;
	}
	
	public Employee[] getEnsembleEmployee() {
		return ensembleEmployee;
	}
	
	public void setEnsembleEmployee(Employee[] ensembleEmployee) {
		this.ensembleEmployee = ensembleEmployee;
	}
	
	public int getCapaciteEmp() {
		return capaciteEmp;
	}

	public void setCapaciteEmp(int capaciteEmp) {
		this.capaciteEmp = capaciteEmp;
	}
	
}
