package sk.itlearning.java1.d.primitives;


public class PrimitivneTypy2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		byte bmax = 127; // (2 na 7) - 1

		short smax = 32767; // (2 na 15) - 1

		int imax = 256 * 256 * 256 * 128 - 1; // (2 na 31) - 1; ak dame vacsi tak to uz java vidi ako integer (defould type Javy ak not specified) java sa pokusa na auto-koverziu int na byte a ak to nevyjde tak ukaze nejaku nespravnu hodnotu v konzole
		System.out.println("int_max = " + imax);

		long lmax = 1024l * 1024 * 1024 * 1024 * 1024 * 1024 * 8 - 1; //ak dame za 1024 l je ze chceme explicitne 8 bytovu hodnotu. Vysledok sa potom prisposobi najvacsiemu typu z rovnice, cize nehodi java integer automaticky ako vysledok ale long
		System.out.println("long_max = " + lmax);

		float f1 = 5; // na pozadi zmeni Java integer 4bytovy na 4 bytovy float a priradi ho, to neni problem. Desatinne c. je automaticky videne Javou ako double.
		System.out.println(f1);

		float f2 = 5.555f;//ak by bolo iba 5.555 tu by sa nedalo 4 bytovy int na 8 bytovy float auto-skonvertovat Javou, treba dat priponu f a indikovat tym ze ma Java vidiet cislo ako to 8bytovy float
		System.out.println(f2);

		double d1 = 5;
		System.out.println(d1);

		double d2 = 5.0;
		System.out.println(d2);

		char cmin1 = 0;//2 bytovy je char a iba klad.hodnoty
		char cmin2 = '\u0000';//zapisana 0 z 16-kovej sustave, skoro nikdy nepouzivame

		char cmax1 = 65535;
		char cmax2 = '\uffff';

		// znak @
		// 0*16na3 + 0*16na2 + 4*16na1 + 0*16na0
		char at = 64; //zavinac v 4kovej(?)sustave
		at = '\u0040'; // zavinac v 16kovej sustave. Hodnoty v apostrofoch sa nekonvertuju na hodnoty ale tak ako ich zapisem medzi apostrofy tak budu ulozene
		at = '@';//priamo zapisany zavinac
		System.out.println(at);
		
		boolean bol = false;
		System.out.println(bol);
	}

}
