package OOps2;

public class Engineer {

	private String name;
	private int id;
	private String address;
	private int salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void  setAdd(String address) {
		this.address=address;
	}
	public String getAdd() {
		return this.address;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public Engineer (String name,int id,String address,int salary) {
		this.name=name;
		this.id=id;
		this.address=address;
		this.salary=salary;
}
	public String toString() {
		return "name="+name+" ,id="+id+" ,address="+address+" ,salary="+salary;
	
	}
	} 
