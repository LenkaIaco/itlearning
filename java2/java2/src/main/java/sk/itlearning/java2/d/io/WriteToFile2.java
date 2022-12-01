package sk.itlearning.java2.d.io;

public class WriteToFile2 {


	public static void main(String[] args) {
//		
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
		
//		File f = new File("C:/devel/subor.txt");
//
//		File tmp = new File("C:/devel/subor1.txt");
//
//		if (!f.exists()) {
//			try {
//				f.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//				return;
//			}
//		}
//
//		if (!tmp.exists()) {
//			try {
//				tmp.createNewFile();
//			} catch (IOException e) {
//				e.printStackTrace();
//				return;
//			}
//		}
//
//		try (InputStream in = new BufferedInputStream(new FileInputStream(f)); //ked pouzijeme try s ()zatvrokami(try with resource) tak nemusime metodu close na konci po error hlaseni pisat lebo je volana automaticky na konci
//				OutputStream out = new BufferedOutputStream(new FileOutputStream(tmp))) {
//			byte[] buffer = new byte[1024];
//			int lengthRead;
//			while ((lengthRead = in.read(buffer)) > 0) {
//				out.write(buffer, 0, lengthRead);
//				out.flush();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		f.setReadOnly();
//
//		try (FileWriter fw = new FileWriter(tmp, true);) {
//			fw.write("Nejaky text\n");
//			f.delete();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		try {
//			Files.move(tmp.toPath(), Paths.get("C:/devel/subor.txt"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}
}
