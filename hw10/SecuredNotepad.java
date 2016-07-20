package hw10;

import java.util.Scanner;

public class SecuredNotepad implements INotepad {
	Scanner scp = new Scanner(System.in);
	String passInput = scp.nextLine();
	String password;
	Page[] pages;

	public SecuredNotepad(String password, Page[] pages) {
		super();
		this.password = password;
		this.pages = pages;
	}

	void checkIfPasswordIsStrong() {
		boolean upperCase = !password.equals(password.toLowerCase());
		boolean lowerCase = !password.equals(password.toUpperCase());
		if (this.password.length() < 5) {
			for (int i = 0; i < this.password.length(); i++) {
				if(!upperCase)
					System.out.println("Must have an uppercase Character");
				if(!lowerCase)
					System.out.println("Must have a lowercase Character");
			}

		}
	}

	@Override
	public void addText(int pageNumber) {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			pages[pageNumber].addText();
		}

	}

	@Override
	public void editText(int pageNumber) {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			pages[pageNumber].deleteText();
			pages[pageNumber].addText();
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			pages[pageNumber].deleteText();
		}
	}

	@Override
	public void printPage() {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			for (Page n : pages) {
				n.printPage();
			}
		}
	}

	@Override
	public void searchWord(String word) {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			for (Page n : pages) {
				n.searchWord(word);
			}
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Enter password:");
		if (this.password.equals(passInput)) {
			for (int i = 0; i < pages.length; i++) {
				if (pages[i].getText().matches(".*\\d.*")) {
					System.out.println();
				}
			}
		}
	}

}
