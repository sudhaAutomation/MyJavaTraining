package basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsClasses {

	public static void main(String[] args) {
		int i = 20;

		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(30);
		a.add(40);
		a.add(30);
		a.add(40);
		System.out.println(a);
		System.out.println(a.remove(3));
		System.out.println(a);
		LinkedList<Integer> l = new LinkedList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(200);
		l.add(300);
		l.add(200);
		l.add(300);
		System.out.println(l);
		System.out.println(a.addAll(l));
		System.out.println(a);
		System.out.println(a.removeAll(l));
		System.out.println(a);
		HashSet<String> h = new HashSet<>();// avoid the duplicate elememts
		h.add("Ramu");
		h.add("Somu");
		h.add("Ramu");
		h.add("Gopal");
		System.out.println(h);
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("chandu", 1234);
		hm.put("gopal", 123);
		hm.put("gopal", 1234);
		hm.put("gowtham", 1234);
		hm.put("gowtham", 12345);
		System.out.println(hm);
		Iterator<String> it = h.iterator();
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		
		
	}

}
