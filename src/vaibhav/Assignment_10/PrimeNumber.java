/*Assignment - 10 : 23rd Dec’2021

Create a class to satisfy below requirements. 
a) Print Number is prime if Given number is prime. (parameterized method)
b) Print all the prime numbers between range 100->120. (parameterized method)
c) Print total count of prime numbers between 100->120.
d) Find sum of all prime numbers between 100->120
e) Find avg of prime numbers between 100->120

*/

package vaibhav.Assignment_10;

public class PrimeNumber {

	int primeNumCnt;
	int primeNumSum;
	double primeAvg;
	
	void isPrimeNumber(int num) {
		boolean flag = false;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			//System.out.println(num + " is Prime Number");
			System.out.print(num + " ");
			primeNumSum = primeNumSum + num;
			primeNumCnt++;
		}
	}

	void primeNumbersInGivenRange(int startNum, int endnum) {
		System.out.println("");
		System.out.println("");
		System.out.println("Prime Numbers in the given range "+startNum+" to "+endnum+" are : ");
		primeNumSum = 0;
		primeNumCnt=0;
		for (int index = startNum; index <= endnum; index++) {
			isPrimeNumber(index);
		}
	}
	
	void totalCountOfPrimeNumbers(int startNum, int endnum) {
		System.out.println("");
		System.out.println("");
		System.out.println("Total count of Prime Numbers in the given range "+startNum+" to "+endnum+" is : "+ primeNumCnt);
	}
	
	void sumOfAllPrimeNumbersInRange(int startNum, int endnum) {
		System.out.println("");
		System.out.println("Sum of all Prime Numbers in the given range "+startNum+" to "+endnum+" is : "+ primeNumSum);
	}
	
	void avgOfPrimeNumbers(int startNum, int endnum) {
		System.out.println("");
		primeAvg = (double)primeNumSum / primeNumCnt;
		System.out.println("Average of all Prime Numbers in the given range "+startNum+" to "+endnum+" is : "+ primeAvg);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.isPrimeNumber(101);
		primeNumber.primeNumbersInGivenRange(100, 120);
		primeNumber.totalCountOfPrimeNumbers(100, 120);
		primeNumber.sumOfAllPrimeNumbersInRange(100, 120);
		primeNumber.avgOfPrimeNumbers(100, 120);
	}
}
