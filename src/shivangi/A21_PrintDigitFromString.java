package shivangi;

public class A21_PrintDigitFromString {
	
	void printDigitFromString() {
		String input = "T1e3c45hn9o";
		String temp = "";
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index))) {
				temp = temp + input.charAt(index);
			}
		}
		System.out.println("String "+input+" contains given digits  : "+temp+" ");
	}
	
	public static void main(String[] args) {
		new A21_PrintDigitFromString().printDigitFromString();
	}
}
