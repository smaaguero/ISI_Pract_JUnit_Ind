package ISITest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.*;

public class UnionSetGenericTest{

	Set<Integer> a = new HashSet<>();
	Set<Integer> b = new HashSet<>();
	
	@Before public void setUp()         // set up test fixture
	{     
		a.add(1);
		a.add(2);
		b.add(3);
	}
	
	@Test(expected=NullPointerException.class) 
	public void TestAOrBNull()
	{
		UnionSetGeneric.unionSetGeneric(null, null);
	}
	
	@Test() 
	public void RepeatedElement()
	{
		b.add(1);
		Set<Integer>  setSolution = new HashSet<>();
		setSolution.add(1);
		setSolution.add(2);
		setSolution.add(3);
        assertTrue(setSolution.equals(UnionSetGeneric.unionSetGeneric(a, b)));
	}
	
	
}

