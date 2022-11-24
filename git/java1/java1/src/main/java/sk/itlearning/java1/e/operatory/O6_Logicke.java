package sk.itlearning.java1.e.operatory;

public class O6_Logicke {

	private static String s1 = "halo";
	private static String s2;

	public static void main(String[] args) {

		// logicka spojka A (AND) (neskratene vyhodnocovanie - vyhodnocuju sa vzdy vsetky casti vyrazu v podmienke)
		if (s1 != null & s1.length() > 0) { // na tomto riadku programu moze nastat chyba
			System.out.println(s1.toUpperCase());
		} else {
			System.out.println("s1 je null");
		}

		// logicka spojka A (AND) (neskratene vyhodnocovanie - vyhodnocuju sa vzdy vsetky casti vyrazu v podmienke)
		if (s2 != null & s2.length() > 0) { // na tomto riadku programu moze nastat chyba. Skratene vyhodnocovanie s && miesto %& je mozne v Java aj C: ak vyjde v prvej podmienke uz false, nevyhodnocuje dalej
			System.out.println(s2.toUpperCase());
		} else {
			System.out.println("s2 je null");
		}

	}

	byte c = 2;
	byte c = b*2;//b*2 a dva je def ako Integer v Jave co je vacsie v pamati ako byte, tj vyhodi error
	byte c = byte (b*2) //teraz nevidi 2 ako integer lebo sa prekonvertuje na byte a funguje rovnica
			
			b<<=1; //byte je v 8 polickach 0 a 1 ulozeny. toto posunie kod o 1 policko dolava.
	// 00000010 je dvojka. ak urobime <<=1 tak sa  stane 00000100 6ka z toho (2*2*2). V praxi to ale zvacsa netreba, pokial sa neoptimalizuju programy vyvojarmi aby rychlejsie pracovali.
	
	
}
