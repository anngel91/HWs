package hw10;

public class NotepadDemo {

	public static void main(String[] args) {
		SimpleNotepad asd = new SimpleNotepad("Tetradka", 80);
		asd.addTextToPage(1);
		asd.addTextToPage(2);
		asd.deleteText(2);
		asd.replaceText(1);
		asd.printAllPages();
		asd.printAllPagesWithDigits();
		asd.searchWord("Hi");

		SecuredNotepad qwe = new SecuredNotepad("Tetradka s katinar", 80, "parola1");
		qwe.addTextToPage(1);
		qwe.addTextToPage(2);
		qwe.deleteText(2);
		qwe.replaceText(1);
		qwe.printAllPages();
		qwe.printAllPagesWithDigits();
		qwe.searchWord("Hello");

		ElectronicSecuredNotepad zxc = new ElectronicSecuredNotepad("Tablet", 80, "parola2", true);
		if (!zxc.isStarted()) {
			zxc.start();
		}
		zxc.addTextToPage(1);
		zxc.addTextToPage(2);
		zxc.deleteText(2);
		zxc.replaceText(1);
		zxc.printAllPages();
		zxc.printAllPagesWithDigits();
		zxc.searchWord("Zdrasti");
		if (zxc.isStarted()) {
			zxc.stop();
		}
	}

}
