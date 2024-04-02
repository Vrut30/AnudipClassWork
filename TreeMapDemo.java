package HashMap.org;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		
		tm.put(1, "abc");
		tm.put(5, "vrutvik");
		tm.put(14, "ram");
		tm.put(6, "shyam");
		tm.put(7, null);
		tm.put(3, "sita");
		tm.put(8, null);
		
		tm.put(11, "sita");
		
		System.out.println(tm);
	}

}
