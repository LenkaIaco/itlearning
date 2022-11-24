
package sk.itlearning.java1.g.zakaznik;

import java.math.BigDecimal;
///standard - zapuzdrene private premenne a verejne gettery a settery su standard v Java programovani

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
public class Obcan implements Zakaznik {

//	private String rodneCislo;
//	
//	private String meno;
//	
//	private BigDecimal kredit;
//
//	public String getRodneCislo() {
//		return rodneCislo;
//	}
//	
	public Obcan(String rodneCislo, String meno) {
		setRodneCislo(rodneCislo);
		setMeno(meno);
	}

	public void setRodneCislo(String rodneCislo) {
		rodneCislo = rodneCislo.replace("/", "");
		long rcc = Long.valueOf(rodneCislo);
		if ( rcc % 11 == 0) {
			this.rodneCislo = rodneCislo;
		} else {
			throw new IllegalArgumentException("Zadali ste neplatne rodne cislo");
		}
	}

	public String getMeno() {
		return meno;
	}

	public void setMeno(String meno) {
		this.meno = meno;
	}
	
	@Override
	getID