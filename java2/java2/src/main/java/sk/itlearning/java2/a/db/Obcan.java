package sk.itlearning.java2.a.db;

import java.math.BigDecimal;
import java.util.Objects;

public class Obcan implements Zakaznik {

	private String rodneCislo;
	
	private String meno;
	
	private BigDecimal kredit;

	public String getRodneCislo() {
		return rodneCislo;
	}
	
	public Obcan(String rodneCislo, String meno) {
		setRodneCislo(rodneCislo);
		setMeno(meno);
	}
//tuto dole sme vypli validaciu rodneho cisla ze musi byt delitelne bezo zvysku 11, aby nam na nasej prikladovej databaze, kt.obsahuje prikladove random zaznamy kt. nesplnaju tuto podmienku, nehadzalo error
	public void setRodneCislo(String rodneCislo) {
//		rodneCislo = rodneCislo.replace("/", "");
//		long rcc = Long.valueOf(rodneCislo);
//		if ( rcc % 11 == 0) {
			this.rodneCislo = rodneCislo;
//		} else {
//			throw new IllegalArgumentException("Zadali ste neplatne rodne cislo");
//		}
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}

	public BigDecimal getKredit() {
		return kredit;
	}

	public void setKredit(BigDecimal kredit) {
		this.kredit = kredit;
	}
	
	@Override
	public String getId() {
		return getRodneCislo();
	}
	
	@Override
	public String toString() {//keby nebola override tak toString defaultne je naprogramovana vyplut hashcode a ine veci, kt.nepotrebujeme
		return "Zakaznik; typ Obcan; RC = " + rodneCislo + "; Meno = " + meno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Obcan)) 
			return false;
		Obcan o = (Obcan)obj;
		return Objects.equals(this.meno, o.meno) &&
			Objects.equals(this.rodneCislo, o.rodneCislo) &&
			Objects.equals(this.kredit, o.kredit);
	}
	
	@Override
	public int hashCode() {//pravidlo v Jave, ak sa prepisuje metoda equals tak treba prepisat aj metodu hashcode aby dala jedinecny hash. 
		//Lebo framework pri pouzivani tej triedy equals s overridom sa na to spolieha a program moze spadnut ak sa neprepise aj hash metoda
		return Objects.hash(this.meno, this.kredit, this.rodneCislo);//ak budem mat 2 rozne objekty s rovnakym obsahom(Override hore), tak mi vypluje aj jedinecny hash
	}
	
}
