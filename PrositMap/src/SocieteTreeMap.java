import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
	
	TreeMap<Employe, Departement>empTreeMap = new TreeMap<Employe, Departement>();
	
	@Override
	public void ajouterEmployeDepartement(Employe e, Departement d) {
		empTreeMap.put(e, d);
		
	}

	@Override
	public void supprimerEmploye(Employe e) {
		empTreeMap.remove(e);
		
	}

	@Override
	public void afficherLesEmployesLeursDepartements() {
		System.out.println(empTreeMap.toString());
		
	}

	@Override
	public void afficherLesEmployes() {
		System.out.println(empTreeMap.keySet().toString());
		
	}

	@Override
	public void afficherLesDepartements() {
		System.out.println(empTreeMap.values().toString());
		
	}

	@Override
	public void afficherDepartement(Employe e) {
		System.out.println(empTreeMap.get(e));
		
	}

	@Override
	public boolean rechercherEmploye(Employe e) {
		if (empTreeMap.containsKey(e)) 
			return true;
		else 
			return false;
	}

	@Override
	public boolean rechercherDepartement(Departement e) {
		if (empTreeMap.containsValue(e))
			return true;
		else
			return false;
	}
}
