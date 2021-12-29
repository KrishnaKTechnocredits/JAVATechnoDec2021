package technocredits.scannerdemo;
import java.util.Scanner;

public class ScannerExample1 {
	
	void add(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter first input : ");
		int num1 = scanner.nextInt();
		System.out.println("Please enter second input : ");
		int num2 = scanner.nextInt();
		
		ScannerExample1 scannerExample1 = new ScannerExample1();
		scannerExample1.add(num1,num2);
	}
}
