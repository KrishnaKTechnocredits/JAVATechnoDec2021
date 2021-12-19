package pradeep;

public class Assignment6 {
	
	void printChar(String input) {
		for(int index=0; index<input.length(); index++) {
			System.out.println(input.charAt(index));
		}		
	}
	
	void reverse(String input) {
		for(int index=input.length()-1; index>=0; index--) {
			System.out.println(input.charAt(index));
		}
	}
	
	void findCharFreq(String input, char ch) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(input.charAt(index)==ch)
				count++;
		}
		System.out.println(ch + "--> " + count);
	}

	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		System.out.println("characters are:");
		assignment6.printChar("pradeep");
		System.out.println("characters in reverse order:");
		assignment6.reverse("pradeep");
		System.out.println("counting of character:");
		assignment6.findCharFreq("pradeep", 'p');
	}
}
