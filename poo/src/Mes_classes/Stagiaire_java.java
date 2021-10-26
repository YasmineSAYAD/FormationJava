package Mes_classes;
public class Stagiaire_java extends Etudiant {
//variables de classe
	float note;
	public Stagiaire_java(String n, String p, int a,float nj) {
		super(n, p, a);
		this.note=nj;
		
	}
	//la méthode d'affichage
	public void afficher() {
		super.afficher();
		System.out.println("\tla note java est:"+note);
		
	}

}
