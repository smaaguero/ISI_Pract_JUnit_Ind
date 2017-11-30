package ISITest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionSetGeneric {
	
	public static <E> Set<E> unionSetGeneric (Set<? extends E> a, Set<? extends E> b)	{
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		
        Set<E> setDevuelto = new HashSet<E>();        
        return setDevuelto;
                
	}
}

