public class Utilisation_continue {

	public static void main(String[] args) {
		String jour[] = { "Dimanche", "Lundi", "Mardi", "Mercredi", "Jeudi",
				"Vendredi", "Samedi" };
		System.out.println("tous les jours de la semaine");
		for (int i = 0; i < jour.length; i++) {
			System.out.print(jour[i] + "\t");

		}
		System.out.println("\ntous les jours de la semaine sauf le mardi");
		for (int i = 0; i < jour.length; i++) {
			if (jour[i].equals("Mardi") || jour[i].equals("Vendredi")) { 
				// & s'il trouve un 0 il passe à la prochaine inst
																	
				continue;

			}
			System.out.print(jour[i] + "\t");

		}

	}

}
