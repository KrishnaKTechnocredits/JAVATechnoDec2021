/*2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]*/

package shivangi.Assignment12_Scanner;

import java.util.Scanner;

public class A12_2_MaxPrimeNumFromRange {
	
int count;
	
	void findPrimeNumberCount(int num) {
		boolean flag = true;
		for(int index = 2; index<num/2; index++) {
			if(num%index==0) {
				flag = false;
			}			
		}
		if(flag == true) {
			count++;
			System.out.println(num + " is prime number");
		}
	}
	
	void findMaxPrimeNumber(int startRange, int endRange) {
		for(int index=endRange; index>=startRange; index--) {
			findPrimeNumberCount(index);
			if(count == 1) {
				System.out.print("One of the greatest prime num between "+startRange+" and "+endRange+"");
				break;
			}
		}		
	}
	
	public static void main(String[] args) {
		A12_2_MaxPrimeNumFromRange maxPrime = new A12_2_MaxPrimeNumFromRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Start Range : ");
		int startRangeNum = scanner.nextInt();
		System.out.println("Enter End Range : ");
		int endRageNum = scanner.nextInt();
		maxPrime.findMaxPrimeNumber(startRangeNum, endRageNum);
		scanner.close();
	}
	
}
