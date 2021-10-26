import java.util.Scanner;

public class Fiche_personnelle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez votre nom");
		String n, p;
		n = sc.nextLine();
		System.out.println("saisissez votre prénom");
		p = sc.nextLine();

		int a;
		System.out.println("saisissez votre age");
		a = sc.nextInt();

		float mj, mu;
		System.out.println("saisissez la note java");
		mj = sc.nextFloat();
		System.out.println("saisissez la note UML");
		mu = sc.nextFloat();

		System.out.println("nom:" + n + "\n" + "prenom:" + p + "\n"
				+ "agé(e) de :" + a + " ans" + "\n" + "a obtenu " + (mj + mu)
				/ 2 + " de moyenne ");
		if ((mu + mj) / 2 > 10) {
			System.out.println("Décision :admis(e)");

		} else {
			System.out.println("Décision :ajourné(e)");

		}
	}

}
