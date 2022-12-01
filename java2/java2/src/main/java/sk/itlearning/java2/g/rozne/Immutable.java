package sk.itlearning.java2.g.rozne;

import java.math.BigDecimal;

public class Immutable {

	static class MutableNumber {
		int value;

		public MutableNumber(int value) {
			this.value = value;
		}

//		void add(MutableNumber x) {///x hodnotu mozem prepisovat
//			this.value += x.value;
//		}
//		UPDATE: teraz sme to manualne nakodovali tak aby bol efekt prepisovania rovnaky ako pri immutable type - ze vytvori po prepisovani novy objekt s novymi update contentom a staru referneciu zahodi
		void add(MutableNumber x) {
			return new MutableNumber(this.value + x value);
		
	}
		
		@Override
		public String toString() {
			return String.valueOf(value);
		}
	}

	public static void main(String[] args) {

		MutableNumber a = new MutableNumber(100);

		a.add(new MutableNumber(50));//metoda add pozmeni moje mutable nubmer a

		System.out.println(a);


		BigDecimal b = new BigDecimal(100);//bigDecimal trieda je immutable takze sa uz dodatocne neda menit, prepisovat, bigdecimal objekty tak jak ich skonstruujem tak zostane

		b.add(new BigDecimal(50));

		System.out.println(b);
	}

}//viacvlaknove prrogramy mozu obs kod kt meni 1 objekt roznymi sposobmi, ak situacia ze obe triedy chcu naraz zmenit 1 objekt tak ho mozu pokazit, nebude mat vysledok ani z 1 kodu upraveny; na to pouzivame immutable numbers
//vacsina objektov je immutable aby bola safe pre viacvlaknove programy pri prepisovani hodnot
