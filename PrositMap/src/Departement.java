
public class Departement {
	int id;
	String nom;
	
	public Departement() {}
	
	public Departement(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof Departement && this == obj) return true;
		else return false;
	}

	@Override
	public String toString() {
		return "\nid :" + this.id + "\nnom :" + this.nom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
