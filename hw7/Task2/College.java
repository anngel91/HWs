package hw7;

public class College {

	public static void main(String[] args) {
		Student ivan = new Student("Ivan", "Java EE", 30);
		ivan.grade = 5;
		ivan.receiveScholarship(4.0, 100);
		Student gosho = new Student("Gosho", "iOS", 25);
		gosho.upYear();
		Student stoyan = new Student("Stoyan", "Java Android", 22);
		Student sashko = new Student("Sashko", "Java EE", 24);
		Student pesho = new Student("Pesho", "Java EE", 25);
		sashko.grade = 6;

		StudentGroup javaEE = new StudentGroup("Java EE");

		javaEE.addStudent(sashko);
		javaEE.addStudent(ivan);
		javaEE.addStudent(stoyan);
		javaEE.addStudent(pesho);
		javaEE.addStudent(gosho);
		System.out.println();
		javaEE.printStudentsInGroup();
		System.out.println();
		javaEE.theBestStudent();
	}

}
