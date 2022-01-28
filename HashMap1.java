package map.program;

import java.util.HashMap;

public class HashMap1 {

	 public static void main(String a[]){
			
	    	HashMap hm = new HashMap();
			
	    	hm.put("1","Orange");
	        hm.put("2","mango");
	        hm.put("3","Banana");
			hm.put("4","Papaya");
			hm.put("5","Apple");
			hm.put("6","Kiwi");
			hm.put("7","pinaple");
			hm.put("8","Grapes");
			hm.put("9","Star Fruit");
			hm.put("10","Avacoda");
			
	        System.out.println("hashmap is "+ hm);
	        System.out.println("Value of 3 key: "+ hm.get("3"));
	        System.out.println("Is HashMap empty? "+hm.isEmpty());
	        
	        hm.remove("4");
	        System.out.println("After removal process, the hashmap is "+hm);
	        hm.remove("7");
	        System.out.println("After removal process, the hashmap is "+hm);
	        
	        System.out.println("Size of the HashMap: "+hm.size());
	        
	        System.out.println(hm.containsValue("4"));
			System.out.println("Does hashmap contains this 'Banana' element  " + hm.containsKey("Banana"));		
			System.out.println("Does hashmap contains this 'Apple' element  " + hm.containsKey("Apple"));		

	        
	    }

}
