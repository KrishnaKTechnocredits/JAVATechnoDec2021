package debasmita;

import java.util.Scanner;

public class A12_ReverseNumber {
	
	void reverseNumber(int num) {
		int rev=0;
		while(num>0) {
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
			}
		System.out.println("The Reverse number is "+rev);
	}
     public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
    	 System.out.println("Enter the number :");
    	 int num = sc.nextInt();
    	 A12_ReverseNumber reversenumber= new A12_ReverseNumber();
    	 reversenumber.reverseNumber(num);
    	 sc.close();
    	 
     }
}
