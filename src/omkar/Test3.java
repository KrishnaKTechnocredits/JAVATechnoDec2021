package omkar;

public class Test3 {
	
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
			Test3 t3 = new Test3();
			t3.maxDigitInNumber(6832774);
		}
	}

