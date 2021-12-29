package vaishnavi;

public class Test1_NonRepeatingChar {

	void firstNonRepeatingCharacterInString(String name) {
		for(int index = 0; index < name.length(); index++) {
			boolean flag =true;
			for(int i = 0; i <name.length(); i++) {
				if(index != i && name.charAt(index) == name.charAt(i)) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println("First non repeating character is : " +name.charAt(index));
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_NonRepeatingChar test1_NonRepeatingChar = new Test1_NonRepeatingChar();
		test1_NonRepeatingChar.firstNonRepeatingCharacterInString("Vaishnavi");

	}

}
