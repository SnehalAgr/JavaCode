package exceptionHandling;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hasgtable {

	public static void main(String[] args) {
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put("cName" , "Synechron");
		ht.put("location" , "Hyd");
		ht.put("country" , "India");
		
		Enumeration<Object> k= ht.keys();
		Enumeration<Object> e= ht.elements();
while(e.hasMoreElements())
	System.out.println(k.nextElement());
	}

}
