package Main;

import Mes_classes.Etudiant;

public class Class_executable_1 {

	public static void main(String[] args) {
		Etudiant e1=new Etudiant("sayad","yasmine",21);
		e1.afficher();
		
		Etudiant e2=new Etudiant("yousfi","adel",19);
		e2.afficher();
		
		Etudiant e3=new Etudiant("mouhoub","ilham",23);
		e3.afficher();
		
		System.out.println(e1.getPrenom());
		System.out.println(e2.getNom());
		System.out.println(e3.getAge());
		e3.setNom("yousfi");
		e3.afficher();
		e2.setAge(39);
		e2.afficher();
		e2.setPrenom("mon chouchou");
		e2.afficher();
		
		

	}

}
