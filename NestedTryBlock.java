package Exception.program;

public class NestedTryBlock {

	 public static void main(String[] args) {
		 int a[]=new int[5];
	        try {
	        	a[6]=5;
	        }
	        catch (ArrayIndexOutOfBoundsException e) 
	        {
	            System.out.println("ArrayIndexOutOfBondException");
	        } 
	        try {
	        	a[4]=4/0;
	        }
	        catch (ArithmeticException e) {
	            System.out.println("ArithmeticException");
	        } finally {
	            System.out.println("Finally outside method");
	        }
	    }
}
