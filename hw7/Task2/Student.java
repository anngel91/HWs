package hw7;

public class Student {
	String name;
	String subject;
	double grade;
	int yearInCollege;
	int age;
	boolean isDegree;
	int money;

	public Student() {
		this.grade = 4.0;
		this.yearInCollege = 1;
		this.isDegree = false;
		this.money = 0;
	}

	public Student(String name, String subject, int age) {
		this();
		this.name = name;
		this.subject = subject;
		this.age = age;
	}

	void upYear() {
		if (yearInCollege < 4) {
			yearInCollege++;
		} else {
			isDegree = true;
		}
	}

	double receiveScholarship(double min, double amount) {
		if (this.grade >= min && this.age < 30) {
			this.money += amount;
		}
		return this.money;
	}
}
