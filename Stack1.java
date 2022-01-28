package Stack.program;

import java.io.*;
import java.util.Stack;

public class stack1 {
	static void stack_push(Stack<Integer> stack) 
	 { 
		 System.out.println("Push Operation:"); 
	     for(int i = 0; i < 5; i++) 
	     { 
	         stack.push(i); 
	     } 
	 } 
	   
	 // Popping element from the top of the stack 
	 static void stack_pop(Stack<Integer> stack) 
	 { 
	     System.out.println("Pop Operation:"); 

	     for(int i = 0; i < 5; i++) 
	     { 
	         Integer y = (Integer) stack.pop(); 
	         System.out.println(y); 
    }
 }
}
