package sk.itlearning.java1.g.zakaznik;

public abstract  Zakaznik { //miesto interface dali sme abstract
	//tato trieda nema funkcionalitu iba definuje pravidla(podtriedy riadi).Priklad z praxe: Web browser a www komunikuju cez http protokol
// je to interface na vymenu medzi inputmi a nasimi zadefinovanymi kodovymi strukturami
	public abstract String getId();//ak sa v triede nachadza aspon 1 absttr metoda tak cela trieda musi byt abstraktna
	
}
