package ISITest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UnionSet {
	
	public static Set unionSet (Set a, Set b) {		
		if (a == null || b == null) {
			throw new NullPointerException();
		}

        Set<Object> setDevuelto = new HashSet<Object>();        
        return setDevuelto;
                
	}
}

