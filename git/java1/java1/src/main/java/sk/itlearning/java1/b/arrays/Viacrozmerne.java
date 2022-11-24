package sk.itlearning.java1.b.arrays;

class Viacrozmerne {

	public static void main(String[] args) {

		String[][] names = { { "Mr. ", "Mrs. ", "Ms. " }, { "Smith", "Jones" } }; //pole v poli. Kazdy prvok pola je pole samo o sebe. tento ma 2 polia

		System.out.println(names[0][0] + names[1][0]); //names 0 0 je Mr. names 10 je Smith

		System.out.println(names[0][2] + names[1][1]);

		System.out.println();

		for (String[] cc//(riadok) : names) { //pomocna premenna pole String, ma premenne cc(riadku), vv, odkazuje sa na
			for (String vv : cc //(prvok1 z names) {
				System.out.println(vv//("Mr."));
			}
		}
int[] zoznam = {3, 5, 10};
boolean vysledok = Vyhladavac.obsahujeCislo(10, zoznam);/// napravo od = odkaz na public metodu z vyhladavac.java . nalavo od = vysledok metody si ulozim do premennej
	}

}