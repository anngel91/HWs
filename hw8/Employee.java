package hw8;

public class Employee extends Person {
	private static final int LEGAL_AGE = 18;
	private static final double OVERTIME_COEF = 1.5;
	private static final int DAILY_WORKING_HOURS = 8;
	private double daySalary;

	public Employee(String name, int age, boolean isMale, double daySalary) {
		super(name, age, isMale);
		setDaySalary(daySalary);
	}

	void calculateOvertime(double hours) {
		if (this.getAge() < LEGAL_AGE) {
			this.daySalary = 0;
		} else {
			this.daySalary += (daySalary / DAILY_WORKING_HOURS) * OVERTIME_COEF * hours;
			printOvertimeCalculation(hours);
		}
	}

	private void printOvertimeCalculation(double hours) {
		System.out.println("Day salary for " + this.getName() + " with overtime " + hours + " is: " + this.daySalary);
	}

	void showEmployeeInfo() {
		showInfo();
		System.out.println("Daily salary of " + this.getName() + " is: " + this.getDaySalary());
	}

	public double getDaySalary() {
		return daySalary;
	}

	public void setDaySalary(double daySalary) {
		if (daySalary >= 0) {
			this.daySalary = daySalary;
		}
	}

}
