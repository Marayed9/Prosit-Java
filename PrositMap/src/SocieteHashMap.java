import java.util.HashMap;

public class SocieteHashMap implements InterfaceSociete {
	
	HashMap<Employe, Departement>empHashMap = new HashMap<Employe, Departement>();
	
	@Override
	public void ajouterEmployeDepartement(Employe e, Departement d) {
		empHashMap.put(e, d);
		
	}

	@Override
	public void supprimerEmploye(Employe e) {
		empHashMap.remove(e);
		
	}

	@Override
	public void afficherLesEmployesLeursDepartements() {
		System.out.println(empHashMap.toString());
		
	}

	@Override
	public void afficherLesEmployes() {
		System.out.println(empHashMap.keySet().toString());
		
	}

	@Override
	public void afficherLesDepartements() {
		System.out.println(empHashMap.values().toString());
		
	}

	@Override
	public void afficherDepartement(Employe e) {
		System.out.println(empHashMap.get(e).toString());
		
	}

	@Override
	public boolean rechercherEmploye(Employe e) {
		if (empHashMap.containsKey(e)) 
			return true;
		else 
			return false;
	}

	@Override
	public boolean rechercherDepartement(Departement e) {
		if (empHashMap.containsValue(e))
			return true;
		else
			return false;
	}

}
