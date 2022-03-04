package exam05;

class Computer {
	Computer() {}
}

class NoteBook extends Computer {
	NoteBook() {}
}

class TabletPC extends NoteBook {
	TabletPC() {}
}



public class ReferenceVariableUse {

	public static void main(String[] args) {
//		다형성-> 서로 다른 자료형으로 바라볼수있다.
		Computer cpt1 = new NoteBook();
		Computer cpt2 = new TabletPC();
		NoteBook cpt3 = new TabletPC();
//		TabletPC cpt4 = new Notebook(); //불가능
		
		TabletPC cpt5 = new TabletPC();
		TabletPC cpt6 = cpt5;
		
		NoteBook cpt7 = cpt6;
		Computer cpt8 = cpt6;
		
		Computer cpt9 = new TabletPC();
//		NoteBook cpt10 = cpt9; //불가능
//		TabletPC cpt11 = cpt9; //불가능
		
		

	}

}
