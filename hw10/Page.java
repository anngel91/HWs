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

	void searchWord(String word) {
		if (this.text.contains(word)) {
			System.out.println("Text contains: " + word);
		} else {
			System.out.println("Text doesn't contain: " + word);
		}
	}

	void containsDigits() {
		if (this.text.matches(".*\\d.*")) {
			System.out.println("There are digits.");
		} else {
			System.out.println("There are no digits.");
		}
	}

	void deleteText() {
		this.text = "";
	}

	void printPage() {
		System.out.println(this.header);
		System.out.println();
		System.out.println(this.text);
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
