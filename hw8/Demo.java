package hw8;

public class Demo {

	public static void main(String[] args) {
		Person[] people = new Person[10];
		Person zidane = new Person("Zinedine", 40, true);
		Person figo = new Person("Luis", 44, true);
		Student sashko = new Student("Sashko", 18, true, 4.5);
		Student petya = new Student("Petya", 17, false, 5);
		Employee stanimir = new Employee("Stanimir", 25, true, 20);
		Employee ivan = new Employee("Ivan", 33, true, 25);

		people[0] = zidane;
		people[1] = figo;
		people[2] = sashko;
		people[3] = petya;
		people[4] = stanimir;
		people[5] = ivan;

		for (int i = 0; i < people.length; i++) {
			if (people[i] != null) {
				if (people[i] instanceof Employee) {
					((Employee) people[i]).showEmployeeInfo();
				}

				else if (people[i] instanceof Student) {
					((Student) people[i]).showStudentInfo();
				} else {
					people[i].showInfo();
				}
			}
		}
		for (int i = 0; i < people.length; i++) {
			if (people[i] != null && people[i] instanceof Employee) {
				((Employee) people[i]).calculateOvertime(2);
			}
		}

	}

}
