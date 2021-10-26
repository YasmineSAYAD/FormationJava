import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Relevé_de_notes {
	

	
	public static void main(String[] args)  {
		
	
		
		System.out.println("Bienvenue dans le menu principal");
		System.out.println("1.créez le fichier :Relevé de notes");
		System.out.println("2.Quitter l'application");
		System.out.println("faites votre choix 1 ou 2:");
		
		Scanner sc=new Scanner(System.in);
		int choix=sc.nextInt();
		String nom,prenom,date;
		float n1 = 0,n2 = 0;
		FileWriter fw=null;
		BufferedWriter bw=null;
	
		sc.nextLine();
		
		
		if (choix==1) {
			
		
			try {
				fw=new FileWriter("ficherr.txt");
				bw=new BufferedWriter(fw);
			
				
				
				System.out.println("saisissez votre nom :");
				nom = sc.nextLine();
				bw.write("Nom: "+nom);
				bw.write("\r\n");
				
				System.out.println("saisissez votre prénom :");
				prenom=sc.nextLine();
				bw.write("Prenom: "+prenom);
				bw.write("\r\n");
				
				System.out.println("saisissez votre date de naissance :");
				date=sc.nextLine();
				bw.write("Date de naissance: "+date);
				bw.write("\r\n");
				
				
				System.out.println("saisissez votre note java");
				 n1=sc.nextFloat();
				
				
				
				System.out.println("saisissez votre note UML");
				 n2=sc.nextFloat();
				 Object mat[][]={{"N°","Module","Note"},{1,"Java",n1},{2,"UML",n2}};
				
				for (int i = 0; i < mat.length; i++) {
					for (int j = 0; j < mat.length; j++) {
						String ch=mat[i][j].toString();
						bw.write(ch+"\t\t\t");
						
					}
					bw.write("\r\n");
				}
					
			
				
				
				
				
				
				
				bw.write( "\r\n");
				
				
				bw.write("votre moyenne est de"+(n1+n2)/2 +"vous etes ");
				if ((n1+n2)/2>=10) {
					bw.write("admis(e)");
					
					
				}else{
					bw.write("ajourné(e)");
				
				}
				
				bw.close();
				
			}
				
				catch (Exception e) {
					System.err.println("Echec de création "+e.getMessage());;
					
				}finally{sc.close();
				if (bw!=null) {
					try{
						bw.close();
					}catch(IOException e1){
						System.err.println("erreur lors de la fermeture du fichier"+e1.getMessage());
					}
					
					
				}}
				}
			
		else{
			if (choix==2) {
				
			
			System.exit(0);}
		else{
			System.out.println("saisissez 1 ou 2");
		}}

				
			 
		
	
		

	}

}
