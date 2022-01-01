package swapnali;
public class program2 
{
		public static void main(String[] args) {
			program2 test1= new program2();
			test1.getSumOfPrimeNumbers();
		}
		int sum = 0, primeCount = 1, count = 0;
		
		void getSumOfPrimeNumbers() {
		boolean flag = true;
		for (int number = 2; primeCount <= 10; number++) {
			count = 0;
			flag = true;
			for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				count++;
				flag = false;
				break;
				}
			}
			if (flag == true) {
				primeCount++;
				if (count == 0 && number != 1)
				sum = sum + number;
				}
			System.out.println("Sum of First 10 Prime Numbers = " +sum);
		}
	}
		
}
