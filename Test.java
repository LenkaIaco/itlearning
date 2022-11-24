////Vyvojove prostredie(studio) (IDE integrated development environment) pre javu: Eclipse, NetBeans, IntelliJ(pouziva ju google), VS Code (od microsoft). NetBeans su od javy. Ostatne su vyvojove platformy pre viac jazykov
/// aplikacia ma databazovu vrstvu(DB), processingovu(proc/business) a graficke rozhranie(GUI) v ktorom to zobrazujeme v nadizjajnovanom formate. Volame ich moduly. Na kazdy z modulov ma vlastnu kniznicu metod koli reusability. Kazdy modul ma podtriedy - packages(napr. DB pre Oracle, DB pre MYSQL - aby vedela aplikacia komunikovat s najpouzivanejsimi typmi databaz). Tieto packages obsahuju potom nase naprogramovane dokumenty-triedy v Jave
import java.time.LocalDateTime;

//niektore triedy su vseobecne dostupne - System, String, vacsinu ale pred pouzitim v kode treba naimportovat(vid hore) do mojho programu
//hore manualne importujeme hore triedu LocalDateTime. treba umiestnit pred moju class Test
//JRE pri spusteni automaticky naimportuje vsetky triedy do RAMky a az potom sa spusti nas program Test

class Test {

//java.exe interpretuje a vykona program (=JRE)
//aplikacia sa spusti  pomocou prikazoveho riadka. subor s priponou .bat je spustaci skript ktorym definujeme ktory subor spustime.
// definujeme bud relativnu alebo absolutnu adresu suboru podla toho ci je subor v rovnakom priecinku ako spustaci skript
//ked updatnem moj kod treba spustaci skript zatvorit a znova otvorit

public static void main(String[] args){ 

//metoda main kt zacina moj java program, aby bol moj prog spustitelny musi mat main triedu
//String je trieda, zacina velkym pismenom. Triedy maju premenne a metody
//[] je vstup pre main metodu - [] zn.pole
//args je pomocny nazov pre triedu String
// public-metoda viditelna pre vsetkych
//void(double apod) - ake cislo ma vratit. double - desatinne, void - nic nevratit
//JDK obsahuje predpripravene triedy na pouz.pocas kodovania

System.out.println("Hello World");

//java.long.System - vsetky triedy v java.long su auto-importovane v RAMke
//System je trieda pre oper.system. Out je vystup. Print- zapis. Kazdy prikaz je ukonc. bodkociarkou
//premenna out je nadtrieda pre metodu println

System.out.println(java.time.LocalDateTime.now());

//LocalDateTime.now je relativna adresa triedy a metody, cela adresa s nadtriedami(=packages) je aj s java.time.
//relativnu adresu mozme pouzivat ak mame na zaciatku dokumentu import triedy. inak pouzijeme plny nazov triedy aj s packages


}
}