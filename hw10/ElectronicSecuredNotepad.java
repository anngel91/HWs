package hw10;

public class ElectronicSecuredNotepad extends SecuredNotepad implements INotepad, IElectronicDevice {
	private boolean isStarted;

	ElectronicSecuredNotepad(String title, int numberOfPages, String password, boolean isStarted) {
		super(title, numberOfPages);
		this.password = password;
		this.isStarted = isStarted;
	}

	@Override
	public void start() {
		if (!isStarted) {
			isStarted = true;
			System.out.println("Device started.");
		}
	}

	@Override
	public void stop() {
		if (this.isStarted) {
			isStarted = false;
			System.out.println("Device stopped.");
		}
	}

	@Override
	public boolean isStarted() {

		return this.isStarted;
	}

	@Override
	public void addTextToPage(int pageNumber) {
		if (isStarted)
			super.addTextToPage(pageNumber);
	}

	@Override
	public void replaceText(int pageNumber) {
		if (isStarted)
			super.replaceText(pageNumber);
	}

	@Override
	public void deleteText(int pageNumber) {
		if (isStarted)
			super.deleteText(pageNumber);
	}

	@Override
	public void printAllPages() {
		if (isStarted)
			super.printAllPages();
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted)
			super.printAllPagesWithDigits();
	}

	@Override
	public void searchWord(String word) {
		if (isStarted)
			super.searchWord(word);
	}

}
