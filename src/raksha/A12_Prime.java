package raksha;

class A12_Prime{
	
	int count=0, sum=0;

	void printPrime(int num){
		boolean flag = true;
		for(int i=2;i<=num/2;i++){
		if(num%i==0){
			System.out.println(+num + " is not a Prime Number");
			flag = false;
			break;
			}
		}
		if(flag==true)
			System.out.println(+num + " is a Prime Number");
	}
	
	void findPrime(int index){
		boolean flag = true;
		for(int i=2;i<=index/2;i++){
			if(index%i==0){
				flag = false;
				break;
			}
		}
			if(flag==true){
				sum = sum + index;
				count++;
			}
				
	}
	
	void findPrimerr(int index){
		boolean flag = true;
		for(int i=2;i<=index/2;i++){
			if(index%i==0){
				flag = false;
				break;
			}
		}
			if(flag==true){
				System.out.println(index + " is a Prime Number");
			}
				
	}
	
	void primeRange(int fno , int lno) {
		System.out.println("Prime Number in given Range " + fno + " to " + lno + " are : ");
		for(int index = fno; index<=lno; index++)
		findPrimerr(index);
		
	}
	
	void primeNumberCount(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findPrime(index);
			}
		System.out.println("Total prime numbers in given range " + firstNum + " To " +lastNum + " is: " + count);
		
	}
	
	void sumOfPrimeNumbers(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		sum=0;
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findPrime(index);
			}
		System.out.println("Sum of prime numbers in given range " + firstNum + " To " +lastNum + " is: " + sum);
		
	}
	
	void findAvgOfPrimeNumbers(int firstNum, int lastNum) {
		System.out.println("-------------------------------------------");
		sum=0;
		count=0;
		for (int index = firstNum; index <= lastNum; index++) {
			findPrime(index);
			}
		System.out.println("Average of prime numbers in given range " + firstNum + " To " +lastNum + " is: " + (sum/count));
		
	}

	public static void main (String[] args){
		A12_Prime a12_Prime = new A12_Prime();
		a12_Prime.printPrime(9);
		a12_Prime.printPrime(100);
		System.out.println("----------------------------");
		a12_Prime.printPrime(13);
		a12_Prime.printPrime(17);
		System.out.println("----------------------------");
		a12_Prime.primeRange(10,20);
		a12_Prime.primeNumberCount(10, 20);
		a12_Prime.sumOfPrimeNumbers(10, 20);
		a12_Prime.findAvgOfPrimeNumbers(10, 20);
	}




}
