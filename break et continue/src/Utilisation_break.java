
public class Utilisation_break {

	
	
	public static void main(String[] args) {
		String jour[]={"Dimanche","Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi"};
		System.out.println("tous les jours de semaine");
		for (int i = 0; i < jour.length; i++) {
			System.out.print(jour[i]+"\t");
			
		}
		System.out.println("\n après l'utilisation du break");
		for (int i = 0; i < jour.length; i++) {
			if (jour[i].equals("Mercredi")) {
				break;
				
			}
			System.out.print(jour[i]+"\t");
			
		}

	}

}
