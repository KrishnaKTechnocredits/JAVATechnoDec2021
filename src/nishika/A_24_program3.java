package nishika;

	/* Program 3. WAP to return array of words containing only digits. 
	 * Input    : "Te1c2h C94re3" 
	 * Output : "12" "943"*/

public class A_24_program3 {
	
	void findDigit(String name) {
		String temp="";
		
		for(int i=0; i<name.length(); i++) {
			char ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				temp+=ch;	
			}
		}
		System.out.println(temp);
	}
	
	void splitWord(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			findDigit(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		A_24_program3 a_24_program3 = new A_24_program3();
		 a_24_program3.splitWord("Te1c2h C94re3");
	}
}
