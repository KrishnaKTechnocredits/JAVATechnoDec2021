package monikaArkade;

public class Test1_nonRepeatingCharacters {
	int getcharfreq(String name ,char ch) {
		int count =0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index) == ch)
				count++;		
		}
		return count;
	}

	void findNonReChar(String name) {
		char chr =' ';
		for(int index=0;index<name.length();index++) {
			char ch =name.charAt(index);
			int count =getcharfreq(name ,ch);
			if(count == 1) {
				chr = ch;
				break;
			}
		}
		System.out.println("first non repeating character from given name "+ name + " is : " +chr);
	}
	public static void main(String[] args) {
		Test1_nonRepeatingCharacters stringexam = new Test1_nonRepeatingCharacters();
		stringexam.findNonReChar("technocredits");
	}
}
