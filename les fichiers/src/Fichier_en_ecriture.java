import java.io.*;
public class Fichier_en_ecriture {

	
	public static void main(String[] args) {
		BufferedWriter bw; //buffer=memoire temporaire
		String ch="Nouria",ch2="Sonia";
		int age=20;
		
		try {
			bw=new BufferedWriter(new FileWriter("C:/Users/admin/Desktop/fiche.txt"));
			System.out.println("le fichier a été bien créé");
			bw.write(ch);
			bw.write("\r\n");
			bw.write(age+" ");
		
			bw.write("\r\n");
			bw.write(ch2);
			bw.close();
		} catch (Exception e) {
			System.err.println("echec de création de fichier"+e.getMessage());
			// e seulement pr afficher le code de l'erreur
		}
		

	}

}
