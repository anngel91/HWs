package hw10;

public interface INotepad {

	void addTextToPage(int pageNumber);

	void replaceText(int pageNumber);

	void deleteText(int pageNumber);

	void printAllPages();

	void searchWord(String word);

	void printAllPagesWithDigits();

}
