package nishika;

import java.util.Scanner;

public class A_12_3pro{
	static void reverseNumber(int num)
    {
		int rev =0;		
		while(num>0) {
			int r = num%10;			
			rev=rev*10+r;
			num=num/10;				
		}
		System.out.println("Reverse Number :  " + rev);
    }
    static public void main (String[] args)
    {        
    	 Scanner scan = new Scanner(System.in);   
	      System.out.println("Enter Number : ");
	      int  number = scan.nextInt();
	      reverseNumber(number);	      
	      scan.close();
    }
}
