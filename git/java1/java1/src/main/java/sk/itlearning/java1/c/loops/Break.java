package sk.itlearning.java1.c.loops;

class Break {
	public static void main(String[] args) {

		int[] arrayOfInts = {2, 3, 5, 7, 9, 12, 17, 29, 45};

		int searchFor = 12;

		int i; //ak by som nedefinovala premennu i pred for cyklom, ale vnutri prveho riadka for: for (int i=0 , tak by som ju nemohla vyuzit dalej v inych cykloch lebo ju program nepamata v RAM a zahodi ju hned ako skonci for cyklus

		boolean foundIt = false;

		for (i = 0; i < arrayOfInts.length; i++) { // zacinam for (i = 0, ak mame uz hore preddefinovane i, tak uz nedavame dnu sem do zatvorky for(int i, lebo to je duplicita, akoby sme 2x rozne premenne int i zadefinovali
			if (arrayOfInts[i] == searchFor) { //postupne mi porovnavaj prvky 1 2 i++ v Array ci su rovnake ako moje hladane searchFor
				foundIt = true; // ak sme premennu nasli uz v strede Array, dajme potom break aby zbytocne nedobiehal cyklus a hladal ju dalej v tom Array-i
				break;
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchFor + " at index " + i);
		} else {
			System.out.println(searchFor + " not in the array");
		}

	}

}

/*verzia 1 
 * int[] arrayOfInts = {2, 3, 5, 7, 9, 12, 17, 29, 45};
 * int hladaneCislo = 12;
 * boolean nasloSa = false;
 * //for (int cislo : arrayofInts) {
//if(cislo == hladaneCislo) {
//System.out.println("Ej ty ty")
 */

/*
 * verzia 2 
 * for (int cislo : arrayofInts) {
 * if if(cislo == hladaneCislo) {
 * nasloSa = true;
 * }
 * }
 * 
 * if (nasloSa){ //ak tam ostala hodnota false tj nenaslo sa hladane cislo v Array,
 * System.out.println(HladaneCislo + " sa naslo v zozname"); //zluci to do jedneho textu, java si HladaneCislo zmeni na text a potom to cele println vypise
 * }else {
 * System.out.println(HladaneCislo + " sa nenaslo v zozname");
 * }
 */


String vysledok = Vyhladavac.obsahujeCislo(searchFor, arrayOfInts); //nemozem si vysledok metody z triedy Vyhladavac.java odlozit do string premennej, lebo metoda ma vystup boolean. Upravime string na boolean
boolean vysledok = Vyhladavac.obsahujeCislo(searchFor, arrayOfInts);

/// boolean vysledok = Vyhladavac.obsahujeCislo(searchFor, arrayOfInts);

//na nestatickej triede sa odkazem akoby iba na objekt: z1.printID();  */// a ob si vytvori vlastny objekt a triedu v RAMke. ak sa takto odvolavam na objekt z1 s metodou. tak mi vuhlada hodnotu, lebo automaticky vytvori v objekte jeho vlastnu nestaticku metodu
//na statickej Triede nemoze vytlacit: Zakaznik.printId(); lebo tam nemam objekt z kt. vytiahne hodnotu. musim jej ho definovat :
// Zakaznik.printId(z1.id); ale to sa nerobi lebo naco potom vyhladava automaticky ked jej ho musime odovzdat. robime rovno z1.printID()
/* ked mam staticke metody nemusim odovzdavat objekty automaticky najde. Ak nemam staticku musim vytvorit novy objekt aby mala svoju vlastnu iba vnutorne v objekte pouzitelnu metodu.



