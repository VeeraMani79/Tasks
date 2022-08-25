import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class UseNames {

  Names n=new Names();
  @Test 
  public void equals() {
	  String [] name= {"Veera","Mani","Ram"};
	String name1=n.findLengthName(name);
	assertEquals(name1,"VEERA");
	}




}
