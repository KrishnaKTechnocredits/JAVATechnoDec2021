package sham;

public class A10_PrimeNumber {
	int sum=0;
	int count=0;
	void findPrimeNumbers(int number)
	{
		//System.out.println("******prime numbers*****");
		boolean flag= true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0) {
				//System.out.println(number+" number is not prime");
				flag=false;
				count++;
				break;
			}
		}
		
		if(flag==true) {
			System.out.println(number+" is Prime");
			
		
		}

	}
	
	void findPrimeNumberFromRange(int startRange,int EndRange) {
		System.out.println("******prime numbers from given Range*****");
		
		for(int startNum=startRange;startNum<=EndRange;startNum++) {
			findPrimeNumbers(startNum);
			
			}
		
			}
	void findTSumOfPrimeNumberFromRange(int startRange,int EndRange) {
		System.out.println("******Sum of prime numbers from given Range*****");
		int startNum=0;
		for( startNum=startRange;startNum<=EndRange;startNum++) {
			findPrimeNumbers(startNum);
			
			sum=sum+startNum;
				}
		
		System.out.println("total sum of Prime numbers is: "+ sum);
			}
	
	 void TotalCountOfPrime() {
		System.out.println("Total count of prime number is:"+count);
		
	}
	  void findAverageOfAllPrimeNumbers() {
			int avg=sum/count;
			System.out.println("Avarage of " +avg);
			
		}
	public static void main(String[] args) {
		A10_PrimeNumber primeNumber= new A10_PrimeNumber();
		primeNumber.findPrimeNumbers(7);
		primeNumber.findPrimeNumberFromRange(10,80);
		primeNumber.findTSumOfPrimeNumberFromRange(10, 20);
		primeNumber.TotalCountOfPrime();
		primeNumber.findAverageOfAllPrimeNumbers();
		
		
		

	}

	

	

}
