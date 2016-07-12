package hw6;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;

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
