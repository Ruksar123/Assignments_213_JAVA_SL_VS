package Overloading.program;

public class Method {

	public static void calculate (int a, int b)
	{
		System.out.println("sum" + a+b);
	}
	
	public static void calculat(float f,int r)
	{
		System.out.println("AreaOfCircle" + f*r*r);
	}
	
	public static void calculate (double l, int w)
	{
		System.out.println("AreaOfRectangle"+ l*w);
	}
	public static void main(String[] args) {
		
		calculate(5,10);
		calculate(3.14f,4);
		calculate(3.14,3);
	}

}
