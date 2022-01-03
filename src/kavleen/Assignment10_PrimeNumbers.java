package kavleen;

public class Assignment10_PrimeNumbers {
	static int count , sum , avgofPrime ;
	
	void printPrime(int number) {
		boolean flag = false;
		for (int index=2;index<=number/2 ; index++) {
			if(number%index==0) {
				flag =true;
			}
		}
			if(flag==false) {
				System.out.println(number + " is a prime number");
				count++;
				sum= sum+number;
			}
	}
    void primeRange(int startnum , int lastnum) {
    	for (int index = startnum;index <=lastnum ; index++ ) {
    		printPrime(index);
    	}	
    }
    void totalCount() {
    	System.out.println("Total number of prime no : " + count);	
    }
    void SumPrint() {
    	System.out.println("The sum of prime number is : " + sum);	
    }
    void averageNumber() {
    	System.out.println("The Avg of prime number is : " + (sum/count));	
    }
    
    public static void main (String [] args) {
    	Assignment10_PrimeNumbers primeNumber = new Assignment10_PrimeNumbers();
    	primeNumber.printPrime(19);
    	primeNumber.primeRange(100,120);
    	primeNumber.totalCount();
    	primeNumber.SumPrint();
    	primeNumber.averageNumber();   	
    }
}
