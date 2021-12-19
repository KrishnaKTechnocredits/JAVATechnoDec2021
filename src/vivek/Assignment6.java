package vivek;

class Assignment6 {
	
	void printCharacter(String input){
		System.out.println("Characters in String " + input + " are: ");
		for(int index=0;index<input.length();index++)
			System.out.println(input.charAt(index));
	}
	
	void printReverseChar(String input){
		System.out.println("reverse characters in String " + input + " are: ");
		for(int index=input.length()-1;index>=0;index--)
			System.out.println(input.charAt(index));
	}
	
	void findCharFreq(String input, char ch){
		System.out.println("frequency of character " + ch + " in string " + input + " is");
		int count =0;
		for(int index =0;index<input.length();index++)
		{
			if(input.charAt(index)==ch)
				count++;
		}
		System.out.println(ch + "-" + count);
	}
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.printCharacter("techno");
		assignment6.printReverseChar("techno");
		assignment6.findCharFreq("vivek",'v');
	}
}