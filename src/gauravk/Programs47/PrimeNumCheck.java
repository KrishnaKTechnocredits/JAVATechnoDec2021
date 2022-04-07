package gauravk.Programs47;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 22.Java program to check if the given number is Prime?
i/p : 97
o/p : true

 */
public class PrimeNumCheck {
	
	void checkingPrime(int num) {
		int divisibleCount=0;
		for(int i=num; i>=1; i--) {
			if(num%i==0)
				divisibleCount++;
		}
		if (divisibleCount>2)
			System.out.println(num+" is Not Prime.");
		else System.out.println(num+" is Prime.");
	}
	
	public static void main(String[] args) throws InvalidDataEntryException{
		Scanner sc = new Scanner(System.in);
		PrimeNumCheck pnc = new PrimeNumCheck();
		System.out.println("Enter number to check prime : ");
		try{
			int input = sc.nextInt();
			pnc.checkingPrime(input);
		}catch (InputMismatchException mis) {
			System.out.println("Please enter only numeric value without decimals.");
		}finally {
			sc.close();
		}
	}
}