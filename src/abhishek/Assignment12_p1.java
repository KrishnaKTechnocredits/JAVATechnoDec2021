package abhishek;
import java.util.Scanner;
class Assignment12_p1 {
	int stringOccuurrence(String input, char ch) {
		int count = 0;
		for(int index = 0; index < input.length(); index++){
			if(input.charAt(index)==ch)
				count++;
		}
		return count;
	}
	void frequencyOccurance(String input) {
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = stringOccuurrence(input , ch);
			System.out.println(ch + ":" + count);
		}
	}
	public static void main (String[] args) {
		Assignment12_p1 assignment12_p1 = new Assignment12_p1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.next();
		assignment12_p1.frequencyOccurance(input);
		sc.close();
	}
}
	   
	