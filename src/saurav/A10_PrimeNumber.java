package saurav;

public class A10_PrimeNumber {
int sum=0;
int count=0;
	void isPrimeNum(int num) {	

		boolean flag= true;
		for(int index=2; index<=num/2; index++) {
			if(num%index == 0) {
			//System.out.println(num+" It is not a prime num");
				flag=false;
				break;
			}	
		}
			if(flag==true) {
			count++;
			sum=sum+num;
			System.out.println(num+ " is a prime num");
			}
	}
			
	void totalPrimeNumInRange(int fNum, int lNum) {
		for( int startNum=fNum; startNum<=lNum; startNum++) {
			isPrimeNum(startNum);
		}
	} 
	
	void countOfPrimeNum(int fNum,int lNum ) {	
		for( int startNum=fNum; startNum<=lNum; startNum++) {
			 isPrimeNum(startNum);
			 break;
		}
		System.out.println("Count of all prime num = "+count);
	}	
	
	void sumOfAllPrimeNum() {
		System.out.println("Sum of all prime numbers = "+sum);
	}	
		
	void averageOfAllPrimeNum() {
		int average = sum/count; 
		System.out.println("averge of all prime numbers = "+average);
		}

	public static void main(String[] a) {
		A10_PrimeNumber prime = new A10_PrimeNumber();
		prime.isPrimeNum(41);
		System.out.println();
		prime.totalPrimeNumInRange(10,20);
		System.out.println();
		prime.countOfPrimeNum(10,20 );
		System.out.println();
		prime.sumOfAllPrimeNum();
		prime.averageOfAllPrimeNum();
	}
}
