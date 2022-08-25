package Collections2;

public class Student {
	private String name;
	private int age;
	private long mobNo;
	private String gender;
	private String fatherName;
	private int id;
	
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
		
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
		
	}	
	
	public void setNo(long mobNo) {
		this.mobNo=mobNo;
	}
	public long getNo() {
		return this.mobNo;
		
	}
	public void setGen(String gender) {
		this.gender=gender;
	}
	public String getGen() {
		return this.gender;
	}
	public void setFather(String fatherName) {
		this.fatherName=fatherName;
	}
	public String getFather() {
		return this.fatherName;
	}
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
   public Student(String name,int age,long mobNo,String gender,String fatherName,int id) {
	   this.name=name;
	   this.age=age;
	   this.mobNo=mobNo;
	   this.gender=gender;
	   this.fatherName=fatherName;
	   this.id=id;
   }
   public String toString() {
	   return "Name="+name+","+"Age="+age+","+"MNo="+mobNo+","+"Gender="+gender+","+"FATHER NAME="+fatherName+","+"Id="+id;
   }
}
