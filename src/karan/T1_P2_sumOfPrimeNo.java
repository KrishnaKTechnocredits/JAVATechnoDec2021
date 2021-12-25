package karan;

public class T1_P2_sumOfPrimeNo {
	
	int count;

	void numberIsPrime(int num) {
		boolean flag = true;

		for(int index=2; index<num/2; index++) {			
			if(num%index == 0) {
				flag = false;
				break;
			}	
		}
		if(flag == true) {
			count++;
		}
	}

	void display(int input1, int input2) {
		int sum =0;
		for(int index = input1; index<=input2; index++) {
			if(count<10) {			
				numberIsPrime(index);
				sum = sum +index;				
			}			
		}
		System.out.println("Sum of prime no in given range"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1_P2_sumOfPrimeNo p2_sumOfPrimeNo = new T1_P2_sumOfPrimeNo();
		p2_sumOfPrimeNo.display(10,20);
	}

}
