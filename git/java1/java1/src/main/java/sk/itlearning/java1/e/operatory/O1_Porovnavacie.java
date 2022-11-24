package sk.itlearning.java1.e.operatory;

import sk.itlearning.java1.g.zakaznik.Firma;

public class O1_Porovnavacie {

	// == != > >= < <=
	public static void main(String[] args) {

		// vysledkom porovnania je logicka (booleanovska) hodnota true alebo false
		int a = 5;
		int b = 5;
//porovnavacie operatory maju vysledok boolean(true/false) pri operacii s vyrazmi je vysledok vzdy true/false: to je akokeby sme napisali
		//boolean result = a == b; 
		// System.out.println(result);
		
		
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		String s1 = "text";//premenna typu string
		String s2 = new String("text"); //String s2 = "text"; ked vypustime konstruktor, to je skor vynimka. Mozme to v 2 pripadoch, 1 je pri textoch
		//ak nedame, java vytvori automaticky novy objekt za nas a priradi ho k s1 lebo pri vybudovani objektu pozera ci "text" typu string uz niekde existuje a ak hej priradi ho k rovn.obj.z dovodu setrenia pamate
		// ak dame new String pri S2 ak ich ulozi ako 2 rozne obj.s rovn textom. String je v skutocnosti typu Integer a ma svoje unique integer ID pri storage v pamati, cize ak su s1 a new s2 tak s1==s2 porovna ID oboch a return je false
		//ak mame triedu/metodu v inom dokumente zadefinovanu, klikneme F3 a zavedie nas to do dokumentu s definicou tejto metody(neviem ci musi byt otvoreny vtedy abo nie)
		System.out.println(s1.equals(s2)); ///to iste ako System.out..(s1 ==s2);
		
		Firma f1 = new Firma("11", "f");
		Firma f2 = new Firma("11", "f");
		
		System.out.println(f1.equals(f2));//equals znamena ci sa obsahovo rovnaju. ale musime ho spravne syntakicky napisat.
		//

	}
//firma.java s prepisanym equals:
//	musime prepisat zadefinovanu metodu equals v dokumente firma.java:
	/*
	 *zmenime @Override 
	 *public boolean equals(Object obj){
	 *if obj instanceof Firma) {
	 *1. bud 
	 *return this.ico == (Firma)obj).getIco(); // musim pretypovat firmu na objekt. Aby boli identicke, musia sa rovnat nielen obsahovo al kazdou inou vlastnostou, aj typom.
	 *ak by jedno ico obsahovalo null tak sa neda porovnavat, musi mat nejaky obsah najprv, inak dostaneme NullPointerException chybove hlasenie
	 *
	 *2. alebo toto ale v praxi si to radsej na 1 mieste zadefinujeme a nevypisujeme manualne kazdy raz
	 *Firma f = (Firma)obj;
	 *return Objects.equals(this.getIco(), f.getIco()) && Objects.equals(this.getnAZOV()f.getNazov())}
	 *return false;
	 *}
	 */
}
