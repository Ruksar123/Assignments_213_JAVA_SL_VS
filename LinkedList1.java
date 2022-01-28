package collection.program;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedList1 {
    public static void main(String a[]){
    	
    	int a1=6;
    	
        LinkedList<String> ll = new LinkedList<String>();
        
        ll.add("May");
        ll.add("June");
        ll.add("July");
        ll.add("August");
        ll.add("April");
        ll.add("November");
        //ll.add(a1);    // wrapping of primitive is done automatically to convert to Integer object
                
        ll.addFirst("January");
        ll.addLast("December");
        ll.add(2, "March");
        ll.add(1, "february");
        ll.add(8, "semptember");
        ll.add(9, "October");
                 
       
        System.out.println(ll);
        System.out.println("Size of the linked list: "+ll.size());
        
        Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("list is"+ itr.next());
        }
        
        System.out.println("Is LinkedList empty? "+ll.isEmpty());
        System.out.println("Does LinkedList contains 'September'? "+ll.contains("September"));
               
        
       /* Vector<String> v = new Vector<String>();
        v.add("Jaipur");
        v.add("Delhi");
        v.add("Mumbai");
        
        Iterator itr1=v.iterator();
        while(itr1.hasNext()) {
        System.out.println("Vector is"+ itr1.next());
        }
        */
    }
}