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
        
        for (Iterator i = a.iterator(); i.hasNext(); ) {
            Object f = i.next();
            if (!setDevuelto.contains(f)) {
            	setDevuelto.add(f);
            }
        }

        
        for (Iterator i = b.iterator(); i.hasNext(); ) {
            Object f = i.next();
            if (!setDevuelto.contains(f)) {
            	setDevuelto.add(f);
            }
        }
        System.err.println(setDevuelto);
        return setDevuelto;
                
	}
}

