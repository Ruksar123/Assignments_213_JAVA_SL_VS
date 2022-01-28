package map.program;

import java.util.TreeMap;

public class Tmap {
	 public static void main(String[] args) {
	    	
	        TreeMap<Integer, String> fruits = new TreeMap<Integer, String>();
	        fruits.put(1, "apple");
	        fruits.put(2,"banana");
	        fruits.put(3, "mango");
	        fruits.put(4, "gava");
	        fruits.put(5, "kiwi");
	        fruits.put(6, "star fruit");
	        fruits.put(7, "apple");
	        fruits.put(8, "apple");
	        
	        for(Integer key: fruits.keySet()){
				System.out.println(key  +" : "+ fruits.get(key));
	        }
	    }

}
