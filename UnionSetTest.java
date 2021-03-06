package ISITest;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.junit.*;

public class UnionSetTest{

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
		UnionSet.unionSet(null, null);
	}
	
	@Test() 
	public void RepeatedElement()
	{
		b.add(1);
		Set<Integer>  setSolution = new HashSet<>();
		setSolution.add(1);
		setSolution.add(2);
		setSolution.add(3);
        assertTrue(setSolution.equals(UnionSet.unionSet(a, b)));
	}
	
	@Test() 
	public void ElementNull()
	{
		b.add(null);
		Set<Integer>  setSolution = new HashSet<>();
		setSolution.add(1);
		setSolution.add(2);
		setSolution.add(3);
		setSolution.add(null);
        assertTrue(setSolution.equals(UnionSetGeneric.unionSetGeneric(a, b)));
	}
	
}

