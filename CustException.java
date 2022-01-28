package Exception.program;

public class CustException {

	static void validate(int salary)throws InvalidsalaryException{  
	     if(salary<2100)  
	      throw new InvalidsalaryException("you need to work hard"); 
	     else if (salary>2100 && salary <5000)  
	     throw new InvalidsalaryException("your salary is somehow good");  
	     else if(salary>5100 && salary <9000)
		 throw new InvalidsalaryException("salary is very good");  
	   }  
	     
	   public static void main(String args[]) {  
	      try{  
	        validate(4000);  
	      }
	      catch(Exception m)
	      {
	    	  System.out.println("Exception occured: "+ m.getMessage());
	      }  
	  
	      System.out.println("rest of the code...");  
	  }  
	}  

//This class is created for your own defined exception message
class InvalidsalaryException extends Exception{  // 1
	
	//private static final long serialVersionUID = 1L;

	InvalidsalaryException(String s){  //2
	  super(s);  
	 }  

}
