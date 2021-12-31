package pratiksha;

public class A7_Characters {

	
	 void printEvenchars(String input) {
		 for (int index = 0; index <= input.length();index++) {
			 
			 if(index%2==0)
				 System.out.println(input.charAt(index));
		 }
		 
	 }
	 
	 void printVowels(String vowel) {
		 for (int i=0; i<= vowel.length();i++) {
			 if(vowel.charAt(i)== 'a'|| vowel.charAt(i)=='e'||vowel.charAt(i)=='i'|| vowel.charAt(i)=='o' || vowel.charAt(i)=='u' ) {
				 System.out.println(vowel.charAt(i));
			 }
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A7_Characters character = new A7_Characters();
		
		character.printEvenchars("technocredits");
		System.out.println("## Method 2 ##");
		character.printVowels("techno");
	}

}
