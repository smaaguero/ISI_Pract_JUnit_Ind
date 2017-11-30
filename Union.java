package ISITest;

import java.util.Vector;

public class Union {
	
	public static Vector union (Vector a, Vector b)
	{
		if (a == null || b == null) {
			throw new NullPointerException();
		}
        Vector vectorDevuelto = new Vector();
        for (int i=0;i<a.size();i++) {
            if (!vectorDevuelto.contains(a.elementAt(i))) {
            	vectorDevuelto.addElement(a.elementAt(i));
            }
        }
        for (int i=0;i<b.size();i++) {
            if (!vectorDevuelto.contains(b.elementAt(i))) {
            	vectorDevuelto.addElement(b.elementAt(i));
            }
        }
        System.err.println(vectorDevuelto);
        return vectorDevuelto;
                
	}
}
