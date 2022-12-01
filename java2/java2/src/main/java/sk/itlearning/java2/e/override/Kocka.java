package sk.itlearning.java2.e.override;

public class Kocka {

	double strana = 4;

	public double getObjem() {
		return Math.pow(strana, 3);//staticka metoda power; da sa urobit aj manualne return (strana * strana * strana); 
		//pow() vnutri 1. input je strana, druhy je mocnina
	}

}
