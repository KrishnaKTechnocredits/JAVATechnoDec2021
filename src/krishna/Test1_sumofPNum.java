package krishna;

public class Test1_sumofPNum {
	int sum = 0;
	int count = 0;
	void isPrimeNum(int num) {
		boolean prime = true;
		for(int i= 2; i<=num/2; i++) {
			if(num % i ==0) {
				prime = false;
				break;
			}
		}
		if(prime == true) {
			sum = sum + num;
			count++;
		}
	}
	
	void findPrimeNum(int start, int end) {
		System.out.println("Given range is : " + (start) + " to "  +(end) +" :- ");
		count = 0;
		sum = 0;
		for(int i = start; i<=end; i++) {
			isPrimeNum(i);
		}
	}
	
	//void count_PrimeNum() { 
		 //System.out.println("All available Prime Number present in range is : " + count);
	//}
	
	void sumPNum() {
		System.out.println("The Sum of Prime Nummber present in range is : " + sum);
	}
	
	public static void main(String[] arr) {
		Test1_sumofPNum test1 = new Test1_sumofPNum();
		test1.findPrimeNum(5, 50); 
		test1.sumPNum();
	}
}
