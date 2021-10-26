public class Exo_mat_1 {

	public static void main(String[] args) {
		int matr[][] = { { 12, 15, 25 }, { 30, 75, 5 }, { 6, 9, 17 } };
		System.out.println("la matrice initiale est:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matr[i][j] + "\t");
			}

			System.out.println();

		}

		System.out.println("la matrice resultat est:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print((matr[i][j] = 1) + "\t");

				} else {
					System.out.print((matr[i][j] = 0) + "\t");

				}
			}
			System.out.println();
		}
		

	}

}
