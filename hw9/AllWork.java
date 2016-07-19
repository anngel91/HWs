package hw9;

public class AllWork {

	private static final int MAX_TASKS = 10;
	private Task[] tasks;
	private int freePlacesForTasks;
	private int currentUnassignedTask;

	public AllWork() {
		this.freePlacesForTasks = MAX_TASKS;
		this.tasks = new Task[MAX_TASKS];
		this.currentUnassignedTask = 0;
	}

	public void addTask(Task task) {
		if (this.freePlacesForTasks > 0) {
			this.tasks[this.tasks.length - this.freePlacesForTasks] = task;
			this.freePlacesForTasks--;
		}
	}

	public Task getNextTask() {
		if (this.currentUnassignedTask < this.tasks.length) {
			return this.tasks[this.currentUnassignedTask++];
		} else {
			if (!this.isAllWorkDone()) {
				this.currentUnassignedTask = 0;
				return this.tasks[this.currentUnassignedTask++];
			}
			System.out.println("All tasks are done!");
			return this.tasks[this.currentUnassignedTask];
		}
	}

	public boolean isAllWorkDone() {
		boolean isDone = false;
		for (int i = 0; i < tasks.length; i++) {
			if (tasks[i] == null) {
				isDone = true;
			} else {
				isDone = false;
				break;
			}
		}
		return isDone;
	}
}
