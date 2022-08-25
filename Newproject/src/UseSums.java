import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UseSums {
	
		Sums s= new Sums ();
	@Before
	
	public void beforeCase() {
		System.out.println("Welcome");//
	}
	@Test
	public void testAdd() {
	
	s.findAdd(10,20);
	}
	@Test
  public void testSub() {
	s.findSubtraction(20,10);
  }
	@Test
  public void tesMul() {
	  s.findMultiply(10, 20);
  }
  @After
  public void afterCase() {
	  System.out.println("Thanks");
  }
}
