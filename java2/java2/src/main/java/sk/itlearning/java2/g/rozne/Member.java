package sk.itlearning.java2.g.rozne;

public class Member {

	// 1 clenske premenne
	int a;
	private static int b;
//private static int b = 12  ak priradzujeme hodnotu do statickej premennej mozme to dat do inicializacneho bloku stat. premennych vid dole
	
	// 2 clenske metody
	void a() { }

	static void b() { }

	// 3 konstruktory
	public Member(int x) {
		super();
		a = x;
	}

	@SuppressWarnings("unused")
	private Member() {
		super();
	}

	// 4 vnorene triedy - v praxi iba podla potreby, velmi zriedka sa pouziva
	// vnorena nestaticka - inner class
	class X {
		void test() {
			System.out.println("Print variable a from inner class Member.X : " + a);
			System.out.println("Print variable b from inner class Member.X : " + b);
		}
	}

	// vnorena staticka - static nested class
	static class Y {
		void test() {
			System.out.println();
			System.out.println("Print variable b from static nested class Member.Y : " + b);
		}
	}

	// 5 inicializacne bloky - tiez staticke a nestat.
	{
		a = 8;//nestaticky inicializacny blok. Ak sa opakuje pri inicializacii roznych nestatickych objektov vnutri rovnaky kod mozem spolocne hore inicializovat vsetky a dnu dat raz ten kod. Tiez sa pouz.zriedka
	}

	static {//staticke inic.bloky sa v praxi pouzivaju casto. 
//		b = 5;
//		 mozme napisat: 
	String username = System.getenv("USERNAME");// - vypluje premennu operacneho systemu username, jej hodnotu, kto zrovna pouziva pc
	String user;
	if (username != null) {
		user = username;
	}else { user = "UNKNOWN";
	}
	
	
	}

}
