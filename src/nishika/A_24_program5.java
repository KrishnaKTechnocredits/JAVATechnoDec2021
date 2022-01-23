package nishika;

		/* * Program 5. WAP to convert first character of word with capital letter 
		 * Input    : "anvit harsh dipali" 
		 * Output : "Anvit Harsh Dipali" */

public class A_24_program5 {
	
	String  convertToFirstletterCpaital(String input) {
		String output="";
		
		for(int index=0;index<input.length(); index++) {
			output=output+input.charAt(index);
		}
		output = Character.toUpperCase(output.charAt(0)) + output.substring(1);
		return output;
		
	}
	
	String splitWord(String input) {
		
		String[] arr = input.split(" ");
		String temp = "";
		
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + convertToFirstletterCpaital(arr[index]);
		}
		return temp;
	}
	
	public static void main(String[] args) {
		A_24_program5 a_24_program5 = new A_24_program5();
		String output=a_24_program5 .splitWord("anvit harsh dipali" );
		System.out.println(output);
	}
}
