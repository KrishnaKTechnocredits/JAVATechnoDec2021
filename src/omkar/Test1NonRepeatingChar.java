package omkar;

public class Test1NonRepeatingChar {

	int getRepeatingCharCount(String name,char ch) {
		int count=0;
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i)==ch) {
				count++;
			}
		}
		return count;
	}

	void display(String name) {
		for(int i=0;i<name.length();i++) {
			int count = getRepeatingCharCount(name,name.charAt(i));
			if(count==1) {
				System.out.println("First non repeating charcater :-  "+ name.charAt(i));
				break;
			}			
		}		
	}

	public static void main(String[] args) {
		Test1NonRepeatingChar test1NonRepeatingChar = new Test1NonRepeatingChar();
		test1NonRepeatingChar.display("technocredits");

	}

}