
public class Matrice_objet {

	
	public static void main(String[] args) {
		Object mtr[][]={{"java",12,"A"},{18.5,"C++",13},{"B",16.66,"pascal"}};
		System.out.println("la matrice objet est:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(mtr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
