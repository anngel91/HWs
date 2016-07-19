package hw9;

public class Main {

	public static void main(String[] args) {

		AllWork allw = new AllWork();
		allw.addTask(new Task("Task 1", 9));
		allw.addTask(new Task("Task 2", 20));
		allw.addTask(new Task("Task 3", 3));
		allw.addTask(new Task("Task 4", 8));
		allw.addTask(new Task("Task 5", 13));
		allw.addTask(new Task("Task 6", 5));
		allw.addTask(new Task("Task 7", 22));
		allw.addTask(new Task("Task 8", 40));
		allw.addTask(new Task("Task 9", 17));
		allw.addTask(new Task("Task 10", 12));

		Employee ivan = new Employee("Ivan");
		Employee pesho = new Employee("Pesho");
		Employee jichko = new Employee("Jichko");
		Employee dragan = new Employee("Dragan");

		while (allw.isAllWorkDone()) {
			ivan.work();
			dragan.work();
			pesho.work();
			jichko.work();
		}

	}

}
