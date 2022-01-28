package collection.program;

import java.util.*;

public class HashSetDemo {

		public static void main(String[] args){
			//LinkedHashSet<String> ls=new LinkedHashSet<String>();
			HashSet<String> Fruit=new HashSet<String>();
			
			Fruit.add("Papaya");
			Fruit.add("Orange");
			Fruit.add("Guava");
			Fruit.add("Cherry");
			Fruit.add("Watermelon");
			Fruit.add("Avocado");
			Fruit.add("Fig");
			Fruit.add("Star Fruit");
			Fruit.add("Grapes");
			Fruit.add("Sweet Lime");
					
			System.out.println("Hashset is "+Fruit);
			System.out.println("Size of Hashset is "+ Fruit.size());
			Fruit.add("Guava");
			Fruit.add("Pear");
			Fruit.add("Mulberry");
			System.out.println("Hashset is "+Fruit);
			System.out.println("Size of Hashset is "+ Fruit.size());
			System.out.println("Does hashset contains this 'Orange' element  " + Fruit.contains("Orange"));		
			System.out.println("is hashset empty  " + Fruit.isEmpty());
			//System.out.println("remove the element "+hs.remove("i"));
			    
		  	}

}
