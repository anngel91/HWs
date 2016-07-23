package hw10;

public class SimpleNotepad implements INotepad {

	protected Page[] pages;
	private String title;

	SimpleNotepad(String title, int numberOfPages) {
		this.setTitle(title);
		if (numberOfPages > 0) {
			this.pages = new Page[numberOfPages];
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null)
			this.title = title;
	}

	@Override
	public void addTextToPage(int pageNumber) {
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].addText();
		}
	}

	@Override
	public void replaceText(int pageNumber) {
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].deleteText();
			this.pages[pageNumber - 1].addText();
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (pageExists(pageNumber)) {
			this.pages[pageNumber - 1].deleteText();
		}
	}

	@Override
	public void printAllPages() {
		for (int i = 0; i < pages.length; i++) {
			pages[i].printPage();
		}
	}

	protected boolean pageExists(int pageNumber) {
		if (pageNumber > 0 && pageNumber <= pages.length) {
			return true;
		}
		return false;
	}

	@Override
	public void searchWord(String word) {
		if (word != null) {
			for (int i = 0; i < pages.length; i++) {
				pages[i].searchWord(word);
			}
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		for (int i = 0; i < pages.length; i++) {
			if (pages[i].containsDigits()) {
				pages[i].printPage();
			}
		}
	}

}
