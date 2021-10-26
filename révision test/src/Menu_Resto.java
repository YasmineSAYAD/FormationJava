import java.io.BufferedWriter;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Menu_Resto {
	


		public static void main(String[] args) {
			BufferedWriter bw = null;
			FileWriter fw = null;
			String mat[][] = { { "Dimanche", "PR", "Lundi", "PR", "Mardi", "PR", "Mercredi", "PR", "Jeudi", "PR", "Vendredi", "PR", "Samedi", "PR" }, 
					{"E:Salade", "100", "E:Macedoine", "150", "E:Chorba", "200", "E:Bourak", "70", "E:Soupe", "150", "E:Velouté", "150", "E:Chektchouka", "100"},
					{"P:Couscous", "300", "P:Dolma", "250", "P:Chtitha", "250", "P:Spaghettis", "200", "P:Lentilles", "200", "P:Ploulet", "200", "P:Gratin", "200"},
					{"D:Glace", "150", "D:Gateau", "150", "D:Tarte", "100", "D:Fruits", "100", "D:Génoise", "100", "D:Bavarois", "100", "D:Mousse", "150" } };
			Scanner sc = new Scanner(System.in);
			try {
				fw = new FileWriter("menu_r.txt");
				bw = new BufferedWriter(fw);

				bw.write("\t\t\t\t\t\t\t MENU RESTAURANT");
				bw.write("\r\n");
				bw.write("Menu hébdomadaire:");
				bw.write("\r\n");
				System.out.println("veuillez choisir un jour de la semaine");

				String choix = sc.nextLine();

				if (choix.equals("Dimanche")) {

					for (int i = 0; i < mat.length; i++) {
						bw.write(mat[i][0] + "\t\t" + mat[i][1]);

						bw.write("\r\n");
					}
				} else {
					if (choix.equals("Lundi")) {

						for (int i = 0; i < mat.length; i++) {
							bw.write(mat[i][2] + "\t\t" + mat[i][3]);
							bw.write("\r\n");

						}
					} else {
						if (choix.equals("Mardi")) {

							for (int i = 0; i < mat.length; i++) {
								bw.write(mat[i][4] + "\t\t" + mat[i][5]);
								bw.write("\r\n");
							}
						} else {
							if (choix.equals("Mercredi")) {

								for (int i = 0; i < mat.length; i++) {
									bw.write(mat[i][6] + "\t\t" + mat[i][7]);
									bw.write("\r\n");
								}
							} else {
								if (choix.equals("Jeudi")) {

									for (int i = 0; i < mat.length; i++) {
										bw.write(mat[i][8] + "\t\t" + mat[i][9]);
										bw.write("\r\n");
									}
								} else {
									if (choix.equals("Vendredi")) {

										for (int i = 0; i < mat.length; i++) {
											bw.write(mat[i][10] + "\t\t" + mat[i][11]);
											bw.write("\r\n");
										}
									} else {
										if (choix.equals("Samedi")) {

											for (int i = 0; i < mat.length; i++) {
												bw.write(mat[i][12] + "\t\t" + mat[i][13]);
												bw.write("\r\n");
											}
										}

									}
								}
							}
						}
					}
				}
			} catch (Exception e) {
				System.err.println("echec de creation " + e.getMessage());
			} finally {
				sc.close();
				if (bw != null) {
					try {
						bw.close();

					} catch (IOException e1) {
						System.err.println("erreur lors de la fermeture du fichier" + e1.getMessage());
					}
				}
				
				if (fw != null) {
					try {
						fw.close();

					} catch (IOException e1) {
						System.err.println("erreur lors de la fermeture du fichier" + e1.getMessage());
					}
				}
			}

		}

	
	}


