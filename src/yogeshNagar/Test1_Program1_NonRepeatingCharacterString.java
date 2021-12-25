package yogeshNagar;

public class Test1_Program1_NonRepeatingCharacterString {

	int getRepeatingCharCount(String name,char ch) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}

	void passValue(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getRepeatingCharCount(name,name.charAt(index));
			if(count==1) {
				System.out.println("First non repeating charcater ---- "+ name.charAt(index));
				break;
			}			
		}		
	}
	
	public static void main(String[] args) {
		Test1_Program1_NonRepeatingCharacterString nonRepeating = new Test1_Program1_NonRepeatingCharacterString();
		nonRepeating.passValue("technocredits");
		
	}

}
