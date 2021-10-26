
public class Traitement_etudiant {

	
	public static void main(String[] args) {
		Etudiant e1=new Etudiant("sayad","yasmine","L3");
		Etudiant e2=new Etudiant("mouhoub","ilham","M1");
		Etudiant e3=new Etudiant("bakour","yasmine","M1");
		Etudiant e4=new Etudiant("Harkouk","ouarda","L3");
		Etudiant e5=new Etudiant("sadi","sidali","L3");
		
		Etudiant etude[]={e1,e2,e3,e4,e5};
		System.out.println("la liste de tous les etudiant");
		for (int i = 0; i < etude.length; i++) {
			etude[i].afficher();
			
		}
		System.out.println("la liste de tous les etudiants en L3");
		for (int i = 0; i < etude.length; i++) {
			if (etude[i].getNiveau().equals("M1")) {
				continue;
				
				
				
			}
			etude[i].afficher();
			
		}

	}

}
