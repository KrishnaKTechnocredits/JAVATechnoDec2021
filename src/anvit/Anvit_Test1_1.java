package anvit;

public class Anvit_Test1_1 {
	
	int getRepeatingChar(String name, char ch) {
		int count=0;
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index)==ch) {
				count++;
			}
		}
		return count;
	}

	void print(String name) {
		for(int index=0;index<name.length();index++) {
			int count = getRepeatingChar(name,name.charAt(index));
			
			if(count==1) {
				System.out.println("First non repeating character is "+ name.charAt(index));
				break;
			}			
		}		
	}
	public static void main(String[] args) {
		Anvit_Test1_1 anvit_Test1_1 = new Anvit_Test1_1();
		anvit_Test1_1.print("technocredits");
	}
}
