package anvit;

import java.util.Scanner;

public class A12_Scanner_Primenum {
	int getPrime(int input) {
		boolean flag = true;
		int returnvalue = 0;
		for(int i=2;i<=input/2;i++) {
			if(input%i==0) {
				flag = false;
				break;
			}
		}
		if(flag==true) {
			returnvalue = input;
		}
		return returnvalue;
	}
	
	void primeRange() {
		int newnum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting number of range ");
		int startNum = scanner.nextInt();
		System.out.println("Enter ending number of range ");
		int endNum = scanner.nextInt();
		for(int i=startNum;i<=endNum;i++) {
			getPrime(i);
			if(getPrime(i)!=0)
				newnum=getPrime(i);
		}
		System.out.println("last prime number in range is"+ newnum);
	}
	public static void main(String[] args) {
		A12_Scanner_Primenum a12_Scanner_Primenum = new A12_Scanner_Primenum();
		a12_Scanner_Primenum.primeRange();
	}
}
