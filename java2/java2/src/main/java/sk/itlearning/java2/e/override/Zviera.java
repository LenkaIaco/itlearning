package sk.itlearning.java2.e.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Zviera {

	Zviera urobNieco() {//neoznacena metoda je typu package-private. Navratovy Typ je Zviera, dole v kode vytvori novy obj Zviera
		System.out.println("som zviera");
		return new Zviera();
	}

	void urobNieco(Zviera x) throws IOException {//neoznacena metoda je typu package-private Navrat.tyop je void, nic nevytvori v kode
		System.out.println("som zviera s parametrom");
	}

	public static void main(String[] args) {
		Zviera z = new Zviera();
		Pes p = new Pes();
		Zviera zp = new Pes();//objekt pes mozme ulozit do premennej zviera alebo class Pes extends Zviera
		z.urobNieco();// vystup som zviera
		p.urobNieco();// volam iba metodu zo Pes. empy input - volam metodu 1 z pes
		z.urobNieco(z);//class zviera metoda s parametrom zviera x
		p.urobNieco(p); //class pes s parametrom pes - tretia v psovi
		p.urobNieco(zp); //class pes s parametrom zviera - druha v psovi
		zp.urobNieco();//bez premennej, to hlada v z aj p triede, najde v p triede prepisanu prvu bez parametrov
		zp.urobNieco(z);// premenna zviera , to iste, java runtime najprv hlada v superclass potom v subclass najde v p prepisanu druhu
		zp.urobNieco(p);//zp je typu zviera, jej signatura je zviera-pes(class+input) tj neni to tretia metoda v psovi, lebo ta ma signaturu pes-pes. Je to zo super class druha metoda
		zp.urobNieco(zp);//zp je typu zviera, jej signatura je typu zviera, zase druha zo superclass sa pouzije
	}
}

class Pes extends Zviera {

	public Pes urobNieco() {//ked prepisujeme metodu musi mat rovnaku alebo vacsiu viditelnost - mozem rozsirit package-private na public, ale nemozem ju zuzit na private. Alebo dam rovnaku ako superclass: package-private
		//navratovy typ musi byt rovnaky ako pri superclass kt overriduje - Pes
		System.out.println("som pes");
		return new Pes();
	}
//v zdedenej triede, file apod sa da prepisovat cez Override, lebo su kompatibilne, to je princip dedicnosti
	public void urobNieco(Zviera x)throws FileNotFoundException {//je to override lebo navratovy typ PEs mozem zmenit lebo je kompatibily podtyp so super-triedou ale signaturu nie; error message mozem specifikovat ako FileNotFoundException lebo je potomokIOException. Naopak to nejde, nemozem na super-exception prepisat. Alebo nenapisem ziadnu to sa tiez da
		System.out.println("som pes zviera");
	}

	void urobNieco(Pes x) {
		System.out.println("som pes pes");
	}

}