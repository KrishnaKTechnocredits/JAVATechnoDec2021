package debasmita;

import java.util.Scanner;

public class A12_MaxPrimeNumber {
	
	boolean maxPrimeNumber(int num) {
		boolean flag = true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0) {
				flag= false;
				break;
			}
		}
		
		return flag;
	}
	void primeNoInRange(int startNo,int endNo) {
		 int i;
		 int count=0;
		 for(i=endNo;i>=startNo; i--) {
			 boolean maxprime=maxPrimeNumber(i);
			 if(maxprime==true) 
				 count++;
			 if(count==1)
				 break;
		 }
			System.out.println("The maximum prime number is: "+i);
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start number :");
		int startnumber=sc.nextInt();
		System.out.println("Enter the end number :");
		int endnumber=sc.nextInt();
    	A12_MaxPrimeNumber maxpnumber= new A12_MaxPrimeNumber();
    	maxpnumber.primeNoInRange(startnumber,endnumber);
    	sc.close();
    }
}
