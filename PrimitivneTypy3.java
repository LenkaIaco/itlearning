package sk.itlearning.java1.d.primitives;

public class PrimitivneTypy3 {

	public static void main(String[] args) {

		// implicitne (automaticke) pretypovanie int -> byte
		byte b = 127;

		// implicitne pretypovanie byte -> int
		int i = b;// 1 bytovy byte sa da prekonvertovat automaticky do int lebo byte ma 1byt velkost a int 4 tak sa zmesti
		System.out.println(i);

		// explicitne (manualne) pretypovanie (musime zvazit pretecenie)
		b = (byte) i; //ak nedame () tak urobi chybu lebo 4 bytovy integer nemozes auto-skonvertovat na byte. Treba manualne prekonvertovat so zatvorkami
		//ak by sme manualne prekonvertovali vacsie cislo ako sa zmesti bytovo do b tak neukaze cely vysledok ale cislo odsekne pri cislici kdde sa uz nezmesti

		// implicitne pretypovanie double -> float nefunguje
		float f = 5.0f;

		// implicitne pretypovanie float -> double
		double d = f;

		// implicitne pretypovania pri operaciach
		System.out.println(10 / 3.0);//v zatvorke sa deje auto konverzia vysledok bude double lebo vacsi z rovnice je double
		System.out.println(i + d);//tu bude vysledok integer

		// od java 7 mozme pouzit oddelovac tisicov. Do Javy 8 vychadzali nove java verzie ak mali len nieco zasadne nove. Toto je z jAVy 7 novinka
		System.out.println(9_876_543);//pre prehladnost sa da velke cislo oddelit podtrznikmi a stale to vidi ako nase cislo
	}

}
