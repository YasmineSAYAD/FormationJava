public class Traitement_de_chaine_de_caract�res {

	public static void main(String[] args) {
		String ch = "un sourire ne coute rien mais produit beaucoup ";
		// la longueur de la chaine
		System.out.println("la longueur de la chaine est:" + ch.length());
		// r�cup�rer un caract�re � partir d'un indice
		System.out.println("le caract�re a l'indice 3 est:" + ch.charAt(3));
		System.out.println("le caract�re � l'indice 44 est:" + ch.charAt(44));
		// r�cup�rer l'indice d'un caract�re
		System.out.println("l'indice du caract�re s est:" + ch.indexOf('r'));
		// afficher tous les indices d'un caract�re
		for (int i = 0; i < ch.length(); i++) {
			if (ch.charAt(i) == 'r') {
				System.out.println("l'indice du r est:" + i);

			}

		}
		// r�cup�rer une sous chaine � partir d'une chaine de caract�res
		System.out.println("la sous chaine est:" + ch.substring(3, 9));

		// r�cup�rer le reste de la chaine
		System.out.println("le reste de la chaine est:" + ch.substring(13));

		// transformer la chaine de caract�res en majuscules
		System.out.println("la chaine en majuscule est:" + ch.toUpperCase());
		// transformer une chaine en miniscule
		String ch1 = "SOURIEZ, VOUS ETES FORMES!";
		System.out.println("la chaine en miniscule est:" + ch1.toLowerCase());
		// chiffrer un msg
		System.out.println("le message chiffr�:"
				+ ch.replace('r', 'k').replace('o', 'y').replace('s', '*')
						.replace('i', '3'));
		

	}

}
