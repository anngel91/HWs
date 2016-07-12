package hw7;

public class Main {

	public static void main(String[] args) {
		Task task = new Task("Task 1", 9);
		Task task2 = new Task("Task 2", 20);
		Task task3 = new Task("Task 3", 3);
		Task task4 = new Task("Task 4", 8);
		Task task5 = new Task("Task 5", 13);
		Task task6 = new Task("Task 6", 5);
		Task task7 = new Task("Task 7", 22);
		Task task8 = new Task("Task 8", 40);
		Task task9 = new Task("Task 9", 17);
		Task task10 = new Task("Task 10", 12);

		Employee ivan = new Employee("Ivan");
		Employee pesho = new Employee("Pesho");
		Employee jichko = new Employee("Jichko");
		Employee dragan = new Employee("Dragan");

		ivan.setCurrentTask(task);
		dragan.setCurrentTask(task2);
		pesho.setCurrentTask(task3);
		jichko.setCurrentTask(task4);

		ivan.work();
		dragan.work();
		pesho.work();
		jichko.work();
	}

}
