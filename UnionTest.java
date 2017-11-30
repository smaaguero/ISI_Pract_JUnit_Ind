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
	
	@Test() 
	public void RepeatedElement()
	{
		b.add(1);
        Vector vectorSolution = new Vector(5);
        vectorSolution.addElement(1);
        vectorSolution.addElement(2);
        vectorSolution.addElement(3);
        assertTrue(vectorSolution.equals(Union.union(a, b)));
	}
	
	@Test() 
	public void DifferentClasses()
	{
		a.add("string");
		b.add(("string2"));
        Vector vectorSolution = new Vector(5);
        vectorSolution.addElement(1);
        vectorSolution.addElement(2);
        vectorSolution.addElement("string");
        vectorSolution.addElement(3);
        vectorSolution.addElement("string2");
        assertTrue(vectorSolution.equals(Union.union(a, b)));
	}
	
}

