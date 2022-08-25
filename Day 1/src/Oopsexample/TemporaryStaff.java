package Oopsexample;

public class TemporaryStaff extends Staff {

	private int days;
	private int exp;
	public void setDay(int days) {
		this.days=days;
	}
	public int getDays() {
		return this.days;
	}
	public void setExp(int exp) {
		this.exp=exp;
	}
	public int getExp() {
		return this.exp;
	}
	
	public TemporaryStaff(int days,int exp,String name,int salary,String name1,int id,int age,String add) {
		super(name,age,add,id,salary,name1);
		this.days=days;
		this.exp=exp;
	}
	public String toString() {
		return "days="+days+", "+"exe="+exp+","+super.toString();
	}
}