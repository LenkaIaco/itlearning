package sk.itlearning.java2.a.db;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {
//		VERZIA 1:
//		Connection c = null; tuto by sme ich museli bud manualne inicializovat ako nelokalne premenne definovat a potom finally pridat so zatvaranim a podmienkovanim vsetkych 3 premennych
//		Statement s = null;
//		ResultSet rs = null;
//		alebo je na to taka konstrukcia v try metode kde ich na zaciatku try{ do () zatvoriek napisem
//		try {
//			Connection c = DriverManager.getConnection("jdbc:postgresql:java2", "postgres", "sa");
//			Statement s = c.createStatement(); //z ponuknutych moznosti Statement-u vyberieme triedu Java sql. Skonstruujeme takto novy statement
//			s.executeQuery("select * from zakaznik"); //vid dalsi riadok. takto vykoname nas skonstruovany statement cez metodu executeQuery. Vystup tejto metody je tzv Result Set. Je to specialny typ triedy
//			ResultSet rs = s.executeQuery("select * from zakaznik");
//					//data kt si pytame s databazy sa nemusia vs zmestit do Ramky. Result set typ je tzv iterator, trieda kt dovoluje prechadzat po riadkoch zaznamoch.
//					//v RS je poznacene index = -1 tj nulty zaznam, kde
//			while(rs.next()){//while sa opyta ci existuje dalsi zaznam vysledku po -1(to je to rs.next ma preddef hodnota), resp po aktualnom overenom riadku v loope, ak hej tak vypis Name hodnotu z riadku
//				System.out.println(rs.getString("name"));//neni nazvy v databazach case-sensitive cize jedno ci dam name alebo Name
//			} 
//			//ked sa pripojim k DB tak blokujem pripojenie; kym je program otvoreny tak blokujem pripojenie, hoc s nim zrovna nerobim. Takze pripojit kod kt. pozatvara vsetko ked vytiahnem svoje zaznamy
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally { ///bez ohladu ci sa stane chyba pocas pripojenia alebo nie, na konci vykonaj prikaz close: c.close(); ale musim ju try/catch surround + da sa pouzit iba na lokalnu premennu
//			(if c!= null)//to iste pre rs, s .. potom ...close()
//		}
//		
		
//		VERZIA 2:
//		try {//v try() zatvorky vytvoria interface s nazvom auto-closable, kt.ma metodu close a tym padom v () mozme uvadzat len triedy kt.implementuju auto-closable interface inak throw error
//			(Connection c = DriverManager.getConnection("jdbc:postgresql:java2", "postgres", "sa");
//			Statement s = c.createStatement(); //z ponuknutych moznosti Statement-u vyberieme triedu Java sql. Skonstruujeme takto novy statement
//			ResultSet rs = s.executeQuery("select * from zakaznik");
//			){
//					//data kt si pytame s databazy sa nemusia vs zmestit do Ramky. Result set typ je tzv iterator, trieda kt dovoluje prechadzat po riadkoch zaznamoch.
//					//v RS je poznacene index = -1 tj nulty zaznam, kde
//			while(rs.next()){//while sa opyta ci existuje dalsi zaznam vysledku po -1(to je to rs.next ma preddef hodnota), resp po aktualnom overenom riadku v loope, ak hej tak vypis Name hodnotu z riadku
//				System.out.println(rs.getString("name"));//neni nazvy v databazach case-sensitive cize jedno ci dam name alebo Name
//			} 
//			//ked sa pripojim k DB tak blokujem pripojenie; kym je program otvoreny tak blokujem pripojenie, hoc s nim zrovna nerobim. Takze pripojit kod kt. pozatvara vsetko ked vytiahnem svoje zaznamy
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 
//		
		
		//za bodkou v drivermanager kliknem CTRL Space a vyberiem: getConnection(String Url, String User, String password)
		//JDBC(C ako connection) trieda je interface ktory nevieme ako urobit triedu, iba vyrobca databaz vie ako ju skonstruovat. TJ stiahnu si interface connection(definuje Ake musi mat vlastnosti aby sme sa vedeli pripojit dorozumiet s databazou) a nadefinuju si vlastnu triedu
		//ked mam .getConnection("", "postgres", "sa") hover mouse a vyber Surround with try/catch potom sa zobrazi v try {} konstrukcii
		//SQL Exception: v jave Vynimky su triedy, ak v prgrame nastane vynimka tak program vacsinou zhavaruje na tej vynimke (spadne)
		//prostriedok ako chybu odchytit a na to zareagovat, aby program nespadol je v tomto pripade to try/catch
		//ExceptionError*cerveny typ exception nevyzaduje zabalenie do try catch. Exception Exception*zeleny typ exception vzdy vyzaduje try/catch. Vyrobcovia metody nakonfigurovali pripojenie na databazu tak ze treba kontrolovat ci nespadne cele pripojenie ked uzivatel zada zle vstupne udaje
		//try/catch je akoby priprava programu na to ze moze vyskocit v real time chyba, pripravit ho na to aby nespadol
		//.getConnection( je metoda tej kniznice kt zo vsetkych tried sql kniznice najde triedu typu co je zodpovedna za build connection a este typu co je pre postgres databazu a podla toho to na mieru pripoji specifickym sposobom pre eclipse a postgres
		//.getConnection("jdbc:postgresql:java2" how to write? google: postgres connection sql - ak sa chcete pripojit z jave k postgres databaze tak to musi vyzerat takto: jdbc(java databaza):postgresql:database
		//mohla by byt s celym nazvom aj s host a s portom databaza zadefinovana jdbc:postgresql://<database_host>:<port>/<database_name>, ale ked pouzivame preddefinovany port z pociatocnej instalacie tak to tam nemusime specifikovat a staci 3zlozkova specifikacia 
		//maven nam automaticky naimportuje z webu sql kniznicu tried ked ju hore namimportujem. Inak by sme si ju museli vyhladat na webe stiahnut na pc a naimportovat do Eclipse cez Import - JavaBuildPath
		//ako najst na webe: googlit postgresql mysql driver
		//v maven pom.xml je to v sekcii <dependencies><dependency>postgresql... maven vybudoval svoj vyhladavac - google: postgresql jdbc driver maven - mozme si ten vyhladavac aj manualne stiahnut z webu tak ze si otvorime search result a vykopirujeme ten html kod <dependencies><dependency>postgresql... a napastujem si to do mojho xml dokumentu
		//takto sa daju aj manualne menit pomxml dokumenty aplikovat na nas aktualny priklad. V eclipsi v Project Explorer to potom vidim v Maven Dependencies kde sa mi auto-natiahnu moje stiahnute dependencies aj pod/nad dependencies ktore k fungovaniu tej nasej v praxi treba mat tiez stiahnute
		//tym naimportovanim do pom.xml sa nam vytvoril tzv. maven repozitar v nasom PC pod user - student - .m2 - repository - org - postgresql - 42.5.1 
		//lebo maven funguje tak ze to co zadam do pomxml ze chcem za kniznicu tak sa pozrie do svojho repozitara v nasom pc a ked nenajde tak si ju auto-vyhlada na webe a ulozi do repozitara nanovo
		//z webu sa to stiahne z maven repozitara: https://repo.maven.apache.org/maven2/org/postgresql/postgresql/42.5.1/
		//ak manualne napisem do pom.xml nasu triedu k naimportovaniu tak mam otvoreny xml dokument, dam Alt F5 a refreshne sa pom.xml dokument, to uz stiahol svoju potrebnu novu kniznicu
		
		
		
		//KONECNA VERZIA:
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql:java2","postgres", "sa");
			Statement stmt = connection.createStatement();
			Statement stmt2 = connection.createStatement();
			ResultSet rs2 = stmt.executeQuery("select * from public.\"zakaznik\" where name = 'Orange'")) {//ukazka quoted DB, ktora je Case sensitive - musi byt Orange s velkym o aj Accent sensitive - keby bolo Órange tak tam treba aj dlzen, inak nenajde
			//stmt2.execute("insert into zakaznik (name, zakid) values ('Peter', '123456')");//vpisat do databazy novy riadok. Update vidim v postgresql appke - Query sekcii
			//insert/update/delete s nim robime, vracia iba Boolean - podarilo sa / nepodarilo sa

			stmt2.execute("update zakaznik set name = 'Juraj' where name = 'Orange'"); //premenovat daky zaznam.  Update vidim v postgresql appke - Query sekcii
			while (rs2.next()) {
				String rodneCislo = rs2.getString("zakid");
				String meno = rs2.getString("name");
				BigDecimal kredit = BigDecimal.valueOf(rs2.getDouble("kredit"));//bigdecimal nestaci napisat manualne ale ked Eclipse najde ponukane moznosti tak naimportovat BigDecimal ako java.math.BigDecimal
				Obcan o = new Obcan(rodneCislo, meno);
				o.setKredit(kredit);
				System.out.println(o);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Nepodarilo sa pripojit ku databaze");
		}

	}

}
