package hw6;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer pc1 = new Computer();
		Computer pc2 = new Computer();
		pc1.year = 2015;
		pc1.price = 2000;
		pc1.hardDiskMemory = 1000;
		pc1.freeMemory = 800;
		pc1.operationSystem = "Mac";

		pc2.isNotebook = true;
		pc2.year = 2015;
		pc2.price = 1800;
		pc2.hardDiskMemory = 500;
		pc2.freeMemory = 400;
		pc2.operationSystem = "Windows";

		pc1.changeOperationSystem("Windows");
		pc2.useMemory(100);

		System.out.println("Year of manifacture of pc1: " + pc1.year + " and pc2: " + pc2.year);
		System.out.println("Price of pc1: " + pc1.price + " and pc2: " + pc2.price);
		System.out.println("Hard disk memory of pc1: " + pc1.hardDiskMemory + " and pc2: " + pc2.hardDiskMemory);
		System.out.println("Free memory of pc1: " + pc1.freeMemory + " and pc2: " + pc2.freeMemory);
		System.out.println("OS of pc1: " + pc1.operationSystem + " and pc2: " + pc2.operationSystem);
		System.out.println("Pc1 is a notebook - " + pc1.isNotebook + " and pc2: " + pc2.isNotebook);
	}

}
