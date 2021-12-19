package ashish;

class StringDemo{
	
	void printCharacters(String input){
		System.out.println(" Characters in string " + input + " are : ");
		for(int i=0; i<input.length(); i++){
			System.out.println(" " + input.charAt(i));
		}
	}
	
	void printCharsReverse(String input){
		System.out.println(" Characters in string " + input + " in reverse order are : ");
		for(int i=input.length()-1; i>=0; i--){
			System.out.println(" " + input.charAt(i));
		}
	}
	
	void findOccurence(String input, char ch){
		int count = 0;
		for(int i=0; i<input.length(); i++){
			if(input.charAt(i) == ch)
				count = count + 1;
		}
		System.out.println(" Character " + ch + " Occurred " + count + " times in " + input);
	}
	
	public static void main(String[] args){
		StringDemo stringDemo = new StringDemo();
		System.out.println();
		stringDemo.printCharacters("TECHNO");
		System.out.println();
		stringDemo.printCharsReverse("TECHNO");
		System.out.println();
		stringDemo.findOccurence("AKANKSHA",'A');
		System.out.println();
	}
}
