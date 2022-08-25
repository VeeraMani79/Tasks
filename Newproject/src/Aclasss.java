import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Aclasss {

@Test
public void equals() {
	int a=10;
	int b=10;
	assertEquals(a,b);
}
@Test
public void notEquals() {
	int a=11;
	int b=10;
	assertNotEquals(a,b);
}
@Test
public void asserNull() {
	
	String a=null;
	String b=null;
	assertNull(a,b);
}
@Test
public void notNull() {
	String a=null;
	String b="veera";
	assertNotNull(a,b);
}
@Test
public void asserTrue() {
	boolean b=5==5;
	assertTrue(b);
}
@Test
public void asserFalse() {
	boolean b=6==7;
	assertFalse(b);
}
@Test
public void array() {
	int [] a= {1,3,5};
	int [] b= {1,3,5};
	assertArrayEquals(a,b);
}
@Test
public void same () {
	int a=4;
	int b=4;
	assertSame(a,b);
}@Test
public void notSame() {
	int a=5;
	int b=5;
}
}
