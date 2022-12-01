package sk.itlearning.java2.g.rozne;

public class VarArgs {//syntakticka pomocka bez kt by java nemohla exist. 

	public static void main(String... args) {//som prepisala main metodu dolnou konstruckiou, kde mame
		System.out.println(sucetNcisiel(1, 2, 3, 4));//tu ked neodovydam ziadne hodnoty vrati nula. inak vsetky co odovzdam spolu scita.
	}

	static private int sucetNcisiel(int... x) {//mozem metode odovzdat 0 az n cisel. Ked takto zavolam metoduy. Inak v bez.volani musis fixed amount of integers odovzdat. Tj s premennou int mozem tu pracovat ako s polom kt bude bud prazdne alebo bude mat moj urceny pocet hodnot
		//int... x znamena ze vsetky argumenty zadane nami, nech su typu x: System.out.println(sucetNcisiel(1, 2, 3, 4)) vsetky cisla 1234 su typu x
		//mozem mat input aj (double y, int ...x) - nemozem to dat na koniec double lebo syntax je taka ze java nezisti ktore z cisel(args) ma pod aky typ var args priradit(ak mam 3 args a definujem ze vsetky su x okrem posledneho co je double, to nerozpozna java lebo nevie ci myslim posledne 1 double urobit alebo posledne 2 argumenty urobit double. ale ked dam na zaciatok double, tak je naprogramovana tak ta syntax ze len prve cislo z argumentov bude double a vs.ostaatne x
		int result = 0;
		for (int i : x) {
			result += i;
		}
		return result;
	}

}
