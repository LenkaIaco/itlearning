package sk.itlearning.java1.h.modifikatory1;

@SuppressWarnings("unused")
public class TriedaPublic { //cely nazov triedy prave tlacitko a Copy Qualified name

	private String premennaPrivate;

	String premennaPackage;//neoznacena trieda/premenna je automaticky package private

	public String premennaPublic;

	protected String premennaProtected;//premena nefunguje v inom package, pristup ma iba potomok tejto triedy. Vyuzivame zriedka.

}
