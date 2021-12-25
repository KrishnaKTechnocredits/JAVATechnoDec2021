package hevin;

public class T1_Program2 {

	int charCount(String name,char ch) {
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
			int count = charCount(name,name.charAt(i));
			if(count==1) {
				System.out.println("First non repeating charcater :-  " + name.charAt(i));
				break;
			}			
		}		
	}

	public static void main(String[] args) {
		T1_Program2 T1_Program2 = new T1_Program2();
		T1_Program2.display("technocredits");

	}

} 