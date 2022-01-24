package kalyani;

public class MaxDigit {
	
	void maxDigitInNumber(int num){
		int reminder, maxDigit= 0;
			while (num > 0)
			{
				reminder = num % 10;
				if (maxDigit< reminder) 
				{
	            maxDigit= reminder;
				}
	        num = num / 10;
			}
	System.out.println("The Max Digit is " + maxDigit);
	}
	
	public static void main(String[] args) {
		MaxDigit maxdigit = new MaxDigit();
		maxdigit.maxDigitInNumber(6832774);
	}
}


