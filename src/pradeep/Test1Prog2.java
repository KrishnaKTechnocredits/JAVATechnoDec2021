package pradeep;

public class Test1Prog2 {
	int primeNumber(int num) {
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				return 0;
			}
		}
		return num;
	}
	
	void sumOfPrimeNumberInRange(int fNum, int lNum) {
		int primeCnt=0;
		int sum=0;
		
		while(primeCnt<=10 && fNum<=lNum) {
			int primeNum = primeNumber(fNum);
			sum = sum + primeNum;
			if(primeNum!=0) {
				System.out.println(primeNum);
				primeCnt++;
			}
			fNum++;
		}		
		System.out.println("Sum of first 10 Prime number is "+ sum);
	}
	
	public static void main(String[] args) {
		Test1Prog2 test1Prog2 =new Test1Prog2();
		test1Prog2.sumOfPrimeNumberInRange(2,200);			
	}
}
