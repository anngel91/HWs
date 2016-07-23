package hw10;

import java.util.Scanner;

public class Page {
	public Scanner sc = new Scanner(System.in);
	private String header;
	private String text;

	public Page(String header, String text) {
		this.header = header;
		this.text = text;
	}

	void addText() {
		this.text = sc.nextLine();
	}

	void printPage() {
		System.out.println(this.header);
		System.out.println();
		System.out.println(this.text);
	}

	void deleteText() {
		this.text = "";
	}

	void searchWord(String word) {
		if (this.text.contains(word)) {
			System.out.println("Text contains: " + word);
		} else {
			System.out.println("Text doesn't contain: " + word);
		}
	}

	boolean containsDigits() {
		if (this.text.matches(".*\\d.*")) {
			return true;
		} else {
			return false;
		}
	}
}
