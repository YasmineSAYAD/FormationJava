import java.util.*;
import java.io.*;
public class Relevé {

	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	BufferedWriter bw;
	String nom,prenom,date;
	float nj,nu;
	
	try {
		bw =new BufferedWriter(new FileWriter("C:/Users/admin/Desktop/fichetab.txt" ));
		System.out.println("le fichier a été bien créé");
		System.out.println("saisissez votre nom");
		nom=sc.nextLine();
		bw.write("Nom :"+nom);
		bw.write("\r\n");
		System.out.println("saisissez votre prenom");
		prenom=sc.nextLine();
		bw.write("Prenom :"+prenom);
		bw.write("\r\n");
		System.out.println("saisissez votre date de naissance");
		date=sc.nextLine();
		bw.write("Date de naissance :"+date);
		bw.write("\r\n");
		System.out.println("saisissez votre note java");
		nj=sc.nextFloat();
		System.out.println("saisissez votre note UML");
		nu=sc.nextFloat();
		bw.close();
		
	} catch (Exception e) {
		System.err.println("echec de création "+e.getMessage());
	}
	

	}

}
