package HashMap.org;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{

	public static void main(String[] args) 
	{
		HashSet Hset=new HashSet();
		
		Hset.add(50);
		Hset.add(10);
		Hset.add(50);// duplicate Are not allowed
		Hset.add(11);
		Hset.add("Krushna");
		Hset.add("Krushna");
		Hset.add("Aniket");
		Hset.add(2.3f);
		Hset.add(5.7f);
		Hset.add(1);
		Hset.add(8);
		Hset.add(40);
		Hset.add(0);
		Hset.add(null);
		Hset.add(true);
		
		/*Iterator i =Hset.iterator();
		
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}*/
		System.out.println(Hset);
		//Hset.clear();// remove all element 
		//Hset.remove(50); // At a time one element remove
		//Hset.removeAll(Hset);// this time remove all the element
		//Hset.retainAll(Hset);
		System.out.println(Hset.size()); // size of the HashSet
		//System.out.println(Hset.isEmpty());
		//System.out.println(Hset.contains(Hset));
		System.out.println(Hset.clone());
		
		System.out.println(Hset);
		
		

	}

}
