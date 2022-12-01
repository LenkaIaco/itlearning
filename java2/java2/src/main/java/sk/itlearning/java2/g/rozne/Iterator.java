package sk.itlearning.java2.g.rozne;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {

		List<Integer> cisla = new ArrayList<Integer>();//<> je tzv genericita, dnu urcime typ prvkov. Int - mozme pridavat iba cele cisla do zoznamu
		//List<> cisla = new ArrayList(); aj to mozme urobit, nevyhodi chyba, iba upozornenie. Potom do array mozme strcit akykolvek typ objektu a to vedie v praxi k chybam, cize nikdy to nerobime
		//v JavvaScript sa to da urobit a preto sa v praxi pouziva jeho nadvarianta TypeScript, ktory ma updatovane pravidla pre genericitu
// list je nacastejsie pouz trieda lebo zoznamy su vsade; spolu s triedou String lebo texty su vsade
		cisla.add(1);
		cisla.add(2);
		cisla.add(3);

//		Historicke ZACIATKY ITERATORA:
//		Iterator i = cisla.iterator(); to nemozme definovat lebo by nam pod iterator auto-naslo integer nie javovsku metodu iterator:
		java.util.Iterator<Integer> i = cisla.iterator();

		while (i.hasNext()) {//ked tento iterator raz uz pouzijem, v 2.czkle ho uz nemozme pouzit, tj je osetrene ze nejaky cyklus sa nezopakuje 2x;
			System.out.println(i.next());
		}

		//historicky nasledujuce typy iteratorov:
//		1. 
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		
//		2.
//		for int j = 0; j < args.length; j++
//				for int cislo: cisla
		
		//3.v praxi sa pouziva dnes uz vacsinou:
//		cisla.forEach(c -> System.out.println(c));
//		alebo este zjednodusenejsie:
//		4.
		cisla.forEach(System.out.println(c));
	}

}
