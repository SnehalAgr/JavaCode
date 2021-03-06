package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map mp = new TreeMap();
		
		mp.put("name", "aravinda");
		mp.put("age", "38");
		mp.put("location", "bangalore");
		
		System.out.println("Total entries=" + mp.size());
		
		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		
		while(it.hasNext())
		{
			System.out.println(mp.get(it.next()));
		}
	}

}
