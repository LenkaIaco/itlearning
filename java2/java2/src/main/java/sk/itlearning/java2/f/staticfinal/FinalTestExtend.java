package sk.itlearning.java2.f.staticfinal;

public class FinalTestExtend {
	// nemozno extendovat (dedit) triedu ktora je final - try to add 'extends Final': "public class Final extends FinalParent" lebo Parent je final typu class, tj nemozeme ju dodatocne prepisovat dedicnost v inych podtriedach alebo pri referencovani v inych podtriedach
//metoda typu native napr currentimeMillis() je taka ktora referuje v pouzivani na data z operacneho systemu(pocitaca), nie z java programu (napr presny cas). Taketo classes sa nedaju Override manualne kodom v jave; kebyze si chcem sama manualne napisat metodu co mi vyhodi presny cas si mozem osobitne svoju, ale nie overridom existujucej java native triedy
}
