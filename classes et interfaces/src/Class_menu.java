import java.util.*;

public class Class_menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("menu principale");
		System.out.println("1-somme de deux entier");
		System.out.println("2-moyenne de trois notes");
		System.out.println("3_affichage d'un message");
		System.out.println("faites votre choix 1,2 ou 3:");

		int choix;
		choix = sc.nextInt();
		Ma_class c = new Ma_class();
		switch (choix) {
		case 1:
			System.out.println("Ma_class.somme(5, 6)");

			break;
		case 2:

			System.out.println(c.moyenne(15.5f, 12.75f, 15));
			break;
		case 3:
			c.affichage();
			break;

		default:
			System.err.println("erreur de saisir");
			break;
		}

	}

}
