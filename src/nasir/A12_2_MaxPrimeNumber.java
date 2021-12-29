package nasir;

import java.util.Scanner;

public class A12_2_MaxPrimeNumber {
	/*find max prime number from given range. [range : 2 to 100, ans ; 97]*/
	
	void maxPrimeNumber(int startNumber, int endNumber) {
		for(int index=startNumber;index<=endNumber;index++) {
			boolean flag=true;
			for(int innerIndex=2; innerIndex<index;innerIndex++) {				
				if(index%innerIndex==0) {
					flag=false;
					break;
				}				
			}	
			if(flag==true)
				System.out.println("Prime number is "+index);				
		}		
	}
	
	public static void main(String[] args) {
		A12_2_MaxPrimeNumber maxprimenumber = new A12_2_MaxPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter start number of Range");
		int num1=scanner.nextInt();
		System.out.println("Enter end number of Range");
		int num2=scanner.nextInt();
		maxprimenumber.maxPrimeNumber(num1,num2);
	}
}
