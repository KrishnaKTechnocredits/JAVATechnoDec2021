package poojaJoshi;

public class Assignment6 {
	void printChar(String name) {
		System.out.println("Create a method to print all characters of given input  " + "(input : techno)");
		for (int index=0; index<name.length(); index++) {
			System.out.println(name.charAt(index));
		}
	}
	
	void printRev(String name) {
		System.out.println("Create a method to print all characters of given input in reverse order" + "(input : techno)");
		for (int index=name.length()-1; index>=0;index--) {
			System.out.println(name.charAt(index));
		}
	}
	
	void findCharFreq(String input, char ch) {
		System.out.println("Create a method to find occurance of given character from input string" + "(input : akanksha)");
		int count =0;
		for (int index=0; index<input.length();index++) {
			if (input.charAt(index)==ch) 
				count++;
		}
		System.out.println(ch +" -> " +count);
	}
			
	
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.printChar("techno");
		System.out.print("\n");
		assignment6.printRev("techno");
		System.out.print("\n");
		assignment6.findCharFreq("akanksha", 'a');
	}

}
