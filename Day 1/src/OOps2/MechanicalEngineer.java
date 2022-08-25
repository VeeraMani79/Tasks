package OOps2;

public class MechanicalEngineer extends Engineer {
	private String post;
	private char grade;

	public void setPost(String post) {
		this.post = post;
	}

	public String getPost() {
		return this.post;
	}

	public void setGrade(char grade) {
		this.grade = grade;

	}

	public char getGrade() {
		return this.grade;
	}

	public MechanicalEngineer(String post, char grade, String name, int id, String address, int salary) {

		super(name, id, address, salary);
		this.post = post;
		this.grade = grade;
	}

	public String toString() {
		return "post=" + post + "," + " grade=" + grade + "," + super.toString();
	}
}

