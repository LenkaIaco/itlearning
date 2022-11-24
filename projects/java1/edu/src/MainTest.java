//prepojene s FirmaTest.java
public class MainTest {
	
	
	public static void main(String[] args) {
	Firma f1 = new FirmaTest("abcdefgh", "Eset");//firma class je v separ doc
	///f1.ico = "00000123"
	Firma f2 = new FirmaTest("abcdefgi", "Ornge");
	
	Obcan o1 = new Obcan("1243/1234", "Peter");
	
	Firma[] firmy = {f1, f2} // mozem urobit objekt iba pre podobjekty typu f
	Object[] zakaznici = {f1, f2, o1, o2} //da sa ale urobit aj taky kombinovany objekt a stale mat ho prehladny vdaka dedicnosti, kt definujem na urovni podobjektu o alebo f
	// mozem definovat podtypy nadobjektu Object
	// specialna java trieda preddefinovana javou Object: kazde co je vlozene do nej je automaticky podobjekt
	for (Object o : zakaznici) {
		//o.equals( ) //vsetky o. objekty v Object su: f1 f2 o1 o2
		if (o instanceof Firma){//Predtym ako pretypujem najprv overime ci objekt je typu Firma
		Firma f = (Firmma)o; //pretypovat f ako podobjekt aj o ako podobjekt. 
		System.out.println(f.getICO());
	}
		if (o instanceof Obcan){//Predtym ako pretypujem najprv overime ci objekt je typu Firma
			Obcan f = (Obcan)o; //pretypovat f ako podobjekt aj o ako podobjekt. 
			System.out.println(f.getRodneCislo());
	}
	
	f1.setICO("abcdefgh"); //metoda z triedy FirmaTest
	System.outPrintln(f1.getICO)
	}
}
	Object[] LepsiZakaznici = {f1, f2, o1, o2, new Obec()} //ak ma trieda obec hore zadefinovane public class Obec EXTENDS Zakaznik, da sa dodatocne pridat ako podtrieda Object-u
	for (Zakaznik z: (lepsizakaznici) {
	system.out.println(z.getId());
	}
}

public static void main(String[] args) {
Obcan o = new Obcan("111/111", "");//firma class je v separ doc
///f1.ico = "00000123"
o.setRodneCislo("21354654654"); //metoda z triedy FirmaTest
System.outPrintln(f1.getRodneCislo)
}

}

