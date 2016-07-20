package hw10;

import java.util.Scanner;

public class SimpleNotepad implements INotepad {
	Page[] pages;

	public SimpleNotepad(Page[] pages) {
		super();
		this.pages = pages;
	}

	@Override
	public void addText(int pageNumber) {
		pages[pageNumber].addText();
	}

	@Override
	public void editText(int pageNumber) {
		pages[pageNumber].deleteText();
		pages[pageNumber].addText();
	}

	@Override
	public void deleteText(int pageNumber) {
		pages[pageNumber].deleteText();
	}

	@Override
	public void printPage() {

		for (Page n : pages) {
			n.printPage();
		}

	}

	@Override
	public void searchWord(String word) {
		for (Page n : pages) {
			n.searchWord(word);
		}

	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i=0;i<pages.length;i++) {
			if (pages[i].getText().matches(".*\\d.*")) {
				System.out.println();
			}
		}
	}
}
