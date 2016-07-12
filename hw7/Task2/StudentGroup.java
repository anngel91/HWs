package hw7;

public class StudentGroup {
	String groupSubject;
	int freePlaces;
	Student[] students;

	StudentGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}

	StudentGroup(String subject) {
		this();
		this.groupSubject = subject;
	}

	void addStudent(Student a) {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] == null && a.subject.equals(this.groupSubject)) {
				this.students[i] = a;
				this.freePlaces--;
				break;
			}
		}
	}

	void emptyGroup() {
		this.students = new Student[5];
		freePlaces = 5;
	}

	void theBestStudent() {
		double max = students[0].grade;
		int indexOfBestStudent = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				if (students[i].grade > max) {
					max = students[i].grade;
					indexOfBestStudent = i;
				}
			}

		}
		System.out.println(this.students[indexOfBestStudent].name + " has the best grade.");
	}

	void printStudentsInGroup() {
		for (int i = 0; i < this.students.length; i++) {
			if (this.students[i] != null) {

				System.out.println("Name of student: " + this.students[i].name);
				System.out.println("Grade of student: " + this.students[i].grade);
				System.out.println("Year in college: " + this.students[i].yearInCollege);
				System.out.println("Age of student: " + this.students[i].age);
			}
		}
	}
}
