package archana;

import java.util.Scanner;

public class Ass12_FreqofChar {
	static String ch;
	static void  FrequOfChar(String name) {
		
		for (int index =0 ; index< name.length();index++) {
			int count=0;
			for (int index2 =0 ; index2< name.length();index2++) {
				
				if( name.charAt(index)==name.charAt(index2)) {
					count ++;
					ch = ch+name.charAt(index);
				}				
			}
			
			 System.out.println("Frquence of :"+name.charAt(index)+" is : "+count);
			  
		}
		
	}
	
	 static public void main (String[] args)
	    {        
	    	  Scanner scan = new Scanner(System.in);   
		      System.out.println("Enter name  : ");
		      String  name = scan.next();
		      FrequOfChar(name);	      
		      scan.close();
	    }
}
