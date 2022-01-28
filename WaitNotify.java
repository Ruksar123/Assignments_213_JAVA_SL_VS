package Thread.program;

class customer {
	int amount=10000;  
	  
	synchronized void withdraw(int amount){  
	System.out.println("going to withdraw...");  
	  
		if(this.amount<amount)
		{  
		System.out.println("Less balance; waiting for deposit...");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		
		System.out.println("deposit completed... " + this.amount);  
		notify();  //unlocking of thread
	}  
}  
  
public class WaitNotify { 
	public static void main(String args[]){  
		final customer c=new customer();  
		
		new Thread(){                 // anonymous class
		  public void run()
		  {
			c.withdraw(4000);
		  }  
		}.start(); 
		
		new Thread(){                 // anonymous class
			  public void run()
			  {
				c.withdraw(5000);
			  }  
			}.start(); 
			
			new Thread(){                 // anonymous class
				  public void run()
				  {
					c.withdraw(10000);
				  }  
				}.start(); 
		
		new Thread(){  
		  public void run()
		   {
			 c.deposit(20000);
		   }  
		}.start();    
	}
}
