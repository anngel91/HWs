package hw10;

import java.util.Scanner;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;
	Scanner scElPass = new Scanner(System.in);
	public ElectronicSecuredNotepad(String password, Page[] pages) {
		super(password, pages);
	}

	@Override
	public void start() {
		if (this.password.equals(scElPass.nextLine())){
			this.isStarted = true;
			System.out.println("Started.");
		}
		
	}

	@Override
	public void stop() {
		this.isStarted = false;
		System.out.println("Stopped.");
	}

	@Override
	public boolean isStarted() {
		if(isStarted==true) {
			return true;
		}
		else {
			return false;
		}
	}

}
