package Inheritance.program;

class Product {

	int id=78;
	String name = "Amul";
	
	public void display()
	{
		System.out.println("id" +id + "name" + name);
	}	
}

class A extends Product{
	int count=50;
	String category="butter";
	
	public void display1()
	{
		System.out.println("id" +id + "name" + name + "count" + count + "category" +category);
	}
}

class B extends Product{
	int count=90;
	String category="milk";
	
	public void display2()
	{
		System.out.println("id" +id + "name" + name + "count" + count + "category" +category);
	}	
}

class C extends Product{
	int count=56;
	String category="choco";
	
	public void display3()
	{
		System.out.println("id" +id + "name" + name + "count" + count + "category" +category);
	}
}

class subA extends A{
	int price=30;
	int total_price;
	public void display4()
	{
		 total_price= count * price;
		System.out.println("id" +id + "name of product " + name + "category" +category);
	}
}

class subB extends B{
	int price=10;
	int total_price;
	public void display5()
	{
	 total_price= count * price;
		System.out.println("id" +id + "name of product " + name + "category" +category);
	}
}

public class Inheritance1{
	public static void main(String[] args) {
		subA p=new subA();
		p.display();
		p.display1();
		p.display4();
		
		subB q= new subB();
		q.display();
		q.display2();
		q.display5();
		
		C r=new C();
		r.display3();
	}

}