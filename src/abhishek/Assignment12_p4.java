package abhishek;
import java.util.Scanner;
class Assignment12_p4 {

	void reverseNumber(int num) {
		System.out.println("Reverse Number is:   ");
		while(num !=0){
			int r = num%10;
			num = num/10;
			System.out.print(r);
		}
	}

	public static void main(String[] args) {
		Assignment12_p4 assignment12_p4 = new Assignment12_p4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number:  ");
		int number = sc.nextInt();

		assignment12_p4.reverseNumber(number);
		sc.close();


	}
}