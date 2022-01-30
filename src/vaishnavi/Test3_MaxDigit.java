package vaishnavi;

public class Test3_MaxDigit {
	
	void findMaxDigit(int num) {
		int maxDigit =0;
		int temp;
		
		while(num > 0) {
			temp = num % 10 ;
			num = num / 10;
			if(temp > maxDigit) 
				 maxDigit = temp;
		}
		System.out.println("Maximum digit is: " + maxDigit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3_MaxDigit test3_MaxDigit = new Test3_MaxDigit();
		test3_MaxDigit.findMaxDigit(6832774);
	}

}
