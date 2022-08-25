package Collections2;

public class CustomerDetails {

	private String name;
	private int age;
	private String email;
	private long addharNo;
	private String panNo;
	
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
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return this.email;
		
	}
	public void setNo(long addharNo) {
		this.addharNo=addharNo;
	}
	public long getNo() {
		return this.addharNo;
		
	}
	public void setPan(String panNo) {
		this.panNo=panNo;
	}
	public String getPan() {
		return this.panNo;
		
	}
	public  CustomerDetails(String name,int age,String email,long addharNo,String panNo)  {
		this.name=name;
		this.age=age;
		this.email=email;
		this.addharNo=addharNo;
		this.panNo=panNo;
	}
//	public String toString() {
//		return "Name="+name+","+"Age="+age+","+"Email="+email+","+"ANO="+addharNo+","+"PNo="+panNo;
//	}
}
