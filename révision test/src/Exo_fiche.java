import java.io.*;
import java.util.*;
public class Exo_fiche {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenue dans le menu principal");
		System.out.println("1.créez le fichier Relevé de note");
		System.out.println("2.Quitter l'application");
		System.out.println("faites votre choix 1 ou 2");
		
		int choix;
		choix=sc.nextInt();
		
		switch (choix) {
		case 1:
			BufferedWriter bf;
			try {
				bf=new BufferedWriter(new FileWriter("C:/Users/admin/Desktop/ffiche.txt"));
				
				System.out.println("saisissez votre nom");
				
				String nom=sc.nextLine();
				bf.write("Nom :"+nom);
				
				System.out.println("saisissez votre prénom");
				String prenom=sc.nextLine();
				bf.write("Prenom"+prenom);
				System.out.println("Le fichier a été bien créé");
				
				bf.close();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			break;

		default:
			break;
		}

	}

}
