package sk.itlearning.java2.h.formatting;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatting {

	public static void main(String[] args) {

		BigDecimal cash = new BigDecimal(245.5);//pri desatinnych cislach najcastejise pracujeme s typom BigDecimal koli problemu zaokruhlovaniu nekonecnych radov

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println(nf1.format(cash));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("sk", "SK"));

		System.out.println(nf2.format(cash));
	}

}
