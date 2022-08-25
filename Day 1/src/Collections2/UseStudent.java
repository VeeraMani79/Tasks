package Collections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
	
	public static void main(String [] args) {
		
		Student s1=new Student("Veera",21,9846329490l,"Male","EDumbaiyan",615);
		Student s2=new Student("Priya",25,9846376490l,"Female","Kadamban",614);
		Student s3=new Student("Manoj",26,9846329490l,"Male","Kathir",613);
		Student s4=new Student("Arun",23,9846399490l,"Male","Velan",612);
		Student s5=new Student("Jesee",22,9846329490l,"female","Imran",617);
		Student s6=new Student("Keerthana",23,9846629490l,"female","Kadamban",618);
		Student s7=new Student("Buvana",20,9846999490l,"female","Vijay",619);
		Student s8=new Student("Abishek",28,9846329490l,"Male","Suriya",616);
		Student s9=new Student("Abi",24,9846355490l,"femalee","Soori",611);
		Student s10=new Student("Maran",29,9866329490l,"Male","Vishnu",610);
		
		HashMap<Integer,Student>hm=new HashMap<> ();
		
		hm.put(s1.getId(),s1);
		hm.put(s2.getId(),s2);
		hm.put(s3.getId(),s3);
		hm.put(s4.getId(),s4);
		hm.put(s5.getId(), s5);
		hm.put(s6.getId(), s6);
		hm.put(s7.getId(), s7);
		hm.put(s8.getId(), s8);
		hm.put(s9.getId(), s9);
		hm.put(s10.getId(), s10);
		
		//hm.forEach((x,y)->System.out.println(y.getName().concat(y.getFather())));     //conact
		
//		Iterator<Student>ans=hm.values().iterator();
//		while(ans.next().getGen()=="female") {
//			ans.remove();
//		}
//	
//	System.out.println(hm);
//		
		for(Student x : hm.values() ) {
			if(x.getName().length()%2==0) {
				System.out.println(x.getName().charAt(x.getName().length()/2));
		}
			else {
				System.out.println(x.getName().substring((x.getName().length()/2-1),(x.getName().length()/2+1)));
			} // using last letter find
		
	}

	}
}
