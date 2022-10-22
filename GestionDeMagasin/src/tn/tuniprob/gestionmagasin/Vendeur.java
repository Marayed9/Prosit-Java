package tn.tuniprob.gestionmagasin;

public class Vendeur extends Employee {
	private int tauxDeVente;
	
	public Vendeur(int empId, int nbr_heures, String empNom, String empAdresse, int tauxDeVente) {
		super(empId, nbr_heures, empNom, empAdresse);
		this.tauxDeVente = tauxDeVente;
	}
	
	@Override
	public String toString() {
		return "\nNom: " + this.empNom + "\nId: " + this.empId + "\nAdresse: " + this.empAdresse + "\nHeures: " + this.nbr_heures + "\nTaux: " + this.tauxDeVente + "\nSalaire: " + this.Salaire() ;
		}

	@Override
	public int Salaire() {
		return (450 * this.tauxDeVente) / 100;
	}
}
