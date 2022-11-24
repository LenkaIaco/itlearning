package sk.itlearning.java1.g.zakaznik;

public class Obec implements Zakaznik { // nadtrieda Zakaznik je abstraktna, tj nedodefinovana. vsetky podtriedy musia byt abstraktne. bud ju zadefinujem tu ako abstraktnu alebo cez override(nechcem mat abstraktnu obec)

	@Override
	public String getId() {
		return "Horna Dolna";
	}

}
