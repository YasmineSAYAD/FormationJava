public class Traitement_de_chaine_de_caractères {

	public static void main(String[] args) {
		String ch = "un sourire ne coute rien mais produit beaucoup ";
		// la longueur de la chaine
		System.out.println("la longueur de la chaine est:" + ch.length());
		// récupérer un caractère à partir d'un indice
		System.out.println("le caractère a l'indice 3 est:" + ch.charAt(3));
		System.out.println("le caractère à l'indice 44 est:" + ch.charAt(44));
		// récupérer l'indice d'un caractère
		System.out.println("l'indice du caractère s est:" + ch.indexOf('r'));
		// afficher tous les indices d'un caractère
		for (int i = 0; i < ch.length(); i++) {
			if (ch.charAt(i) == 'r') {
				System.out.println("l'indice du r est:" + i);

			}

		}
		// récupérer une sous chaine à partir d'une chaine de caractères
		System.out.println("la sous chaine est:" + ch.substring(3, 9));

		// récupérer le reste de la chaine
		System.out.println("le reste de la chaine est:" + ch.substring(13));

		// transformer la chaine de caractères en majuscules
		System.out.println("la chaine en majuscule est:" + ch.toUpperCase());
		// transformer une chaine en miniscule
		String ch1 = "SOURIEZ, VOUS ETES FORMES!";
		System.out.println("la chaine en miniscule est:" + ch1.toLowerCase());
		// chiffrer un msg
		System.out.println("le message chiffré:"
				+ ch.replace('r', 'k').replace('o', 'y').replace('s', '*')
						.replace('i', '3'));
		

	}

}
