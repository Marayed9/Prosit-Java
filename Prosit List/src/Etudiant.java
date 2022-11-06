
public class Etudiant {
	private int id;
	private String nom, prenom;
	
	public Etudiant() {}
	
	public Etudiant(int id, String nom, String prenom) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public boolean equals(Etudiant e) {
		if (this.id == e.id)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return super.toString();
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
