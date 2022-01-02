package technocredits.accessmodifersdemo;

public class College {

	/*private boolean isPrime(int num) {
		return true;
	}
	
	void findPrimeNumbersInrange(int startNumber, int endNumber){
		int sum = 0;
		for(int num = startNumber;num<=endNumber;num++) {
			boolean primeFlag = isPrime(num);
			if(primeFlag)
				sum = sum + num;
		}
	}*/
	
	private void insertName(String name) {
		// DB
	}
	
	private void insertAddress(String address) {
		// DB
	}
	
	private void insertGrade(int sscGrade, int hscGrade) {
		// DB
	}
	
	private void insertStream(int steamCode) {
		// DB
	}
	
	void insertData(String name, String address, int sscGrade, int hscGrade, int steamCode) {
		insertName(name);
		insertAddress(address);
		insertGrade(sscGrade, hscGrade);
		insertStream(steamCode);
	}
	
}
