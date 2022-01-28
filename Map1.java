package map.program;

import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class Map1 {

	  public static void main(String[] args) {
	        
		    Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		    //TreeMap<Integer, String> linkedHashMap = new TreeMap<Integer, String>();

	        
	        linkedHashMap.put(1, new String("banana"));
	        linkedHashMap.put(2, new String("mango"));
	        linkedHashMap.put(3, new String("papaya"));
	        linkedHashMap.put(4, new String("strawberry"));
	        linkedHashMap.put(5, new String("star fruit"));
	        linkedHashMap.put(6, new String("avacoda"));
	        linkedHashMap.put(7, new String("kiwi"));
	        linkedHashMap.put(8, new String("orange"));
	        linkedHashMap.put(9, new String("grapes"));
	        linkedHashMap.put(10, new String("apple"));
	        
	        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
	        System.out.println("\nValues of map after iterating over it : ");
	        
	        for (Integer key : linkedHashMap.keySet()) {
	            System.out.println(key + ":\t" + linkedHashMap.get(key));
	        }
	        
	        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
	        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
	        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
	        System.out.println("LinkedHashMap contains Apple as value? : " + linkedHashMap.containsValue("apple"));
	        System.out.println("LinkedHashMap contains banana as value? : " + linkedHashMap.containsValue("banana"));
	        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
	        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
	        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
	       
	        linkedHashMap.clear();
	        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
	    }
}
