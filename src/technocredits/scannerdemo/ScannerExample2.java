package technocredits.scannerdemo;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username : ");
		String name = scanner.next();
		//name = "1234"
		
		System.out.println("Enter userid : ");
		int id = scanner.nextInt();
		/// id = "Maulik"
		
		System.out.println("----------------");
		System.out.println(name + "--" + id);
		scanner.close();
	}
}
