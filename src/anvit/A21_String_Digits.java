package anvit;

public class A21_String_Digits {
	
	void method(String name) {
		String sum = "";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + ch;
			}
		}
		System.out.println("Digits in String are : "+sum);
	}
	
	public static void main(String[] args) {
		A21_String_Digits a21_String_Digits = new A21_String_Digits();
		a21_String_Digits.method("t1e3ch45n9o");
	}
}
