package hw10;

public interface INotepad {
	void addText(int pageNumber);
	void editText(int pageNumber);
	void deleteText(int pageNumber);
	void printPage();
	void searchWord(String word);
	void printAllPagesWithDigits();
}
