import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {

@Before
  
 public void beforeCase() {
	System.out.println("welcome"); // @Before case
}
@Test
  
  public void testCase() {
	System.out.println("This is Test Case"); //@Test case
}
@After
 public void afterCase() {
	System.out.println("Thanks");  // @AfterCase
}
}