/*Assignment - 12 : 26th Dec'2021

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class. 

2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]*/

package anjali;

import java.util.Scanner;

public class Anjali_Assignment12_program2 {
	
	boolean isPrime(int num) {	
		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0) {
				return false;
			}
		}
		return true;
	}
	
     void m1(int firstnumber,int lastnumber) {
    	 int maxprime=0;
        for(int index=firstnumber;index<=lastnumber;index++) {
           if(isPrime(index)==true) {
        	 maxprime=index;
           }
        }
        System.out.println("The maximum price no from given range is :"+maxprime);
    }
     
   public static void main(String[] args) {
		Anjali_Assignment12_program2 a12_program2=new Anjali_Assignment12_program2();
		Scanner scanner= new Scanner(System.in);
		System.out.println("please Enter the first No :");
		int startNo =scanner.nextInt();
		System.out.println("please Enter the second No :");
		int endNo =scanner.nextInt();
		a12_program2.m1(startNo,endNo);
		scanner.close();
  }

}

