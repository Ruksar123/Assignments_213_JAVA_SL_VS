package inner.program;

public class Car {
	private int data=30;  

	void display()
	{
	System.out.println("i am inside the outer class method");
	}


	class Inner
	{  
	//private int data=20;
	 
	void msg()
	{
	 System.out.println("data is "+data);
	}  
	 
	 // calling the duplicate method of the outer class
	void display()
	{
	 System.out.println("i am inside the inner class method");
	}// inner class accessing the outside private variable
	}  

	class Demo
	{
	void demo()
	{
	System.out.println("It is inner class");
	}
	}

	public static void main(String args[])
	{  
	 
	 Car obj=new Car();     // creating object of Outer class
	 
	 Car.Inner in=obj.new Inner();   // creating object of Inner class
	 in.msg();  
	 in.display();
	 
	 Car.Demo d=obj.new Demo();
	 d.demo();
	 

	}
}
