import java.util.*;
public class Utilisation_scanner {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//lecture d'une chaine de caractère
	String nom;
	System.out.println("veuillez saisir votre nom");
	nom=sc.nextLine();
	System.out.println("votre nom est:"+nom);
	//lecture d'un entier 
	System.out.println("veuillez saisir votre age");
	int a;
	a=sc.nextInt();
	System.out.println("vous avez "+a+" ans");
	//lecture d'un reel
	float m;
	System.out.println("veuillez saisir votre moyenne");
	m=sc.nextFloat();
	System.out.println("vous avez "+m+" de moyenne");

	}

}
