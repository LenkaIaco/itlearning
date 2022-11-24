package sk.itlearning.java1.g.zakaznik;

public class Main {

	public static void main(String[] args) {

		Obcan o1 = new Obcan("11", "Peter");
		Obcan o2 = new Obcan("22", "Jano");

		Firma f1 = new Firma("12345678", "Orange");
		Firma f2 = new Firma("12345679", "Eset");

		Object[] pz = { o1, o2, f1, f2, new Obec() };

		for (Object o : pz) {
			if (o instanceof Obcan) {
				Obcan ob = (Obcan) o;
				System.out.println(ob.getRodneCislo());
			}
			if (o instanceof Firma) {
				Firma f = (Firma) o;
				System.out.println(f.getIco());
			}
		}
		
		Zakaznik[] pzz = { o1, o2, f1, f2, new Obec(),  };
		
		for (Zakaznik z : pzz) {
			System.out.println(z.getId());
		}

	}

}
