
public class Employe implements Comparable<Employe>{
	int cin, matricule;
	String nom, prenom;
	
	public Employe() {}
	
	public Employe(int cin, int matricule, String nom, String prenom) {
		this.cin = cin;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Employe && this == obj) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "cin : " + this.cin + "\nmatricule :" + this.matricule + "\nnom :" + this.nom + "\nprenom :" + this.prenom;
	}
	
	public static void main(String[] args) {
		SocieteHashMap hash = new SocieteHashMap();
		SocieteTreeMap tree = new SocieteTreeMap();
		Employe e1 = new Employe(1, 1, "Hmed", "safi");
		Departement d1 = new Departement(1, "Marketing");
		Departement d2 = new Departement(2, "Marketing");
		hash.empHashMap.put(e1, d1);
		tree.empTreeMap.put(e1, d1);
		hash.afficherLesDepartements();
		tree.afficherDepartement(e1);
		System.out.println(hash.rechercherEmploye(e1));
		System.out.println(tree.rechercherDepartement(d2));
		
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
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

	@Override
	public int compareTo(Employe e) {
		return Integer.compare(this.cin, e.cin);
	}
	
	
}