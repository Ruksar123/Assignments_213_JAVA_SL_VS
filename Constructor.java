package Overloading.program;

public class Constructor {

	Constructor()
	{
		
	}
	int a;
	float b;
	double z;
	
	Constructor(int x)
	{
		 a=x*x;
	}
	
	Constructor(float x,float y)
	{
		 b= x*y;
	}
	
	Constructor(double x)
	{
		z=3.14f*x*x;
	}
	
	void Area()
	{
		System.out.println("AreaOf Square " + a);
		System.out.println("AreaOfrectangle  " + b);
		System.out.println("AreaOfcircle  " + z);
	}

	public static void main(String[] args) {
		Constructor C=new Constructor(3);
		C.Area();
		Constructor d=new Constructor(3.21f,4.4f);
		d.Area();
		Constructor e=new Constructor(5f);
		e.Area();

	}


}
