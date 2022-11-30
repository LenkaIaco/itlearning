package sk.itlearning.java1.f.rozmienacka;

public class Main {

	static double[] nominal = new double[] { 500.00, 200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01 };

	public static void main(String[] args) {//ma vypocitat velku sumu ako bankomat vyda s co najmensim poctom vbankoviek (kolko krat 500.00 kolko krat 200.00 ... az na centy 0.05, 0.02, 0.01

//		double sumaA = 1857.50;
//		int[] resultA = Rozmienacka.rozmenSumu(sumaA);
//		vypisVysledok(resultA);

		double sumaB = 1857.58;//toto ak by sme spustili tak by mi v console chybal 1 cent pri 0.01 by bolo 0krat
		int[] resultB = Rozmienacka.rozmenSumu(sumaB);//tuto ked v Rozmienacke zmenime na bigDecimal double cislo, musime zmenit sumu na:  new BigDecimal(sumaB)
		vypisVysledok(resultB);
	}

	private static void vypisVysledok(int[] vydavok) {
		for (int i = 0; i < nominal.length; i++) {//nominalna hodnota bankovky 500.00 je 500
			System.out.println(nominal[i] + " - " + vydavok[i]);//vydavok je pocet vydanych bankoviek (3 je ze 3 x 500)
		}
	}

}
