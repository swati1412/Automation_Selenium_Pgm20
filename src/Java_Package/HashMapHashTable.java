package Java_Package;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapHashTable {

	public static void main(String[] args) {

		// ======HashMap==========//
		HashMap<Object, Object> hm = new HashMap<Object, Object>(); // Creating HashMap Object
		hm.put(1, "Jan");
		hm.put(2, "Feb");
		hm.put("3", "Mar");
		System.out.println(hm.get(1)); // Jan
		System.out.println(hm.get(2)); // Feb
		System.out.println(hm.get("3")); // Mar
		System.out.println(hm.values());

		System.out.println("========HashMap Done=========");

		// ======Hashtable==========//
		Hashtable<Object, Object> ht = new Hashtable<Object, Object>();
		ht.put(1, "Jan");
		ht.put(2, "Feb");
		ht.put(3, "Mar");
		System.out.println(ht.get(1)); // Jan
		System.out.println(ht.get(2)); // Feb
		System.out.println(ht.get(3)); // Mar
		System.out.println(ht.values());

		System.out.println("========Hashtable Done=========");
	}
}
