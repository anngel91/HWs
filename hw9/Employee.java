package hw9;

public class Employee {
	private String name;
	private Task currentTask;
	private int hoursLeft;
	private static AllWork allWork;

	void work() {
		if (currentTask != null) {
			if (this.hoursLeft < currentTask.getWorkingHours()) {
				currentTask.setWorkingHours(currentTask.getWorkingHours() - this.hoursLeft);
				this.hoursLeft = 0;
			} else {
				this.hoursLeft -= currentTask.getWorkingHours();
				currentTask.setWorkingHours(0);
				this.currentTask = null;
			}
			showReport();
		}
		if (this.currentTask == null) {
			if (allWork.getNextTask() == null) {
				System.out.println("No more tasks.");
			}
			this.currentTask = this.allWork.getNextTask();

		}
	}

	private void showReport() {
		System.out.println("Name of employee: " + this.name);
		if (this.currentTask != null) {
			System.out.println("Name of task: " + this.currentTask.getName());
		}
		System.out.println("Hours of employee left for today: " + this.hoursLeft);
		System.out.println("Hours left for completion of task: " + currentTask.getWorkingHours());
	}

	public void startWorkingDay() {
		this.hoursLeft = 8;
	}

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null) {
			this.name = name;
		}
	}

	public Task getCurrentTask() {
		return currentTask;
	}

	public void setCurrentTask(Task currentTask) {
		if (currentTask != null) {
			this.currentTask = currentTask;
		}
	}

	public int getHoursLeft() {
		return hoursLeft;
	}

	public void setHoursLeft(int hoursLeft) {
		if (hoursLeft >= 0) {
			this.hoursLeft = hoursLeft;
		}
	}
}
