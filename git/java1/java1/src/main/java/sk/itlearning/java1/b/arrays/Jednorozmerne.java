package sk.itlearning.java1.b.arrays;

/**
 * Tried v ktorej sa demonstruje zakladna praca s poliami
 * 
 * 
 * 
 * @author ladicky
 *
 */

public class Jednorozmerne {

	public static void main(String[] nazov) {

		
		// inicializacia pola sposob 1/ urcenim poctu prvkov
		System.out.println("// inicializacia pola sposob 1/ urcenim poctu prvkov");
		int[] p1 = new int[5]; //ma 5 poli nas objekt
		Zakaznik[] = zoznamZakaznikov = null; //v tabulke zakaznik pole(objekt) zoznam zakaznikov. 2. krok by bol  = namiesto null = newZakaznik[10000] potom bude mat 10000 poli. Nebezpecne robit hned velke pola lebo zaberaju vela miesta v RAM
		//su 2 typy objektov : primitivne hodnoty a referencie na premenne

		for (int i = 0; i < p1.length; i++) {
			System.out.println(p1[i]);
		}

		// inicializacia pola sposob 2/ s pouzitim konstruktora a vymenovanim prvkov
		System.out.println("// inicializacia pola sposob 2/ s pouzitim konstruktora a vymenovanim prvkov");
		int[] p2 = new int[] { 1, 2, 3, 4, 5 }; //datovy typ int

		// klasicky for cyklus
		for (int i = 0; i < p2.length; i++) {
			System.out.println(p2[i]); //ak by bolo <= p.lenth, dostali by sme chybu lebo zacina od nuly po 4 (5 miest). Aj chyba je akoby vytvoreny objekt Javou kt nevie ako definovat podla zadania, co obsahuje daku diskrepanciu
		}

		// inicializacia pola sposob 3/ vymenovanim prvkov, bez pouzitia konstruktora
		System.out.println("// inicializacia pola sposob 3/ vymenovanim prvkov, bez pouzitia konstruktora");
		int[] p3 = { 6, 7, 8, 9 };

		// enhanced for cyklus
		for (int i : p3) { //pomocna premenna i, bud cislo(int) alebo text (string)
			System.out.println(i);
		}

	}

}
