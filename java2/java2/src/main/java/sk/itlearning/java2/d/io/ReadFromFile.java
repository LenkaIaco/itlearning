package sk.itlearning.java2.d.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
public class ReadFromFile {

	public static void main(String[] args) {
		File f = new File("C:\\devel\\test\\subor.txt");//az \\ je vyhodnotene ako 1 spatne lomitko
		if (!f.exists()) {
			return;
        }

		// using try-with-resource to get automatic close of BufferedReader
//		try (BufferedReader br = new BufferedReader(new FileReader(f));) {
//			String line;
//			while ( (line = br.readLine()) != null) {
//				System.out.println(line);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
		
//		try (BufferedReader br = new BufferedReader(new FileReader(f))) {//Buffered nezavisla trieda zoberie povodnu ako predlohu a prida nejake parametre
//			PRVA VERZIA
//			try (FileReader fr = new BufferedReader(new FileReader(f))) {
//			String r = fr.readLine();
//			while r!= null { //read line metoda nacita riadok texty bez odriaktovania a na konci suboru vrati null, cize kym nebudeme na konci suboru, urob cyklus
//					
//			System.out.println(r);
//			r = br.readLine();
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
			
//			DRUHA VERZIA:
//			String r = null;
//			while ((r = br.readLine()) != null) { //specificky zapis pre javu, neni vo vs. progr. jazykoch takyto tzp zapisu. bud sa priradi text alebo na konci dokumentu sa priradi null. Kym neni null - while, print out - vypisat dalsi
//					
//			System.out.println(r);
//			
//			}
//			catch (IOException e) {
//				e.printStackTrace();
//			}
		
//			TRETIA VERZIA:
//			List<String> zoznamRiadkov = Files.readAllLines(f.toPath()); //trieda list je specificka preddefinovana, je ako array, vie udrziaviat zoznam objektov. <> = v tomto zozn budu iba stringy
//		for (String r : zoznamRiadkov) {
//			System.out.println(r);
//		}
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
		
//			STVRTA VERZIA:
//		List<String> zoznamRiadkov = Files.readAllLines(f.toPath()); 
//		zoznamRiadkov.forEach(r -> System.out.println(r));//lambda expression zapis: ->. Zoberie objekt(riadok) zo zoznamuRiadkov a urob z neho PritLn
//		}catch (IOException e) {
//			e.printStackTrace();
//		}
			
//			NAJMODERNIEJSIA VERZIA:
			try {
			Files.lines(f.toPath()).filter(p -> p.contains("9")).forEach(p -> System.out.println(p));
			// is | filter: zober zoznam dat a vyhladaj podla filtra tie zapisy kt splnaju podmienku. Potom mozme prilozit dalsiu | a spracovat dalej vyfiltrovane data s dalsimi podmienkami atd.
			//to hore robi Linux. Java toto iste robi cez Stream .filter (-> ...). potom urob s tym nieco(forEach p-> tu urob)
			}
			catch(IOException e) {
				e.printStackTrace();
				}
			}
	}






















///toto je plna verzia originalna s poznamkami WriteToFile2:
//package sk.itlearning.java2.d.io;
//
//import java.io.BufferedInputStream;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.FileInputStream;
//
//
//public class WriteToFile {
//
//	public static void main(String[] args) {
////		
//		File f = new File("C:\\tmp\\subor.txt");
//
//		if (f.exists()) {//ekvivalentny zapis ako true, else...
//		try {
//			f.createNewFile();}//tato metoda moze sa nepodarit preto vyrobca metody vypisal pri nahodeni metody chybove hlasene v kt vyzyva aby sme zabalili metodu do try/catch
//		catch (IOException e) {
//			System.out.println("Nepodarilo sa vytvorit subor");
//		}
//		}
//		
//		try {
//			FileWriter fw = new FileWriter(f, true); //append - pridavanie do suboru nie prepisovanie suboru:
//			fw.append("Riadok 1" + System.lineSeparator());//na odriadkovanie (paragraphs) pouzit metodu lineSeparator. alebo to iste pis jednoduchsie: ("Riadok 1\n"). Ak dam ("Riadok 1\n" + System.lineSeparator()) tak urobim dvojite odriadkovanie 
//			//fw.flush();//hned vytlacit text nie az ked sa naplni buffer Pouzivame iba ked neni metoda close vo file writri, lebo close pred zavretim automaticky flushne:
//		    fw.close();//aby nas program neblokoval subor ked donho nieco napise. Ak ma file writer metou close musime ju aj pouzit koli blokovaniu
//		ina varianta tohto kodu kuk dole na try so zatvorkami: try (...)
//		}
//		catch (IOException e) {
//			//auto-generated catch block
//			e.printStackTrace();
//		}
//	 
//	potom to mozme tak automatizovat cez for cyklus:
//	try FileWriter fw = new FileWriter(f, true);) {
//		for (int i = 0; i<10; i++) {
//			fw.append("Riadok "+ i + "\n");
//		}
//	}catch (IOException e) {
//		e.printStackTrace();
//	}
		
//		DALSIA VARIANTA:
//		if (f.exists()) {
//		f.mkdir();//vytvori folder
//		}
//		f = Paths.get(f.getPath(), "subor.txt").toFile(); //zoberiem si cestu zo suboru f a pripojim k nej subor.txt. Potom ju premenim na premennu f
		//pomocna trieda Paths nam pomaha skladat cestu k suboru ako hore.
//		if (f.exists()) {
//		try {
//		f.createNewFile();}
//	catch (IOException e) {
//		System.out.println("Nepodarilo sa vytvorit subor");
//	}
//	}
		///TOTO DOLE JE INY KOD, KOMPLIKOVANEJSI. POCAS HODINY SME HO ZMENILI NA JEDNODUCHSI A UPLOADLI NOVU VERZIU SUBORU WriteToFile.java NA MAREK-ITLEARNING GITHUB
		///ked updatne ten subor a ja mam stiahnuty uz doma staru verziu java2, tak kliknem v eclipse na java2 pravym a dame Team - fetch from origin
		
	