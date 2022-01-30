package kavleen;

public class Assignment24_1 {
  
	
	void getStringLength(String input ) {
		System.out.println(input + " -- " + input.length());
	}
	void totalWords(String input) {
		String [] arr = input.split(" ");
		System.out.println("Total"  + arr.length + " words");
		for (int index = 0 ; index<arr.length;index++) {
	         getStringLength(arr[index]);
			}	
	}
	public static void main (String [] args) {
		Assignment24_1 assignment24= new Assignment24_1();
		assignment24.totalWords("Hi Hello");
	}
}
