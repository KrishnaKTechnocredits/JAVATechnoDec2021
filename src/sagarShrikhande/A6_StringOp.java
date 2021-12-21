package sagarShrikhande;
class A6_StringOp{
	
	void printStringChars(String input){
		System.out.println("Normal String is: ");
		for(int index = 0; index<input.length(); index++)
			System.out.println(input.charAt(index));
		}
	
	void reverseString(String input){
		System.out.println("Reverse String is: ");
		for(int index = input.length()-1; index>=0 ; index--)
			System.out.println(input.charAt(index));
		}
	
	void countChar(String input, char ch){
		int count = 0;
		for(int index = 0; index<input.length(); index++){
			if(input.charAt(index) == ch)
				count++;
		}
		System.out.println("Character "+ ch+ " is having "+count+" instance");
	}
	
	public static void main(String[] a){
		A6_StringOp a6_StringOp = new A6_StringOp();
		a6_StringOp.printStringChars("TechnoCredits");
		a6_StringOp.reverseString("TechnoCredits");
		a6_StringOp.countChar("TechnoCredits", 'e');
	}
}