package sk.itlearning.java1.e.operatory;

public class O5_Ternarny {

	private static String s1 = "hello";
	private static String s2 = "world";

	public static void main(String[] args) {

		if (s1 == null) {
			s1 = "null";
		} else {
			s1 = s1.toUpperCase(); ///bez porovnavania sa premenne s hodnotou null nedaju pouz v metodach napr samo stojace System.out...(s1.toUpperCase());
			// s1 != null ? s1.toUpperCase : "s1 
		}
	
		System.out.println(s1);

		// uvedeny zapis mozme zjednodusit pomocou ternarneho operatora
		s2 = s2 == null ? "null" : s2.toUpperCase();
		
		System.out.println(s2);
		
		// vysledok ternarneho operatora musime pouzit !!!
		
		//pri lokal premennych plati ze v case pouzitia musia mat hodnotu. Pri premennych tried na kto sa odkazujeme medzi triedami to neplati, lebo nechceme Arrays definovat s nejakou nepravou hodnotou. Iba pri lokalnych premennych
		/*
		 * String S3; 
		 * System.out.println(S3); vrati error. musim dat String S3 = null; aspon
		 */
		
	}

}
