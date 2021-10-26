package Mes_classes;
public class Etudiant {
	//les variables de classe
	String nom,prenom;
	int age;
	//le constructeur de la classe
	public Etudiant(String n,String p,int a){
		this.nom=n;
		this.prenom=p;
		this.age=a;
		
	}
	//la méthode d'affichage des objets
	public void afficher() {
		System.out.print("nom:"+this.nom+"\tprénom:"+this.prenom+"\tage:"+this.age);
	
		
	}
	//les getters (les accesseurs)
	public String getNom() {
		return nom;
		
	}
	public String getPrenom() {
		return prenom;
		
	}
	public int getAge() {
		return age;
		
	}
	//les setters (les modifieurs)
	public void setNom(String n) {
		nom=n;
		
	}
	public void setPrenom(String p) {
		prenom=p;
		
	}
	public void setAge(int a){
		age=a;
	}

}
