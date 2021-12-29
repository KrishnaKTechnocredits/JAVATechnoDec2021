package shivangi;

public class Test1_NonRepeatedCharInString {
	
	int findRepeatingCharCount(String name,char ch) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}

	void findNonRepeatCharInString(String name) {
		for(int index=0;index<name.length();index++) {
			int count = findRepeatingCharCount(name,name.charAt(index));
			if(count==1) {
				System.out.println("First non repeating charcater ---- "+ name.charAt(index));
				break;
			}			
		}		
	}

	public static void main(String[] args) {
		Test1_NonRepeatedCharInString nonRepeating = new Test1_NonRepeatedCharInString();
		nonRepeating.findNonRepeatCharInString("technocredits");

	}
}
