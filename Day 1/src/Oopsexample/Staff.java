package Oopsexample;

public class Staff extends Person {

	private int id;
	private int salary;
	private String name1;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setSal(int salary) {
		this.salary=salary;
	}
	public int getSal() {
		return this.salary;
	}
	public void setName(String name1) {
		this.name1=name1;
	}
	public String getName() {
		return this.name1;
	}	
	
public Staff (String name,int salary,String name1,int id,int age,String add) {
	super(name,age,add);
	this.id=id;
	this.salary=salary;
	this.name1=name1;
	
}
public String toString() {
	return "id="+id+", "+"salary="+salary+","+"name1="+name1+","+super.toString();
}
}
