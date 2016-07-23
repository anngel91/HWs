package hw10;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

	SecuredNotepad(String title, int numberOfPages) {
		super(title, numberOfPages);
	}

	SecuredNotepad(String title, int numberOfPages, String pass) {
		super(title, numberOfPages);
		this.password = pass;
	}

	Scanner sc = new Scanner(System.in);
	protected String password;

	private String enterPassword() {
		System.out.println("Enter password: ");
		String pass = sc.nextLine();
		while (!passwordMatches(pass)) {
			System.out.println("Password incorrect!");
			pass = sc.nextLine();
		}
		return pass;
	}

	private boolean passwordMatches(String pass) {
		if (pass.equals(this.password)) {
			return true;
		}
		return false;
	}

	@Override
	public void addTextToPage(int pageNumber) {
		enterPassword();
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].addText();
		}

	}

	@Override
	public void replaceText(int pageNumber) {
		enterPassword();
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].deleteText();
			this.pages[pageNumber - 1].addText();
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		enterPassword();
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		enterPassword();
		for (int i = 0; i < pages.length; i++) {
			pages[i].printPage();
		}
	}

	@Override
	public void searchWord(String word) {
		enterPassword();
		if (word != null) {
			for (int i = 0; i < pages.length; i++) {
				pages[i].searchWord(word);
			}
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		enterPassword();
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				pages[i].printPage();
			}
		}
	}

}
