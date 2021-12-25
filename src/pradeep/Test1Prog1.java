package pradeep;
//Program 1 : find the first non repeating character from given string. 
public class Test1Prog1 {
	int count;
	
	void findCharInString(String input, char ch) {
		count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch) {
				count++;
			}
		}
	}
	
	void findNonRepeatingCharInString(String input) {
		for(int index=0; index<input.length();index++) {
			char ch =input.charAt(index);
			findCharInString(input, ch);
			if(count==1) {
				System.out.println(ch + " is first non repeating character in " + input);
				break;
			}			
		}		
	}
	
	public static void main(String[] args) {
		Test1Prog1 test1 =new Test1Prog1();
		test1.findNonRepeatingCharInString("technocredits");		
	}
}
