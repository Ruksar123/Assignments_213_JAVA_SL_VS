package regex.program;

import java.util.regex.*;
import java.util.*;

public class Regex {

    public static void main(String args[]){  
        ArrayList<String> Mail = new ArrayList<String>();  
        Mail.add("firstName@domain.co.in");  
        Mail.add("firstName@domain.com");  
        Mail.add("firstName.name@domain.com");  
        Mail.add("firstName#@domain.co.in");  
        Mail.add("firstName@domain.com");  
        Mail.add("firstName@domaincom");
        
        //Add invalid emails in list  
        Mail.add("@yahoo.com");  
        Mail.add("firstName#domain.com"); 
        
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        
        //Iterate emails array list  
        for(String email : Mail){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(matcher.matches());
            //System.out.println(Mail +" : "+ matcher.matches());  
        }  
    }  
}
