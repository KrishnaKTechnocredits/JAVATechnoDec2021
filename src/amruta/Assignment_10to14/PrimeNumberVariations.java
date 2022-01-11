/*	Assignment - 10 : 23rd Dec’2021

Create a class to satisfy below requirements. 
         a) Print Number is prime if Given number is prime. (parameterized method)
         b) Print all the prime numbers between range 100->120. (parameterized method)
         c) Print total count of prime numbers between 100->120.
         d) Find sum of all prime numbers between 100->120
         e) Find avg of prime numbers between 100->120

*/

package amruta.Assignment_10to14;

class PrimeNumberVariations {

	int count = 0;
	int sum = 0;
	int avg = 0;

	// a) Print Number is prime if Given number is prime. (parameterized method)

	void printPrimeNumber(int targetnum) {

		String str = "Yes";
		for (int index = 2; index <= targetnum / 2; index++) {

			if (targetnum % index == 0) {
				str = "No";
				break;
			}
		}
		if (str.equals("Yes")) {
			System.out.println("Given Number " + targetnum + " is Prime");
			count++;
			sum = sum + targetnum;
			avg = sum / count;
		}
	}

	// b) Print all the prime numbers between range 100->120. (parameterized method)

	void rangeOfNumbers(int startNum, int lastNum) {
		System.out.println("Prime Numbers between 100 to 120 range : ");
		for (int Number = startNum; Number <= lastNum; Number++) {
			printPrimeNumber(Number);
		}
	}

	// c) Print total count of prime numbers between 100->120.

	void countOfPrimeNumbers() {
		System.out.println("Count of Prime Numbers is " + count);
	}

	// d) Find sum of all prime numbers between 100->120

	void sumOfPrimeNum() {
		System.out.println("\nSum of Prime Numbers from 100 to 120 : " + sum);
	}

	// e) Find avg of prime numbers between 100->120

	void avgOfPrimeNum() {
		System.out.println("\nAverage of Prime Numbers from 100 to 120 : " + avg);
	}

	public static void main(String[] args) {
		PrimeNumberVariations primenumbervariatons1 = new PrimeNumberVariations();
		PrimeNumberVariations primenumbervariatons = new PrimeNumberVariations();
		primenumbervariatons1.printPrimeNumber(17);
		primenumbervariatons.rangeOfNumbers(100, 120);
		primenumbervariatons.countOfPrimeNumbers();
		primenumbervariatons.sumOfPrimeNum();
		primenumbervariatons.avgOfPrimeNum();
	}

}