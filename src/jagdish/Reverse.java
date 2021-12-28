package jagdish;

import java.util.Scanner;

public class Reverse {

	void reverseProgram(int num) {
		System.out.println("The reverese no is :");
		while(num!=0) {
		int	rev =num%10;
		num=num/10;
		System.out.println(rev);
		}
	}
	
	public static void main(String[] args) {
		
		Reverse reverse =new Reverse();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		reverse.reverseProgram(num);
		
	}

}
