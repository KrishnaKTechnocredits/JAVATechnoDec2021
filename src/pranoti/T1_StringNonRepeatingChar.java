package pranoti;

public class T1_StringNonRepeatingChar {
	
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
		System.out.println("first non repeating character from given name "+ name + " is :" +chr);
	}
	
	public static void main(String[] args) {
		T1_StringNonRepeatingChar stringNonRepeatingChar = new T1_StringNonRepeatingChar();
		stringNonRepeatingChar.findNonReChar("technocredits");
	}
}
