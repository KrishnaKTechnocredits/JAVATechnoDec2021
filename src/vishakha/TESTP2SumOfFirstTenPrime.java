package vishakha;

public class TESTP2SumOfFirstTenPrime {
	int sum = 0;
	int count = 0;
	
	boolean isPrime(int num) {
		boolean flag=true;
		for(int index = 2; index <=num/2; index++) {
			if(num % index == 0) {
				flag = false;
				break;
			
			}
		}
		return flag;
		}
		void sumOfPrime(int count) {
			int c = 1;
			int num = 2;
			int sum = 0;
			while (c <= count) {
				if(isPrime(num) == true) {
					c++;
					sum = sum +num;
					
				}
			
			num++;
			}
			System.out.print("Sum of first " + count + " prime numbers is :" + sum);
		}			
		public static void main(String[] a) {
			TESTP2SumOfFirstTenPrime sumOfFirstTenPrime= new TESTP2SumOfFirstTenPrime();
			sumOfFirstTenPrime.sumOfPrime(10);
		}
		
		}
