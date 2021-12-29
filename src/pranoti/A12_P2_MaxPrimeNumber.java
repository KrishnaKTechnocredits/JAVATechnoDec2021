package pranoti;
import java.util.Scanner;
public class A12_P2_MaxPrimeNumber {

	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for(int index =2;index<=num/2;index++) {
			if(num % index == 0) {
				isPrime =false;
				break;
			}
		}
		return isPrime;
	}
	
	void findMaxPrimeInRange(int start ,int end) {
		int num;
		int primeCount=0;
		for(num=end ;num>=start;num--) {
			boolean primeFlag = isPrimeNumber(num);
			if(primeFlag == true) 
			primeCount++;
			if(primeCount == 1)
			break;
		}
		System.out.println("max prime number is : " +num);
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enetr Start number for range : ");
		int startNum = sc.nextInt();
		System.out.println("Enetr end number for range : ");
		int endNum = sc.nextInt();
		A12_P2_MaxPrimeNumber a12_P2_MaxPrimeNumber = new A12_P2_MaxPrimeNumber();
		a12_P2_MaxPrimeNumber.findMaxPrimeInRange(startNum, endNum);
		sc.close();
	}
	
}
