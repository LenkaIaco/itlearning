package sk.itlearning.java2.f.staticfinal;

import java.math.BigDecimal;

import sk.itlearning.java2.a.db.Obcan;

public final class Final extends FinalParent {

	
	public static final float PI = 3.14f;
	public static final Obcan rudo = new Obcan("1", "Rudo");

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// nemozno priradit do (zmenit hodnotu) premennej, ktora je final
		System.out.println(PI);
//		PI = 3.15f;

		Obcan peter = new Obcan("2", "Jozo");
		// nemozno zmenit referenciu final premennej (aby ukazovala na iny objekt)
//		rudo = peter; //do premennej co je final nemozme nic nove priradit; ma jednu referenciu v pamati priradenu ze final premenna ukazuje na objekt x. Ale ten objekt x vnutri mozme premenit
		//mozme ale zmenit vnutro objektu:
//		rudo.setMeno("Jozo");
//		rudo.setRodneCislo("2");

		// vnutorny stav final premennej typu objekt sa menit moze
		rudo.setKredit(new BigDecimal(100));
	}

	// nemozne prepisat (override) metodu predka(class FinalParent), ktora je oznacena ako final
//	@Override
//	public void vypocitaj() {
//		super.vypocitaj();
//	}

}
