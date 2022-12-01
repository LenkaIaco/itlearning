package sk.itlearning.java2.g.rozne;

public class Wrapper {

	public static void main(String[] args) {

		// Unboxing
		Integer integer1 = 7;//trieda Integer; primitivny typ premennej int; Trieda Short - short, double, float, boolean, char - to su vsetko wrapper triedy pre tieto typy hodnot, su medzi sebou 100% kompatibilne
		int a = integer1;
		System.out.println(a);//vybalime primitivne cislo z krabice(objektu)

		// Autoboxing
		Integer integer2 = 5;//automaticky java zaboxuje integer s hodn.5 do objektu
		System.out.println(integer2);

		// Metody vo Wrapper triedach
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.valueOf("50"));

	}

}
