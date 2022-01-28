package Absract.program;

abstract class vehicle1 {
abstract void run();
abstract void stop();
public void fuel(int a)
{
	System.out.println("value is = "+ a);
}
public void fuel(float f, String s)
{
	System.out.println("value is = "+ f + "and =" +s);

}
public void fuel(int a, char c)
{
	System.out.println("value is = "+ c + "and =" + a + "\n");
}
int speed =60;
long distance=3500;
vehicle1()
{
	System.out.println("vehicle is created");
}
vehicle1(int a,long d)
{
speed=a;
distance=d;
}	
}

class Wtwo extends vehicle1 {

@Override
void run() {
	System.out.println("W2 is run");
}

@Override
void stop() {
	System.out.println("W2 is stop");
}
Wtwo()
{
	
}
int speed1=110;
long distance1=35L;
int num_of_tyre=2;
public void display()
{
	System.out.println("speed = "+ speed1 + "distance = " + distance1 + "No Of tyre = " + num_of_tyre);
	System.out.println("vehicle speed"+ super.speed + "vehicle distance" + super.distance);
}
}
class Wthree extends vehicle1 {

@Override
void run() {
	System.out.println("W3 is run");

}

@Override
void stop() {
	System.out.println("W3 is stop");

}
Wthree()
{
}
int speed2=50;
long distance2=20L;
int num_of_tyre2=3;

public void display1()
{
	System.out.println("speed = "+ speed2 + "distance = " + distance2 + "No Of tyre = " + num_of_tyre2);
	System.out.println("vehicle speed"+ super.speed + "vehicle distance" + super.distance);	
}
}
class Wfour extends vehicle1 {

@Override
void run() {
	System.out.println("W4 is run");

}

@Override
void stop() {
	System.out.println("W4 is stop");

}
Wfour()
{
}
int speed3=160;
long distance3=15L;
int num_of_tyre3=4;

public void display2()
{
	System.out.println("speed = "+ speed3 + "distance = " + distance3 + "No Of tyre = " + num_of_tyre3);
	System.out.println("vehicle speed"+ super.speed + "vehicle distance" + super.distance);
}
}
class Weight extends vehicle1 {

@Override
void run() {
	System.out.println("W8 is run");

}

@Override
void stop() {
	System.out.println("W8 is stop");
}
Weight()
{
}
int speed4=60;
long distance4=8L;
int num_of_tyre4=8;

public void display3()
{
	System.out.println("speed = "+ speed4 + "distance = " + distance4 + "No Of tyre = " + num_of_tyre4);
	System.out.println("vehicle speed"+ super.speed + "vehicle distance" + super.distance);
}
}

public class Abstract1 {
public static void main(String args[]) {
	vehicle1 a=new Wtwo();
	vehicle1 b=new Wthree();
	vehicle1 c=new Wfour();
	vehicle1 d=new Weight();
	a.run();
	b.run();
	c.run();
	d.run();
	a.stop();
	b.stop();
	c.stop();
	d.stop();
	
	Wtwo p=new Wtwo();
	p.display();
	
	Wthree q=new Wthree();
	q.display1();
	
	Wfour r=new Wfour();
	r.display2();
	
	Weight s=new Weight();
	s.display3();
}
}
