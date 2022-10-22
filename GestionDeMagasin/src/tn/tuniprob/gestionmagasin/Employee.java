package tn.tuniprob.gestionmagasin;

public abstract class Employee {
	public int empId;
	public int nbr_heures;
	public String empNom;
	public String empAdresse;

	public Employee(int empId, int nbr_heures, String empNom, String empAdresse) {
		this.empId = empId;
		this.nbr_heures = nbr_heures;
		this.empNom = empNom;
		this.empAdresse = empAdresse;
	}
	
	@Override
	public abstract String toString();
	
	public abstract int Salaire();

}
