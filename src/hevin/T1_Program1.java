package hevin;

public class T1_Program1 {
	
	int count;

	void isPrimeNumber(int num) {
		boolean flag = true;

		for(int i=2; i<num/2; i++) {			
			if(num%i == 0) {
				flag = false;
				break;
			}	
		}
		if(flag == true) {
			count++;
		}
	}

	void printPrimeNumber(int startNum, int lastNum) {
		int sum =0;
		for(int index =startNum; index<=lastNum; index++) {
			if(count<10) {			
				isPrimeNumber(index);
				sum = sum+index;				
			}			
		}
		System.out.println("The Sum Of All Prime Numbers from given range = " + sum);
	}

	public static void main(String[] args) {

		T1_Program1 sumPrime = new T1_Program1();		
		sumPrime.printPrimeNumber(10, 100);

	}
}	 