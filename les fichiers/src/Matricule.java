import java.util.*;

public class Matricule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez votre nom");
		String n = sc.nextLine();
		System.out.println("saisissez votre prenom");
		String p = sc.nextLine();
		System.out.println("saisisez votre sp�cialit�");
		String s = sc.nextLine();
		System.out.println("saisissez l'ann�e du BAC");
		String d = sc.nextLine();
		System.out.println("votre matricule est:"
				+ s.substring(1, 4).toUpperCase()
				+ n.substring(1, 4).toUpperCase()
				+ p.substring(1, 2).toUpperCase() + d.substring(3));

	}

}
