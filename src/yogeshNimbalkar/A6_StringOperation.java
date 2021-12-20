package yogeshNimbalkar;


// Assignment - 6 : 18 Dec 2021
public class A6_StringOperation {

	void displayChars(String str){
		for(int index=0; index < str.length();index++)
			System.out.println(str.charAt(index));
	}
	
	void displayCharsInReverse(String str){
		System.out.println(str + " in reverse order - ");
		for(int index=str.length()-1; index >= 0; index--)
			System.out.println(str.charAt(index));
	}
	
	void displayCharCount(String str, char ch){
		int count = 0;
		for(int index=0; index < str.length(); index++)
			if(str.charAt(index) == ch)
				count++;
		System.out.println(ch + " -> " + count);
	}
	
	public static void main(String[] args){
		A6_StringOperation stroperation = new A6_StringOperation();
		stroperation.displayChars("Yogesh");
		stroperation.displayCharsInReverse("Techno");
		stroperation.displayCharCount("technocredits",'c');
	}
}
