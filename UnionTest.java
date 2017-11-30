package ISITest;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.*;

public class UnionTest {

	Vector a = new Vector();
	Vector b = new Vector();

	@Before public void setUp()         // set up test fixture
	{     
		a.add(1);
		a.add(2);
		b.add(3);
	}
	
	@Test(expected=NullPointerException.class) 
	public void TestAOrBNull()
	{
		Union.union(null, null);
	}
	
}

