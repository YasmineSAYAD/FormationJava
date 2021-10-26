import java.io.*;
import java.util.*;
public class LeConjugueur {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BufferedWriter bw;
		try {
			bw=new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\conjugueur.txt"));
			bw.write("\t\t\t\t\tMON CONJUGUEUR");
			bw.write("\r\n");
			System.out.println("veuillez saisir le verbe que vous voulez conjuguer:");
			String verb=sc.nextLine();
			bw.write("Verbe:"+verb);
			bw.write("\r\n");
			int x=verb.length();
			if (verb.substring((x-2)).equals("er")) {
				bw.write("Catégorie:Premier groupe");
				
			}else{
				bw.write("Catégorie:Deuxième groupe");
			}
			bw.write("\r\n");
			bw.write("Present");
			bw.write("\r\n");
			if (verb.substring((x-2)).equals("er")) {
				String rad=verb.substring(0, x-2);
				bw.write("Je "+rad+"e"+"\r\n"+"Tu "+rad+"es"+"\r\n"+"Il/Elle "+rad+"e"+"\r\n"+"Nous "+rad+"ons"+"\r\n"+"Vous "+rad+"ez"+"\r\n"+"Ils/Elles "+rad+"ent");
				
			}
			
			
			bw.close();
			
		} catch (Exception e) {
			System.err.println("echec de creation"+e.getMessage());
		}
		

	}

}
