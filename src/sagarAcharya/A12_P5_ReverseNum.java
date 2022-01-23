package sagarAcharya;

import java.util.Scanner;

class A12_P5_ReverseNum{

	public static void main(String[] args){
	A12_P5_ReverseNum reversenum = new A12_P5_ReverseNum();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your num : ");
	int r1 = sc.nextInt();
	reversenum.reverse(r1,true);
	//reversenum.reverse(123);
	}
	
	int reverse(int num,boolean printRev){
		int revNum=0;
		while(num>0){
			int r = num % 10;
			revNum = revNum * 10 + r;
			if(printRev == true)
				System.out.print(r);
			num = num / 10;
		}
		return revNum;
	}
}