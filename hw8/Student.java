package hw8;

public class Student extends Person {
	private static final double MIN_SCORE = 2;
	private static final double MAX_SCORE = 6;
	private double score;

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}

	void showStudentInfo() {
		showInfo();
		System.out.println(this.score + " - score of " + this.getName());
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		if (score >= MIN_SCORE && score <= MAX_SCORE) {
			this.score = score;
		}
	}

}
