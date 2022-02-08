package technocredits.interview.p1;

public class Example1 {

	public static void main(String[] args) {
		System.out.println('1' + '2'); // C // 99
		char temp = '1' + '2'; // 99 // c
		System.out.println(temp);
		
		char ch1 = '1';
		char ch2 = '2';
		int ans1 = ch1 + ch2;
		System.out.println(ans1); // 
		
		ans1 = Character.getNumericValue(ch1) + Character.getNumericValue(ch2);
		System.out.println(ans1); // 
	}
}
