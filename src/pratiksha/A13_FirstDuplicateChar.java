package pratiksha;

public class A13_FirstDuplicateChar {

	void firstDuplicateChar(String name) {
		char ch =' ';
		
		for(int index =0; index <=name.length();index++) {
			
			ch= name.charAt(index);
			if(name.indexOf(ch)!= name.lastIndexOf(ch) ) {
				System.out.println("First Duplicate Character is:" +ch);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		A13_FirstDuplicateChar duplicateChar = new A13_FirstDuplicateChar();
		duplicateChar.firstDuplicateChar("Pratiksha");
		
	}
}
