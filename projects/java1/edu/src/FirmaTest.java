
public class FirmaTest extends Zakaznik{
private String ico; // private udaj tak sa nanho nemozem odkazovat priamo v inej class, ale cez public metodu getico*vid dole
private String nazov;

public Firma(String ico, String nazov) {
//	super();
	this.ico = a; //this: NIE premenna String ico z triedy, ale len lokalne ico tejto metody
	this.nazov = b;
}
}

public void string getICO() { //nova metoda
this.ico = ico;	//rozlisim objekt ico v metode od String ico v class FirmaTest 
}

//inak ak by nebola private ICO, tak by sme napisali
public String getIco() {
	return ico;
}


public void setICO (String ico) {//
	if (ico.length() == 8) {
		this.ico = ico
	}
	else throw new IllegalArgumentException("ico musi mat 8 znakov") // dostaneme RuntimeError - indikaciu ze zakaznik pouzil metodu zle
}

public String getRodneCislo() {
	return nazov;
}

