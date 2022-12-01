package sk.itlearning.java2.e.override;

public class DveKocky extends Kocka {//public metoda verejna , static metoda je globalna a volatelna. Typ void je nedefinovany - moze byt hocaky - primitivna hodnota (1, text) alebo premenna

	@Override//musime prepisat metodu inak nam zdedi z Kocka tu povodnu kde sa pocita objem iba 1 kocky. Nemusi tu byt napisany, je to 
	//dodatocna informacia kompilatoru ktory je nacitavac/ import tried, ze ideme prepisovat metodu. Ak ju tam dame, kompilator overi ci sme spravne napisali meno a parametre metody na kt sa odkazujeme a ked nie vyhodi error hlasenie na nasu orientaciu v com je chyba
	public double getObjem() {
		return super.getObjem() * 2;// nemozeme napisat iba: return getObjem() * 2; lebo trieda vie zavolat samu seba, tj metoda *2 vynasobi dvoma nadtriedu kt nema vysledok
		//metoda ma na disku vyhradene miesto v casti ram Stack. Ale zavolanim samej seba vytvori extra ine miesto na disku, superclassovy*2, nie vnorenej metody*2
	// REKURZIVNA METODA - zavola samu seba sa v praxi pouziva napr pri vypocte faktorialu
		//super. zavola metodu getObjem() z triedy Kocka, nie z triedy DveKocky
		
		public double getObjem(double strana) {
		System.out.println() //je vela verzii metody print - pre vstup string / boolean, integer atd. To su tzv pretazene metody, kt ponukaju viac preddefinovanej verzii metodz podla typu vstupu. Pomocka aby sme nemuseli konvertovat 1 typ vstupu na druhu pri kazdej novej metode
		}
		
		static public long faktorial(int n) {
			if (n==0) {//faktorial 0 je 1, tam nech vyhodi 1 hodnotu a potom dopocita vacsie faktorialy
				return 1;
			}
			return n* faktorial(n-1);// tri faktorial: 3! = 3x2! = 3x2x1! = 3x2x1x0! = 3x2x1x1  0faktorial je 1
		}
	}

}
//