import java.io.*;
import java.util.*;
public class Exo_fichier1 {

	
	public static void main(String[] args) {
		BufferedWriter bw;
		String nom,prenom;
		float note1,note2;
		try {
			bw=new BufferedWriter(new FileWriter("C:/Users/admin/Desktop/exo1.txt"));
			System.out.println("le fichier a été bien créé");
			System.out.println("veuillez saisir votre nom");
			Scanner sc=new Scanner(System.in);
			nom=sc.nextLine();
			bw.write("le nom:"+nom);
			
			System.out.println("veuillez saisir votre prenom");
			prenom=sc.nextLine();
			bw.write("\r\n");
			bw.write("le prenom:"+prenom);
			
			System.out.println("veuillez saisir la note 1");
			note1=sc.nextFloat();
			bw.write("\r\n");
			bw.write("Note1:"+note1);
			
			System.out.println("veuillez saisir la note 2");
			note2=sc.nextFloat();
			bw.write("\r\n");
			bw.write("la note2:"+note2);
			bw.write("\r\n");
			bw.write("la moyenne:"+(note1+note2)/2);
			bw.close();
			
			
		} catch (Exception e) {
			System.err.println("Echec de creation"+e.getMessage());
		}
		

	}

}
