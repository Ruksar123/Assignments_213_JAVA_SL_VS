package Serialization.program;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDe_serial {
	 public static void main(String args[]) throws IOException 
	  {
	    Student obj = new Student("Ruksar", 01, 123456, "Testing", 24, 'F', "abc@gmail.com");
	    
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C://Users//USER//Desktop//ruksar"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
    
    //Deserialization
    Student o=null;
    try{
      FileInputStream fis = new FileInputStream("C://Users//USER//Desktop//ruksar");
      ObjectInputStream ois = new ObjectInputStream(fis);
      o = (Student)ois.readObject();
      ois.close();
      fis.close();
    }
    catch(IOException ioe)
    {
       ioe.printStackTrace();
       return;
    }catch(ClassNotFoundException cnfe)
     {
       System.out.println("Student Class is not found.");
       cnfe.printStackTrace();
       return;
     }
    System.out.println("Student Name:"+o.getname());
    System.out.println("Student Age:"+o.getage());
    System.out.println("Studen gender:"+o.getgender());
    System.out.println("Student id:"+o.getid());
    System.out.println("Student deptartment:"+o.getdept());
    System.out.println("Student contact:"+o.getcontact());
    
 }
}

//------------------------------Student-------------------------//
class Student implements java.io.Serializable{
	  
	  private String name;
	  private int id;
	  private transient int contact;
	  private String dept;  
	  private int age;
	  private char gender;
	  private String email;//
	  
	  public Student(String n, int i, int c, String d, int a, char g, String e) {
	    this.name = n;
	    this.id = i;
	    this.contact= c;
	    this.dept = d;
	    this.age = a;
	    this.gender = g;
	    this.email = e;
	  }
	  


	public String getname() {
	    return name;
	  }
	 public void setname(String name) {
	    this.name = name;
	 }
	  public void setid(int id) {
	    this.id = id;
	  }
	  public int getid() {
		return id;
		}
	  public int getage() {
	    return age;
	  }
	  public void setage(int age) {
	    this.age = age;
	  }
	  public char getgender() {
	    return gender;
	  }
	  public void setgender() {
	    this.gender = gender;
	  }
	  public String getemail() {
	    return email;
	  }
	  public void setemail(String email) {
	    this.email = email;
	  }
	  public String getdept() {
		    return dept;
		  }
	  public void setdept(String dept) {
	    this.dept = dept;
	  }
	  public int getcontact() {
		    return contact;
		  }
	  public void setcontact(int contact) {
	    this.contact = contact;
	  }
}
