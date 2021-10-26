
public class Etudiant {
String prenom,nom,niveau;
public Etudiant(String n,String p,String ni){
	this.nom=n;
	this.prenom=p;
	this.niveau=ni;
}
public void afficher(){
	System.out.println("le nom:"+nom+" le prenom:"+prenom+" le niveau:"+niveau);
}
public String getNom(){
	return nom;
}
public String getPrenom(){
	return prenom;
}
public String getNiveau(){
	return niveau;
}
public void setNom(String n){
	nom=n;
}
public void setPrenom(String p){
	prenom=p;
}
public void setNiveau(String ni){
	niveau=ni;
}

	
	
		

	

}
