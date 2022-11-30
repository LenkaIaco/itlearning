package sk.itlearning.java1.f.rozmienacka;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rozmienacka {

//	public static int[] rozmenSumu(double suma) najprv bolo a potom sme zmenili 
	public static int[] rozmenSumu(BigDecimal suma) {

		// inicializacia poctu vydanych bankoviek na 0
		int[] vydavok = new int[15];//vytvor pole o 15 prvkoch, tupu int su automaticky 0 ak nedefinovane 

		// inicializacia jednotlivych typov bankoviek
		double[] nominal = new double[] { 500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

		// vypocet vydavkov, ktory sme mali najprv
//		for (int i = 0; i < nominal.length; i++) {
//			while (suma >= nominal[i]) {//ak je suma vacsia ako 500 .. .doubleValue sme pridali dodatocne aby sme vedeli vykonat operaciu matem. >= lebo inak by sa s objektom suma ako takym nedala robit matematika
//				vydavok[i]++;//..tak vydaj este dalsiy 500 bankovku(inak ide na dalsi v rade i, cize 200 bankovku
//				suma -= nominal[i];//rovnake ako suma = suma - nominal i. Zapiseme novu hodnotu do pamate odpocitanim vydanych bankoviek
//				//kedze v Main nam chyba 1 cent pridame riadok println aby sme zistili co sa stalo:
//				System.out.println(suma);//potom v Main dame run a uvidime ako pise Java zvysok sumy po odpocitani aktualne vydanej bankovky v cykle. Pridava tam dalsie desatinne miesta pri kazdom cykle.
//				//aby stacilo 8 bytov na cislo tak pocitac urobi auto transformaciu zvysnej hodnoty co sa nezmesti na 0y a 1ky; a potom to transformuje naspat pri dalsom pouziti. Transformuje sa na baze nekonecnych radov v matematike aby sme dosahovali vysoku presnost, ale v praxi nie su tie rady nekonecne a tak na urcitom desatinnom mieste presnost konci, zaokruhli pocitac. A potom ked transformuje zaokruhlene cislo v 0 a 1 kach naspat na presne cislo tak tam uz neni rovnaky vysledok. Lebo ked je primitivny datovy typ doble tak uz pc nema kam dalej zaokruhlovat viac ako je uz to cislo definovane. Preto sa pouziva zriedka
//			}
		for (int i = 0; i < nominal.length; i++) {
			while (suma.doubleValue() >= nominal[i]) {//ak je suma vacsia ako 500 .. .doubleValue sme pridali dodatocne aby sme vedeli vykonat operaciu matem. >= lebo inak by sa s objektom suma ako takym nedala robit matematika
				vydavok[i]++;//..tak vydaj este dalsiy 500 bankovku(inak ide na dalsi v rade i, cize 200 bankovku
				suma =suma.substract(new BigDecimal(nominal[i]));//rovnake ako suma = suma - nominal i. Zapiseme novu hodnotu do pamate odpocitanim vydanych bankoviek
				//kedze v Main nam chyba 1 cent pridame riadok println aby sme zistili co sa stalo:
				//suma = suma.setScale(2);//zaokruhlime na 2 desatinne miesta. NEPOUZIVAT! Lebo ked sa zaokruhli tak cislo nepojde na viac desatinnych miest pocas cyklu a nezistime ze zaokruhlenie na 2 des. je nepresne - lebo zaokruhlovacie metod je vela a system nevie ktoru kto pouziva a tam moze dojst v praxi k diskrepancii
				suma = suma.setScale(2, RoundingMode.HALF_UP) //namiesto toho hore vzdy pri zaokruhlovani povieme akou metodou zaokruhlovania chceme pracovat a vyhneme sa buducim diskrepanciam
				System.out.println(suma);//potom v Main dame run a uvidime ako pise Java zvysok sumy po odpocitani aktualne vydanej bankovky v cykle. Pridava tam dalsie desatinne miesta pri kazdom cykle.
				//aby stacilo 8 bytov na cislo tak Java automaticky to dakde potom prekonvertuje hodnotu na 0 a 1 cisla a pri pocitani s hodnotou potom spatne prekonvertuje na cislo. A pri tejto konverzii potom vznikaju nepresnosti pri zaokruhlovani, koli tomu ze sa pouzivaju pri konverzii nekonecne matematicke rady koli co najvyssej presnosti desatinnych miest; v praxi ale nie su tieto rady nekonecne a potom v urcitom desatinnom mieste nastava zaokruhlovanie a potom pri konverzii nam vychadzaju trochu ine cisla
		}

		return vydavok;
	}

}
