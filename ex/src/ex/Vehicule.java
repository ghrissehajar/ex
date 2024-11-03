package ex;

public class Vehicule {
	public void seDeplacer(){
        System.out.println("Le véhicule se déplace.");
	}
	public class Voiture extends Vehicule {
		  public void seDeplacer() {
		        System.out.println("La voiture roule sur la route.");
		    }
		}
	public class Velo extends Vehicule {
		 public void seDeplacer() {
		        System.out.println("Le vélo avance en pédalant.");
		    }
		}
public class Main {
    public static void main(String[] args) {
    	Vehicule vehicule1 = new Voiture();
        Vehicule vehicule2 = new Velo();
        vehicule1.seDeplacer();
        vehicule2.seDeplacer();
    }
}}