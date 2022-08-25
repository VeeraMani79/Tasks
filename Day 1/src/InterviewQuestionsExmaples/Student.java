package InterviewQuestionsExmaples;

public class Student {
	
		   private int rno;
		   private String name;
		   public Student(int r, String n) {
		      rno = r;
		      name = n;
		   }
		   public String toString() {
		      return rno + " " + name;
		   }
		}
		

//		Output
//		The student details are:
//		101 Susan Bones
//		Now let us understand the above program.
//
//		The Student class is created with data members rno, name. The constructor Student() initializes rno and name. The overridden method toString() displays a string representation of object s. A code snippet which demonstrates this is as follows:
//
