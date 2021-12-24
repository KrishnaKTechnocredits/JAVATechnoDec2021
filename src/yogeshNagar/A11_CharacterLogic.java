package yogeshNagar;

public class A11_CharacterLogic {
	
	int getFirstOccurence(String name, char ch) {
		int index=0;
		for(;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				return index;
			}
		}
		return index;		
	}
	
	int getLastOccurence(String name,char ch) {
		int charindex=0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				charindex=index;
			}
		}
		return charindex;
	}
	
	boolean isCharacterPresent(String name,char ch) {
		boolean flag=false;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				flag=true;
			}
		}
		return flag;
	}
	
	int getCharcterRepetationCount(String name,char ch) {
		int count = 0;
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;	
	}
	
	public static void main(String[] args) {
		A11_CharacterLogic charLogic = new A11_CharacterLogic();
		int charcterPosition = charLogic.getFirstOccurence("technocredits", 'c');
		System.out.println("First Occurence of character in given string is "+ charcterPosition);
		
		int lastCharcterOcurrence = charLogic.getLastOccurence("technocredits", 'c');
		System.out.println("Last Occurence of character in given string is "+ lastCharcterOcurrence);
		
		boolean charPresentFlag = charLogic.isCharacterPresent("technocredits", 't');
		if(charPresentFlag==true)
			System.out.println("Character is Present in given string");
		else
			System.out.println("Charcter is not present in given string");
		
		int characterRepetation = charLogic.getCharcterRepetationCount("technocredits", 't');
		System.out.println("Respective charcater repetation count is "+ characterRepetation);
	}
}
