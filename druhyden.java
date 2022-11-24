//najst si testovacie zadania na webe na javu a na tom cvicit
//premenne dostavaju vyhradene miesto v RAMke v casti ramky STACK. Podla typu premennej dostavaju urcito velke miesto.
//objekty sa ukladaju v casti RAMky Heap.
//kazda tireda ma najma premenne a metody
/* Rozdiel medzi triedami a objektami:
*data ukladame v (vacsi.tabulkovych)databazach. Tabulku musime najprv zadefinovat policka a potom vyplnat zaznamy. To je objekt, taka tabulka.
*Vacsina prog.jaz su objektove, aby sa dalo lahko pracovat s realnymi objektami ako tabulkz.
*Ked s tabulkou chcem v programe pracovat. Tabulka Zakaznik je trieda s tromi polickami:
*Zakaznik{
*string id;//jedinecny identifikator zakaznika chceme
*string name; // jeho meno
*double kredit; // peniaze
*}
*
*po definicii tabulky urobim main class
*
*main{
*string text = null; //premenna je text prazdny, prazdny text sa napise ako null. Zatial kym premenna nema priradeny objekt tak sa takto definuje.
*
*Zakaznik Z1 = newZakaznik(); //novy objekt Z1 v main ktory reprezentuje v main nasu vyplnenu sablonu(objekt, "tabulku") Zakaznik(chcem pracovat teraz s takou tabulkou s polickami)
*z1.id = "";
*z1.name = "";
*z1.kredit = 20.60;
*/
 
//ak ma trieda premenne predstavuje datovy objekt, ak ma metody tak nieco robi.
// su 2 typy objektov : primitivne hodnoty a referencie na premenne:
/*
 * String text = new String("nejaky text');  /:string je objekt, ktory ma primitivnu hodnotu
 * System.out.printIn(text);
 * 
 * Zakaznik z1 = new Zakaznik(); /: zakaznik je objekt s premennymi
 * z1 = ...;
 * ..;
 * ..;
 * 
 *
 * 
 */