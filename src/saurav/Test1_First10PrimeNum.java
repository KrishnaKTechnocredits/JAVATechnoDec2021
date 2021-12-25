package saurav;

public class Test1_First10PrimeNum {
	int sum=0;
	int count=0;
	
	void findPrime(int fnum, int lnum) {
			for(int startNum=fnum; startNum<=lnum; startNum++) {
				if(startNum%2 != 0 && count<=10) {
					sum=sum+startNum;
					count++;
				}
			}
	}
		
	void sumOfFirst10PrimeNum() {
		System.out.println(sum);
	}
		
		public static void main(String[] a) {
			Test1_First10PrimeNum prime = new Test1_First10PrimeNum();
			prime.findPrime(50,100);
			prime.sumOfFirst10PrimeNum();
			}
}