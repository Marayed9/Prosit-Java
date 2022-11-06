import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EspritArrayList implements University, Collection, Comparable<Etudiant>{
	ArrayList<Etudiant> et =  new ArrayList();

	@Override
	public void ajouterEtudiant(Etudiant e) {
		et.add(e);
	}

	@Override
	public boolean rechercherEtudiant(Etudiant e) {
		et.contains(e);
		return false;
	}

	@Override
	public boolean rechercherEtudiant(String nom) {
		et.contains(nom);
		return false;
	}

	@Override
	public void supprimerEtudiant(Etudiant e) {
		et.remove(e);
		
	}

	@Override
	public void displayEtudiants() {
		System.out.println(et);
		
	}

	@Override
	public void trierEtudiantsParId() {
		
		
	}

	@Override
	public void trierEtudiantsParNom() {
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Etudiant o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
