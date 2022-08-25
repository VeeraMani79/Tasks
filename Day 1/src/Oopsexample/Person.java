package Oopsexample;

public class Person {
 
	private String name;
	private int age;
	private String add;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int  age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAdd(String add) {
		this.add=add;
	}
	public String getAdd() {
		return this.add;
	}
	public Person(String name,int age,String add) {
	
	this.name=name;
	this.age=age;
	this.add=add;
	}
	public String toString() {
		return "name="+name+","+"age="+age+","+"add="+add;
	}
}
