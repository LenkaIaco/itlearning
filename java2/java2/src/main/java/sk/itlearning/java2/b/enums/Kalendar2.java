package sk.itlearning.java2.b.enums;

public enum Kalendar2 {//enum je spec.typ triedy kde mozem na zaciatku jednoduchsie vymenovat mesiace: Januar, Februar, ..December;
	
	Januar("Priemerna teplota pre Januar su 2 stupne"),
	Februar("Priemerna teplota pre Februar su 3 stupne"),
	Marec("Priemerna teplota pre Marec je 8 stupnov"),
	April("Priemerna teplota pre April je 13 stupnov"),
	Maj("Priemerna teplota pre Maj je 18 stupnov"),
	Jun("Priemerna teplota pre Jun je 22 stupnov"),
	Jul("Priemerna teplota pre Jul je 27 stupnov"),
	August("Priemerna teplota pre August je 26 stupnov"),
	September("Priemerna teplota pre September je 18 stupnov"),
	Oktober("Priemerna teplota pre Oktober je 10 stupnov"),
	November("Priemerna teplota pre November je 6 stupnov"),
	December("Priemerna teplota pre December su 2 stupne");

	private String priemTeplota; //pomocna premenne

	private Kalendar2(String priemTeplota) {   // konstruktory. napisal som vlastny konstr.s1 parametrom, java na pozati skonstruuje objekt typu kalendar. Pri konstrukcii nveho obj treba pri premennych konstantach hore okrem mena mesiacov pridat aj jej previazanu hodnotu v ()
		this.priemTeplota = priemTeplota;
	}

	public String getPriemTeplota() {   // metody. public getter urobim aby som sa dostala k tej previazanej hodnote premennej. Potom pokracujem v SwitchEnum2 triede vid
		return priemTeplota;
	}

}
