package Mes_classes;

public class Class_exemple {
	//les variables de class
	String marque,couleur;
	int ams;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getAms() {
		return ams;
	}
	public void setAms(int ams) {
		this.ams = ams;
	}
	public Class_exemple(int ams, String couleur, String marque) {
		super();
		this.ams = ams;
		this.couleur = couleur;
		this.marque = marque;
	}


}
