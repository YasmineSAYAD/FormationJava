import java.util.*;
import java.io.*;
public class Cahier_adresses {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BufferedWriter bw = null;
		FileWriter fw=null;
		int nba=0;
		String rep;
		
		try {
			bw=new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\cahier.txt"));
			bw.write("\t\t\t\t\tCAHIER D'ADRESSES");
			bw.write("\r\n");
	
			
			
			
				do {
					
					
					
				
			 
				System.out.println("saisissez le N° de rue:");
				String nr=sc.nextLine();
				System.out.println("saisissez le nom de la rue:");
				String nomr=sc.nextLine();
				System.out.println("saisissez le nom de la ville");
				String nomv=sc.nextLine();
				nba++;
				bw.write("Adresse "+String.valueOf(nba)+":"+nr+","+nomr+","+nomv);
				bw.write( "\r\n");
				System.out.println("voulez vous ajouter une autre adresse?");
				 rep=sc.nextLine();}
				
				
				
				
				 while (rep.equals("oui"));
				bw.write("NB Adresse:"+String.valueOf(nba));
				bw.close();
				
				
			
			
		} catch (Exception e) {
			System.err.println("echec de création"+e.getMessage());
		}
		}
		

	}


