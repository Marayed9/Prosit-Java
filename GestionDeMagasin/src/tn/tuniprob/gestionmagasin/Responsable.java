package tn.tuniprob.gestionmagasin;

public class Responsable extends Employee{
	private int prime;
	
	public Responsable(int empId, int nbr_heures, String empNom, String empAdresse, int prime) {
		super(empId, nbr_heures, empNom, empAdresse);
		this.prime = prime;
	}
	
	@Override
	public String toString() {
		return "\nNom: " + this.empNom + "\nId: " + this.empId + "\nAdresse: " + this.empAdresse + "\nHeures: " + this.nbr_heures + "\nPrime: " + this.prime + "\nSalaire: " + this.Salaire();
		}

	@Override
	public int Salaire() {
		if (this.nbr_heures > 160)
			return (this.nbr_heures * 12) + this.prime;
		else
		 return (this.nbr_heures * 10) + this.prime;
	}
}
