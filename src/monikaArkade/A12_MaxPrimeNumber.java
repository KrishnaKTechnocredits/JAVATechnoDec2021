package monikaArkade;
import java.util.Scanner;

public class A12_MaxPrimeNumber {
	int number;
	void isPrimeNumber(int num) {
		boolean flag =true;
		for(int index=2;index<num;index++){
			if(num%index==0) {
				//System.out.println("Not a prime number");
				flag = false;
				break;
			}
		}
		if(flag==true) {
			number=num;
		}
	}
	
	void printMaxPrimeNumber(int startnum, int lastnum) {
		for(int input=startnum;input<=lastnum;input++) {
			isPrimeNumber(input);
		}
		System.out.println("Maximum Prime Numbers are: "+number);
	}
	
	public static void main(String[] args) {
		A12_MaxPrimeNumber maxPrimeNumber= new A12_MaxPrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter startnumber: ");
		int startnum=sc.nextInt();
		System.out.println("Enter lastnumber: ");
		int lastnum=sc.nextInt();
		maxPrimeNumber.printMaxPrimeNumber(startnum, lastnum);
	}
	
}
