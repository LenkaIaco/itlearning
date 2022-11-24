package sk.itlearning.java1.g.zakaznik;

import java.util.Objects;

public class Firma implements Zakaznik {

	private String ico;

	private String nazov;

	public Firma(String ico, String nazov) {
		setIco(ico);
		setNazov(nazov);
	}

	public String getIco() {
		return ico;
	}

	public void setIco(String ico) {
		this.ico = ico;
	}

	public String getNazov() {
		return nazov;
	}

	public void setNazov(String nazov) {
		this.nazov = nazov;
	}

	@Override
	public String getId() {
		return getIco();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Firma) {
			Firma f2 = (Firma) obj;
			return Objects.equals(this.getIco(), f2.getIco()) 
					&& Objects.equals(this.getNazov(), f2.getNazov());
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.getIco(), this.getNazov());
	}

}
