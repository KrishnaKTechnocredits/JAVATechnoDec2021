package omkar;

public class A10_CheckPrimenumber {
	 int count;
	 int sum=0;

	void isNumberPrime(int num){
		boolean flag=false;
		for(int index =2;index<=num/2;index++){
			if((num%index==0)) {					
				flag=true;
				break;
			}
		}

		if(flag==false) {
			System.out.println("The "+num+" is prime number");
			count++;
			sum=sum+num;
		 }
	}

	void printNumberInGivenRange(int firstNumber,int lastNumber){
		for(int index =firstNumber;index<lastNumber;index++) {
			isNumberPrime(index);
		}
	}

	void printTotalCountOFNumberInGivenRange(){
		System.out.println("The count of prime number is : "+count);
	}

	void printSumOFNumberInGivenRange() {
		System.out.println("The sum of prime number is : "+sum);
	}

	void avgOFNumberInGivenRange(){
		int Avg=sum/count;
		System.out.println("The avg of prime number is : "+Avg);

	}

	public static void main(String[] args) {
		A10_CheckPrimenumber  a10_CheckPrimenumber =new A10_CheckPrimenumber ();
		a10_CheckPrimenumber.printNumberInGivenRange(10,25);
		a10_CheckPrimenumber.printTotalCountOFNumberInGivenRange();
		a10_CheckPrimenumber.printSumOFNumberInGivenRange();
		a10_CheckPrimenumber.avgOFNumberInGivenRange();

	}
}