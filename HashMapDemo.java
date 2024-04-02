package HashMap.org;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		HashMap HM =new  HashMap();
		
		HM.put(1, "Krushna");// Duplicate value are  allowed
		HM.put(5, "Krushna");
		HM.put(1, "Tejas");
		HM.put("Krushna",  8);
		HM.put("Nitesh",  8);
		HM.put(10, null);
		HM.put(11, null);
		HM.put( null,  10);
		HM.put(9, "Omkar");
		HM.put(1, "Krushna");// Duplicate key is not allowed
		HM.put(12,  8);
		HM.put(12.3f ,  8);
		HM.put(15,3.8f);
		
		//HM.remove(5); //remove the one element is define key
		//HM.remove(10, null); // another ways to remove element
		//HM.clear();   // clear all  the element in the HashMap
		System.out.println(HM);
		
		//HM.replace(1, "Rohit"); //replace the 1 key of value  pahile krushna tha ab Rohit hai
		//HM.replace(9, "Omkar", "Sukesh"); //replace the value define key,oldvalue and NewValue
		
		
		
		System.out.println(HM);
		
	}

}

