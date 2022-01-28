package core.programs;

public class DataType1 {

	public static void main(String[] args) {
	String s="100";
		
		int i= Integer.parseInt(s);
		System.out.println("int value " + i);

			
		long l= Long.parseLong(s);
		System.out.println("long value " + l);
		
		float F=Float.parseFloat(s);
		System.out.println("Float value " + F);

		double D=Double.parseDouble(s);
		System.out.println("double value " + D);
		
		boolean B= Boolean.parseBoolean(s);
		System.out.println("Boolean value "+B);
		
		//char a=char.parsechar(s);
		//System.out.println("char value " +a);
}
}
