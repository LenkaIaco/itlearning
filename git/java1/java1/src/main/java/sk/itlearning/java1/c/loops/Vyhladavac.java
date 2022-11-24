package sk.itlearning.java1.c.loops;

public class Vyhladavac {
public static boolean obsahujeCislo(int hladaneCislo, int[] zoznam) { ///zadefinujem metodu, s vystypom true/false. Bude si pytat premennu HC a pole Zoznam. Ked je public vidia ju ini, ked je static mozem sa na nu priamo obratit v inej triede, kde bude dostupna.
// odkazujem sa na static triedu v inej triede, pre priklad v Break.java. Keby sme nezadefinovali vobec public ani static tak by system zobral ze neni ani public ani static
//ak neni public tak sa trieda najde iba v mojom package. V inom uz ju nenajde. je tzv package-private
// ak neni static tak
	for (int h: zoznam) {
	if (h == hladaneCislo) {
		return true;
	}
}

return false; //ak zbehne tak ma vyplut false
}
}