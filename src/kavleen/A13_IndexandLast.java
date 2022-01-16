package kavleen;

public class A13_IndexandLast {
	
	void duplicateChar(String input) {
		System.out.println("All duplicate characters displaying");
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				flag = false;
				break;
			}
			if (flag == true)
				System.out.println(ch);
		}
	}
    void uniqueChar(String input) {
    	System.out.println("All Unique Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println(ch);
		}	
    }
    void returnFirst(String input) {
    	System.out.println("First Unique Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
    }
    void returnDuplicate(String input) {
    	System.out.println("First Duplicate Characters displaying of technocredits");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}	
    }
    public static void main (String [] args) {
    	
    	A13_IndexandLast indexLast = new A13_IndexandLast();
    	indexLast.duplicateChar("Technocredits");
    	indexLast.uniqueChar("Technocredits");
    	indexLast.returnFirst("Technocredits");
    	indexLast.returnDuplicate("Technocredits");
    }
}
