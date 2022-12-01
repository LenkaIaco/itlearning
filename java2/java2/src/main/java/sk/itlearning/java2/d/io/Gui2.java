package sk.itlearning.java2.d.io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Gui2 {//ked chceme vysledok zobrazit do grafickeho okna tato trieda ukazuje:
	public static void main(String[] args) {
		
		JFrame w = new JFrame("mojeGui");//vytvori nove graficke okno JFrame nazvom mojeGui
		w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		w.setSize(300,300);//aby bol velky 300px
		JPanel p = new JPanel();//zgrupovaci panel pre gombik
		JLabel l = new JLabel();
		JButton b = new JButton("OK");
		l.setText("Here comes the result");
//		b.addActionListener(new ActionListener());//neda sa urobit objekt lebo class ActionListener je interface, nema svoj objekt. musime urobit novy objekt az potom mozme robit s ActionListener
//	
//		PRVA VERZIA:
//		b.addActionListener(new ActionListener() {
//			// TODO Auto-generated method stub
//			@Override
//			public void actionPerformed(ActionEvent e) {//actionPerformed je metoda ktora nema implementaciu, musime extra manualne zadefinovat vnutri v kode co sa stane. Tj nemozme odovzdat ako input funkciu ale musime odovzdat anonymous inner class a v nej zadefinovat kod
//				double objem = 4/3 * 3.14 * (0.5*0.5*0.5);//dnu pridam co sa stane ak nastane event z event listenera. Vypocita nam objem gule 4/3 pi r na tretiu
//				l.setText("objem gule s priemerom 1m = " + objem);
//			}
//		DRUHA VERZIA:
//		b.addActionListener( e ->  {  //cez lambda vyraz mozme pouzit actionListener bez manualneho pridavania anonymnej triedy
//			double objem = 4/3 * 3.14 * (0.5*0.5*0.5);
//			l.setText("objem gule s priemerom 1m = " + objem);
//		}
//		);
		
//		POSLEDNA VERZIA:
		b.addActionListener( e -> l.setText(e.getSource().toString()));  //java vidi ze actionlistener je interface s jedinou metodou a do nej odovzda text. Keby mala trieda actionListener viac metod tak to nemozme cez lambda expression auto-odovzdat cez 1 riadok lebo java by nevedela kt metode odovzdat.
		//nove triedy v jave sa robia tak aby sme co najviac vedeli vyuzivat automatizovane lambda expressions tj s jednou metodou a nemuseli ist cez komplikovane konstruovanie objektu ako hore
		// labda expressions sa daju bud v 1 riadku ako tu, ak ma trieda jedinu metodu, alebo ako DRUHA VERZIA kde definujeme za e -> co chceme urobit
		//lambdy sa uz ako 2 a3. verzia pouzivaju v kode dnes, uz sa manualne nekoduje ako v prvej verzii, vsade kde sa da
		p.add(b);//do panel pridame button
		p.add(l);//do panel pridame label
		
		w.add(p);// panel pridame do window
		
		w.setVisible(true);//ma byt viditelne. Toto okno sa samo od seba nezavre kzm neklikneme mysou na x. By bezal donekonecna a java s nim lebo ho vytvorila a je to jej programove vlakno.
		// ked kliknem mysou tak to je event. Pridame event listener na klik mysou na x aby sa tym zavrelo moje okno a skoncil program
	}

}
