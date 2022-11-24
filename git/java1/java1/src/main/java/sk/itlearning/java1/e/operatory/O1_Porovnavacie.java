package sk.itlearning.java1.e.operatory;

import sk.itlearning.java1.g.zakaznik.Firma;

public class O1_Porovnavacie {

	// == != > >= < <=
	public static void main(String[] args) {

		// vysledkom porovnania je logicka (booleanovska) hodnota true alebo false
		int a = 5;
		int b = 5;

		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		String s1 = "text";
		String s2 = new String("text");
		
		System.out.println(s1.equals(s2));
		
		Firma f1 = new Firma("11", "f");
		Firma f2 = new Firma("11", "f");
		
		System.out.println(f1.equals(f2));

	}

}
