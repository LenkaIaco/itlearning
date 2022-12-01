package sk.itlearning.java2.c.vetvenie;

public class IfElseKonstanty {

	public static void main(String[] args) {//viacnasobne vetvenie s pouzitim konstanty a s viacnasob.vetvenim pomocou else if + else
// da sa to zjednodusit, vid triedu Kalendar v balicku b.enums a triedu z balika c. SwitchEnum
		String mesiac = Konstanty.MAREC;

		if (mesiac.equals(Konstanty.JANUAR)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 2 st.");

		} else if (mesiac.equals(Konstanty.FEBRUAR)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 3 s.");

		} else if (mesiac.equals(Konstanty.MAREC)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 8 st.");

		} else if (mesiac.equals(Konstanty.APRIL)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 13 st.");

		} else if (mesiac.equals(Konstanty.MAJ)) {

			System.out.println("Priemerna teplota pre " + mesiac + " je 16 st.");

		} else {

			System.out.println("Neznamy mesiac");

		}

	}

}
