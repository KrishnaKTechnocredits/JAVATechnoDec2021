package jagdish;

import java.util.Scanner;

public class PrimeNoGivenRange {
	int count=0;

	int setPrimeNumber(int num) {
		boolean primeflag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				primeflag = false;
				break;
			}
		}

		if (primeflag == true) {
			count =num;
		
		}
		return count;
	}

	void getGivenrangeforPrimeNo(int startnum, int endnum) {
		for (int index = endnum; index >= startnum; index--) {
			count= setPrimeNumber(index);
			if (count !=0) 
				break;
			}
		  System.out.println("The Max Prime no is " + count);
		}



	public static void main(String[] args) {
		PrimeNoGivenRange pmgr = new PrimeNoGivenRange();
		Scanner sc = new Scanner(System.in); // conso;e
		System.out.println("Enter the Start Number ");
		int startno = sc.nextInt();
		System.out.println("Enter End Number");
		int LastpageNum = sc.nextInt();
		pmgr.getGivenrangeforPrimeNo(startno, LastpageNum);

	}
}
