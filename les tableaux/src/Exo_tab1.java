public class Exo_tab1 {

	public static void main(String[] args) {
		// declaration d'un tab
		int tab[] = { 2, 3, 11, 8, 13, 4, 6, 7, 5 };

		System.out.println("le tableau initial est: ");
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "\t");
		}

		System.out.println("\nle tableau resultat est:");
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 == 0) {
				System.out.print(tab[i] * 2 + "\t");

			} else {
				System.out.print(tab[i] * 3 + "\t");

			}

		}
	}

}
