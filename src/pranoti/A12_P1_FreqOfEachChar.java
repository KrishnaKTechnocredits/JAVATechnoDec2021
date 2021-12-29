package pranoti;
import java.util.Scanner;
public class A12_P1_FreqOfEachChar {
	
	int getCharFrequency(String input,char ch) {
		int count=0;
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index) == ch)
				count++;	
		}
		return count;
	}
	
	void freqOfEachChar(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			int cnt = getCharFrequency(input ,ch);
			System.out.println(ch +"--" +cnt);
		}	
	}
	
	public static void main(String[] args) {
		System.out.println("Enter input string : ");
		Scanner sc =new Scanner(System.in);
		String input =sc.next();
		A12_P1_FreqOfEachChar p1_FreqOfEachChar= new A12_P1_FreqOfEachChar();
		p1_FreqOfEachChar.freqOfEachChar(input);
		sc.close();
	}

}
