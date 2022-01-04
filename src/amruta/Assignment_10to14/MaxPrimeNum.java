/*	Assignment - 12 : 26th Dec'2021 
2. find max prime number from given range.[range : 2 to 100, ans ; 97] [Program-2]   
*/
package amruta.Assignment_10to14;
import java.util.Scanner;

class MaxPrimeNum{

	void findPrimeNumber(int startNum, int endNum){
		
		int maxPrimeNumber = 0;
		
		for(int num = startNum; num <= endNum; num++){
			int count = 0;
			for(int index = 2; index <= num/2; index++){
			
				if(num % index == 0 ){
					count = 1;
					break;
				}
			}
			if(count == 0){
				System.out.println(num+" is Prime Number");
				if(num > maxPrimeNumber)
					maxPrimeNumber = num;
			}	
		}
		
		System.out.println("\nMaximum Prime Number from given range is --> "+maxPrimeNumber);
	}
	
	public static void main(String[] args){
		MaxPrimeNum maxprimenum = new MaxPrimeNum();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number range");
		int startNum = scanner.nextInt();
		System.out.println("Enter the end number range");
		int endNum = scanner.nextInt();
		
		maxprimenum.findPrimeNumber(startNum,endNum);
		scanner.close();
	}
}
