package vishakha;

public class A7_printEvenCharVowel{
	
		void printEvenCharVowel(String input) {
				String evenChar = "";
				for(int index=0; index<input.length(); index++) {
					if(index%2 != 0) {
							evenChar = evenChar + input.charAt(index);
							
					}
				}
				System.out.println(evenChar);
		}
		
		void printVowel(String input) {
			String vowel="";
			for(int index=0; index<input.length(); index++) {
				if(input.charAt(index) =='a'||(input.charAt(index) == 'e')||(input.charAt(index) == 'i')||(input.charAt(index)=='o')||(input.charAt(index) == 'u')) {
					vowel = vowel + input.charAt(index);
				}
			}
			System.out.println(vowel);
		
		}
		
		public static void main(String[] args) {
			A7_printEvenCharVowel printCharVowel = new A7_printEvenCharVowel();
			System.out.println("Even position characters are:");
			printCharVowel.printEvenCharVowel("technocredits");
			System.out.println("Vowels in a String are:");
			printCharVowel.printVowel("Technocredits");
		}
		
		
		
		
		
}