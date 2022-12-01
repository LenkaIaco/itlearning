package sk.itlearning.java2.g.rozne;

public class MemberTest {

	public static void main(String[] args) {

		Member m = new Member(20);
		System.out.println(m.a);
		System.out.println(Member.user);

		Member.X x = m.new X();//takto sa referenciuje vnorenu triedu X z triedy Member. Idem skonstruovat objekt. Kedze je nestaticka trieda, najprv musi existovat pbjekt Member a potom mozem pouzit konstruktor
		x.test();

		Member.Y y = new Member.Y();//staticka trieda, ku konstruktoru pristupuem priamo cez nazov triedy - nepotrebujem objekt
		y.test();

	}

}
