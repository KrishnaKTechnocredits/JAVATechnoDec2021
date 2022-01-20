package jayashri;
import java.util.Scanner;
public class A12_P3_StringOperations {
	int getfindCharFrequency(String input ,char ch) {
		int count =0;
		for(int index =0;index<input.length();index++) {
			if(input.charAt(index) == ch )
				count++;
		}
		return count;
	}
	
	void nonRepeatingChar(String input){
		for(int index=0;index<input.length();index++){
			char ch =input.charAt(index);
			int cnt =getfindCharFrequency(input,ch);
			if(cnt == 1){
				System.out.println("First non repeating character from given string : " +ch);
				break;
			}
		}
	}
	
	void firstRepeatingChar(String input){
		for(int index=0;index<input.length();index++){
			char ch =input.charAt(index);
			int cnt =getfindCharFrequency(input,ch);
			if(cnt != 1){
				System.out.println("First repeating character from given string  : " +ch);
				break;
			}
		}
	}
	
	String reverseString(String input){
		String reverse = "";
		for(int index=input.length()-1;index>=0;index--){
			char ch = input.charAt(index);
			reverse = reverse+ch;
		}
		return reverse;
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter String : ");
		String input =sc.next();
		A12_P3_StringOperations stringOperations =new A12_P3_StringOperations();
		stringOperations.nonRepeatingChar(input);
		System.out.println("---------------------------------------");
		stringOperations.firstRepeatingChar(input);
		System.out.println("---------------------------------------");
		String str =stringOperations.reverseString(input);
		System.out.println("Revese String is : " +str);
		sc.close();
	}
}
