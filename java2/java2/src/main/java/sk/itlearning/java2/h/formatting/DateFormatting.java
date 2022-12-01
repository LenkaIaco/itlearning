package sk.itlearning.java2.h.formatting;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatting {

	public static void main(String[] args) {

		Date d = new Date();//aktualny datum, java sa spoji s operacnzm systemom a vypyta si akt datzm. Na naformatovanie podla slovenskeho formz datzmu pouzivame v Jave formaterz
		System.out.println(d);

		System.out.println();

		DateFormat df = new SimpleDateFormat("dd-MM-yyyy u");//jeden z formaterov je DateFormat, ma potomok dalsi formater SimpleDateFormat
		System.out.println(df.format(d));

		System.out.println();

		DateFormat df2 = DateFormat.getDateInstance(0, new Locale("sk", "SK"));//zapisane inym stylom. Ma nahrate preddefinovane datum formaty pre krajiny, ale slovensko tam neni. Napr. (1, locale.FRANCE)
		System.out.println(df2.format(d));
		
		System.out.println("Zmeneny kod");
	}

}
