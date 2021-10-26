public class Ma_class {
	// declaration des variables

	static String x;
	String y;
	int a;

	// declaration des methodes
	public static int  somme(int b,int c) {
		return b+c;
		
	}
	public float moyenne(float e,float r,float u) {
		return (u+e+r)/3;
		
	}
	public void affichage() {
		System.out.println("je suis un super developpeur!!!");
		
	}
		
	

	public static void main(String[] args) {
		x = "sonia";
		System.out.println("la valeur de x est:" + x);
		Ma_class c = new Ma_class();
		c.y = "wassila";
		System.out.println("la valeur de y est:" + c.y);
		c.a = 24;
		System.out.println("la valeur de a est:" + c.a);
		System.out.println(somme(15, 20));
		System.out.println(c.moyenne(14.5f, 15.25f,8));
		c.affichage();
		

	}

}
