package jagdish;

public class Exam_1_PrimeNoGivenRange {
	boolean checkPrimeNo(int num) {
		boolean flag=true;
		for(int index=2;index<=num/2;index++) {
			if(num % index == 0) {
				flag=false;
				break;
			}
		}
	return flag;
	}

	void sumOfPrimNum(int num1) {
		int sum=0;
		int CountPrime=1;
		for(int num = 2; CountPrime <=num1; num++) {
			boolean flagcheck = checkPrimeNo(num);
			if(flagcheck == true) {
				CountPrime++;
			sum =sum+num;
			}
		}
		System.out.println("Sum of first prime numbers is : "  + sum);
		} 

	public static void main(String[] args) {
		Exam_1_PrimeNoGivenRange calcusum=new Exam_1_PrimeNoGivenRange();
		calcusum.sumOfPrimNum(50);

	}
}