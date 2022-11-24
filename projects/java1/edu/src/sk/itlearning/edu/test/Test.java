package sk.itlearning.edu.test;//ak je treida v packagi, prve sa zobrazi package. za tym nasleduju importy a potom nasa class
//zdrovoje kody napisane tu uz Eclipse nakompiluje aby bola rovno spustitelna v jave. Urobi priecinok 'bin' a tam su vsetky docs s rovnakymi nazvami ale s priponou.class, to su nase nakompilovane subory. Tie vyvojari odovzdaaju pri vyvoji aplikacii svojim zakaznikom
import java.time.LocalDateTime;

//run.bat je subor pre command bar a cez CMD bar sa spustaju aplikacie (ako java a ine). Na to aby java bezala potrebujeme JDK stiahnut, najlepsie poslednu verziu 19.0 aby podporovala vsetky subory vytvorene s predoslymi verziami Javy
//CMD bar: ak chceme nacitat cesty z dvoch priecinkov: "...java.exe -cp .../edu, ...excel Test" oddelime ciarkou. pri spusteni nie je zarucene ze sa spusti v poradi ako sme napisali, tj. hoci su v dvoch triedach, ale volaju sa subory rovnako, nevieme kt z nich Cmd bar spusti. Na to pouz.packages - pri nich sa package name stava sucastou mena triedy(nasho suboru) a urobi nam jednoznacny unique nazov
//file - import - git repository - import git - napisem URL https://github.com/marekITLearning/java1.git a idem next. Alebo ked mam otvorenu prepazku pravo dole Git Repositories kliknem na ikonku Clone a to iste sa mi otvori 

public class Test {//fialove su Java klucove slova. Este su Java operatory a syntakticke pravidla co treba poznat aby sme vedeli v Jave programovat

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
System.out.println("Hello World again");

//System.out.println();//type in: syso and press: CTRL+Space(content assist, skratka na doplnanie kontextovych moznosti rozpisaneho kodu)
System.out.print(LocalDateTime.now());
	
	int a = 0; //ak je kode chyba, ukaze sa na zaciatku riadka cervene x a pri presune mysi na nu vysvetli eclipse v com je chyba. Ak je ale zlta ziarovka/trojuholik tak to je cast kodu kt sa v programe nikdy nepouzila a je zbytocna. Nemali by sme ich tam mat lebo pri velkych vyvojoch bude nas kod neprehlady, tazko sa tam budu hladat veci
	
//	System.out.println(sk.itlearning.edu.dbClient.main(null)); keby sme mali triedu(subor)DBClient tak sa na nu musime odkazat aj s prefixom jej package, inak ju nenajde program - kedze packages sa stavaju integralnou sucastou mena tried v kt su ulozene. Alebo si ju naimportujem hore v dokumente a potom odkazujem skratenym nazvom. ALE ak by sme mali 2 rozne priecinky s files kt maju rovnake nazvy, naimportovat hore mozem len jednu kt potom pouzivam so skratenym nazvom, na druhu sa potom musim odkazovat s plnym menom, aby ich system vedel rozlisit
// PACKAGES: pri priecinku src sa ako jeho obsah automaticky ocakava bud trieda, alebo package(podsubor), tj pri CMD bare spustam aplikaciu ulozenu v src bud odkazom na ten subor vlozeny priamo v src, alebo na subor z podpriecinka, tj v packagi, tj v mene suboru musime includnut aj package name
// premenna cisla je [] pole cisel, array, obs.5cisel. Su ulozene v RAM, pc sa k nim dostane odkazom na meno premennej ('cisla')
// CMD bar: otvor priecinok bin a v nom najdi subor (packagename+docname) ako referenciu suboru nedavame koncovku: C:/devel/jdk-19.0.1/bin/java.exe -cp C:\devel\projects\java1\edu\bin sk.itlearning.edu.test.Test	
//tuto funkciu dole si mozem ulozit v separatnej triede(subore) a potom sa odkazat na ten dokument (bud importom+rel.referencia alebo absol.referenciou)
int[] cisla = {1, 2, 3, 4, 5};
int Jednocislo = 5;

int result = 0;
for (int c : cisla) {
	for (int c2 : cisla) {
	result = result + c*c2;
	}
}
System.out.println(result);
	
int DbClient = 10; //konvencia je ze triedy sa definuju s Velkym pismenom a premenne s malym; da sa to ale aj inak zadefinovat. Je to pre lepsiu prehladnost v citani kodu v buducnosti, resp. citani kodov incyh ludi

//Test.main(args);
System.out.println(DbClient); //system je trieda z packageu Java.lang, kt. netreba imporovat. Ani triedy z rovnakeho doc netreba. Vsetko ostatne treba

//GIT, SVN. Mercurial - systemy spravy verzii suborov. Najpouzivanejsi je Git; github.com - umoznuje vam vytvorit ulozisko na cloude s mojimi priecinkami
// ak 2 vyvojari robia na tom istom dokumente a uploaduju do jedneho github priecinku, ak robia na inom riadku dokumentu, Github to zmerguje zmeny do 1 dokumentu v ulozisku cloudu.
//Lenze ak zmenia rovnaky riadok suboru a potom ho uploadnu do Github, konflikt; Github nedovoli druhemu vyvojarovi zmenit rovnaky, riadok, prikaze download najaktualnejsej verzie a tam tu zmenu urobit
// https://github.com/marekITLearning/java1.git - zdrojovy kod javy pre nase skolenie.
// Naimportovat horny zdrojovy kod cez Eclipse: tab Window - Show view - Other - Git - Git Repositories - Clone a Git repository - 
// verzie sa ukladaju do master vetvy na githube. Existuju aj branches, podvetvy. Su na to ze ked sa vyrobi nova verzia dokumentu, submitnem(commit) do Branch, spravca master vetvy potvrdi ze kod je v poriadku a potvrdi, az potom sa zmena zluci(merge) s hlavnou verziou kodu.
// tags - verzie kodu co idu do produkcie; branches- verzie k potvrdeniu; master
//v java projekte co sme si stiahli z github je Working tree - java 1 - pom.xml (kopia modulu javy ulozena v xml) : toto naimportujeme: right-click Import - Finish. Potom rozbalime src/main/java a tam mame packages
// eclipse java project module - vs - maven java project. Vyvojari nikdy nepouzivaju prvy, vzdy druhy. 

String text = "textova hodnota"; //kazdy text.znak je ul.v pamati ako cislo. V tabulke sa najde kt.cislo zodpoveda akemu znaku. Tabulka UTF-8 je vacsinou. Ale ak ma ine kodovanie napr vo windowse sa stava ISO-98... tak to system nevie prelustit. Preto projektu nastavujeme vzdy kodovaciu tabulku. Nastavujeme aj ine veci napr. ak programujeme v jave verzii 19 vieme spustit program iba s java runtime 19 a viac. V jave mame este konkr.verzie - 8, 11, 17 definovane ako LTS: long term support, urcene do produkcnej prevadzky.
//Window-preferences-installed JREs - Java17 mame v eclipsi nainstalovane. Tam sa da aj nainstalovat najnovsia verzia Javy.

//nastroje pouz na kompatibilitu: PMT - Project Management Tools :maven, gradle, etc. Definuju nastavenia projektu kt su univerzalne. Ked si stiahnem moj projekt z vyvoj.prostredia Eclipse do ineho a ma maven, tak bude kokmpatiblne. 
//java1/pom.xml - .xml je skratka pre nastavenia maven, aby bola moja kniznica kompatibilna s vyvojovymi prostrediami: pom.xml otvorime a hore ma project: ...maven.apache, nizsie ma maven.compiler.source>11 - vieme nase projekty spustit na Java 11 a vyssie.
//struktura velkeho projektu :v src mame -1. main - java, resources(nejavove subory) a 2. test - java, resources - maven ponuka aj moznost otestovat nase projekty (Unit testy)
// 							: v target mame dalsie veci
//cez maven nastavime projekt a hockto si to u seba naaplikuje bude mat rovnake kompatibilne nastavenia. nato je ten pom.xml
//okrem javy treba mat na pracov.pohovore aj zaklady databaz, inak ta neprijimu
//RDBSM relational database system management - ak mame databazu tak toto nastavime a nikto iny nevie spatne vydolovat data. Vyrobcovia Oraclu Database alebo MySQL napisu triedy, ktore si developers musia naimportovat. Cez maven sa da automaticky pripojit a stiahnut na kniznicu kt.napisem ze hladam, a automaticky viem pouzivat triedy tej kniznice

/*
 * este je aj takyto komentar v jave na viac riadkov
 * komentare sa davaju napr k tomu ci je trieda Mutable alebo Unmutable lebo to nemaju ako zistit spatne z kodu
 */

/**
 * posledny typ komentara. dokumentacia(napoveda k pouzivanym triedam) napr k triede System, len podrzim kurzor nad tym k comu chcem vidiet dokumentaciu, a vidim info - komentar
 * hocco napisem tak tento komentar sa ulozi a potom bude interpretovany v html. Ak chcem strukturu napr ako odseky, v ramci komentara treba pouzit <p> resp <strong> html tagy
 */

//na konci kodu ked pride java runtime ku koncu tak sa zavrie. ale ak je na konci nejaky nekonecny cyklus, tak ten program nedojde do konca a nezavrie sa. Potom ho treba manualne ukoncit s x vpravo hore. Napisem si do kodu:
//System.exit(0); - tymto cmdom ukoncim korektne java runtime
//F6 klavesou krokujem po riadkoch cez napisanu kod (ktory vidi potom v Console, resp. cez Debug)
	
//START JAVA PROGRAMU: java programy spustime s java.exe alebo javaw.exe - pri java w nevidime console v aplikacii, iba vystupy.
//java s nastartuje a natiahne vs.triedy kt.treba ponatahovat. a potom zacne Main trieda ist.
// CLOSE JAVA PROGRAMU: program mava viacero threads, programovych vlakien kt prebiehaju takmer paralelne(napr program zacne stahovat dokument z databazy, a zatial bezi aplikacia dalej vo svojich dalsich ukonoch). Program sa zavrie az ked dozije posl.prog.vlakno.

// v 1 subore mozme mat viac tried ale bude sa tazsie vyhladavat programom a tazsie sa vyuzivat; pre jednoduchost pouzivania nikdy nedavame viac tried do 1 suboru. ALE public trieda moze byt iba 1 ktora je zhodna menom s nazvom suboru.
	
// folder-java1-src/main/java - package skitlearningjava1akonzola - trieda HelloWorldArguments.java - Zelene tlacitko Run-Run Coniguraions-tab Arguments-insert 1,2,3 a budu to cisla v objekte length. Potom ked dame debug tak nam vypise 1,2,3


	
	}
	
}
