package nishika;
		/* 
		 * Program 7. WAP to reverse the case of each char in a given word
		 *  Input    : "TeCHnoCReditS" 
		 *   Output : "tEchNOcrEDITs" */

public class A_24_program7 {
	
	String reverseCase(String input) {
		String reverseCase = "";
		for (int index = 0; index < input.length(); index++) {
			
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				ch = Character.toUpperCase(ch);
			else
				ch= Character.toLowerCase(ch);
			reverseCase += ch;
		}
		return reverseCase;
	}

	String spiltWord(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + reverseCase(arr[index]);
		}
		  return temp;
	}
	
	public static void main(String[] args) {
		 A_24_program7   a_24_program7  = new  A_24_program7 ();
		 String temp=a_24_program7.spiltWord("TeCHnoCReditS");
		 System.out.println(temp);
	}
}
