package yogeshNagar;

public class A13_IndexOf_LastIndexOf {
	void getDuplicateChar(String name) {
		char ch = ' ';
		System.out.println("Douplicate charcters in string");
		for(int index=0;index<name.length();index++) {
			ch =name.charAt(index);
			if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
				System.out.println(ch);				
			}			
		}
	}
	
	void getNonRepeatingChar(String name) {
		char ch = ' ';
		System.out.println("Non repeating charcters in string");
		for(int index=0;index<name.length();index++) {
			ch =name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println(ch);				
			}			
		}
	}
	
	void getFirstNonRepeatingChar(String name) {
		char ch = ' ';
		for(int index=0;index<name.length();index++) {
			ch =name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println("First non repeating charcter is "+ch);	
				break;
			}			
		}
	}
	
	void getFirstRepeatingChar(String name) {
		char ch = ' ';
		for(int index=0;index<name.length();index++) {
			ch =name.charAt(index);
			if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
				System.out.println("First repeating charcter is "+ch);	
				break;
			}			
		}
	}
	public static void main(String[] args) {
		A13_IndexOf_LastIndexOf strOperatons = new A13_IndexOf_LastIndexOf();
		strOperatons.getDuplicateChar("technocredits");
		System.out.println("-------------------------");
		strOperatons.getNonRepeatingChar("technocredits");
		System.out.println("-------------------------");
		strOperatons.getFirstNonRepeatingChar("technocredits");
		System.out.println("-------------------------");
		strOperatons.getFirstRepeatingChar("technocredits");
	
	}
}
