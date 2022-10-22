package tn.tuniprob.gestionmagasin;

public class Caissier extends Employee {
	private int numeroDeCaisse;
	
	public Caissier(int empId, int nbr_heures, String empNom, String empAdresse, int numeroDeCaisse) {
		super(empId, nbr_heures, empNom, empAdresse);
		this.numeroDeCaisse = numeroDeCaisse;
	}
	
	@Override
	public String toString() {
		return "\nNom: " + this.empNom + "\nId: " + this.empId + "\nAdresse: " + this.empAdresse + "\nHeures: " + this.nbr_heures + "\nCaisse: " + this.numeroDeCaisse + "\nSalaire: " + this.Salaire();
		}

	@Override
	public int Salaire() {
		if (this.nbr_heures > 180)
			return this.nbr_heures * (5 +(5 % 15));
		else
			return this.nbr_heures * 5;
	}
}
