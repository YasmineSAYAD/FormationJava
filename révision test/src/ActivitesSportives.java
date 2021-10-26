import java.io.FileWriter;
import java.io.BufferedWriter;


public class ActivitesSportives {

	public static void main(String[] args) {
		
		BufferedWriter bw ;
		
	Object mat[][] = { { "ANNEE", "REGION", "SPORT", "CA-HT" },
				{ 2001, "EST", "FOOTBALL", 150000 },
				{  2001, "EST", "FOOTBALL", 200000 },
				{ 2001, "NORD", "TENNIS", 60000 },
				{ 2003, "EST", "TENNIS", 180000 },
				{ 2005, "EST", "FOOTBALL", 405000 },
				{ 2006, "OUEST", "NATATION", 500000 },
				{ 2007, "SUD", "NATATION", 80000 } };

		try {
			
			bw = new BufferedWriter(new FileWriter("C:\\Users\\admin\\Desktop\\ysmn.txt"));

			bw.write("LISTE REGIONAL DES ACTIVITES SPORTIVES");
			bw.write("\r\n");

			for (int i = 0; i < mat.length; i++) {

				for (int j = 0; j < mat.length; j++) {

					bw.write(mat[i][j].toString() + "\t");

				}
				bw.write("\r\n");
			}
			
			bw.close();

		} catch (Exception e) {
			System.err.println("echec de creation " + e.getMessage());
		}

	}

}
