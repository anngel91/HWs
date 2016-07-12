package hw7;

public class Computer {

	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

	public Computer() {
		this.isNotebook = false;
		this.operationSystem = "WinXP";
	}

	public Computer(int year, double price, int hardDiskMemory, int freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	public Computer(int year, double price, boolean isNotebook, int hardDiskMemory, int freeMemory,
			String operationSystem) {
		this.year = year;
		this.price = price;
		this.isNotebook = isNotebook;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
		this.operationSystem = operationSystem;
	}

	int comparePrice(Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price < c.price) {
			return 1;
		} else {
			return 0;
		}
	}

	void changeOperationSystem(String newOperationSystem) {
		if (newOperationSystem != null && newOperationSystem.equals(operationSystem) == false) {
			operationSystem = newOperationSystem;
		}
	}

	void useMemory(int memory) {
		if (memory < 0) {
			return;
		}
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
			return;
		}
		freeMemory -= memory;
	}
}
