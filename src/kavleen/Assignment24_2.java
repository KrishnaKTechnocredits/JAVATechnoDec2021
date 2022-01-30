package kavleen;

public class Assignment24_2 {
	
	void getVowelCount(String input) {
		int count=0;
		for (int index = 0 ; index<input.length();index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
			}
		System.out.println(input + " ---> " + count);
	}
	void getVowelLength(String input ) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			getVowelCount(arr[index]);
		}
	}
	public static void main (String [] args) {
		Assignment24_2 assignment24= new Assignment24_2();
		assignment24.getVowelLength("aashvi technocredits");
	}
}
