package abhishek;
class Test01_Program02 {
	int sum = 0;
	int count = 0;
	void isPrimeNumber(int num){
		boolean flag = true;
		if(count<10){
			for(int index=2;index<=num/2;index++) {
				if(num%index == 0) {
					flag = false;
					break;
					}
				}
				if(flag == true){
					System.out.println(num + " is prime number");
					sum=sum+num;
					count++;
					
				}
			}
	
		}
	void sumOfPrimNumInRange(int startNum, int endNum) {
		sum=0;
		for (int num = startNum; num <= endNum; num++){
			isPrimeNumber(num);
		}
	
		System.out.println("Sum of first 10 prime numbers in given range " + startNum + " To " + endNum + " is: " + sum);
		
	}

public static void main(String[] a) {
		Test01_Program02 test01_Program02 = new Test01_Program02();	
		test01_Program02.sumOfPrimNumInRange(11,400);	
		}
}