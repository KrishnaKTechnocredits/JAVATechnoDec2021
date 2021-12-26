package archana;
import java.util.Scanner;

public class Ass12_ReverseString {
	
	static String str="";
	static void reverseString(String s)
    {
		for (int Findex = s.length()-1 ;Findex >= 0;  Findex--) {
			 //System.out.print("Reverse string : "+s.charAt(Findex));
			str = str +s.charAt(Findex);
		}
       
    
    }
	 static public void main (String[] args)
	    {        
	      Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter String Name : ");
	      String strname = scan.next();
	      reverseString(strname);
	      System.out.print("Reverse String : "+str);
	      scan.close();
	    }
}
