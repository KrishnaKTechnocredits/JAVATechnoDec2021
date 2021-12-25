package omkar;

public class SumOfFirst_10_Numbers {
	int countP;

	void isPrimeNumber(int num) {
		boolean flag = true;

		for(int i=2; i<num/2; i++) {			
			if(num%i == 0) {
				flag = false;
				break;
			}	
		}
		if(flag == true) {
			countP++;
		}
	}

	void printPrimeNumber(int startNum, int lastNum) {
		int sum =0;
		for(int index =startNum; index<=lastNum; index++) {
			if(countP<10) {			
				isPrimeNumber(index);
				sum = sum+index;				
			}			
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		SumOfFirst_10_Numbers sumOfFirst_10_Numbers = new SumOfFirst_10_Numbers();		
		sumOfFirst_10_Numbers.printPrimeNumber(10, 100);

	}
}	