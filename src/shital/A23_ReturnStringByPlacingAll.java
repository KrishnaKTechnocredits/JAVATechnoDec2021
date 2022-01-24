package shital;

public class A23_ReturnStringByPlacingAll {

	void placingAll(String str) {
		String upperCase="";
		String lowercase="";
		String digit="";
		String specialChar="";
		System.out.println("Give Input is: "+"te4c&Hno7CreD-8i*ts");
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLowerCase(ch)) {
				lowercase+=ch;
			}
			if(Character.isDigit(ch)) {
				digit+=ch;
			}
			if(Character.isUpperCase(ch)) {
				upperCase+=ch;
			}
			if(Character.isSpaceChar(ch)) {
				specialChar+=ch;
			}
		}
		System.out.println("Expected Output is: "+lowercase+digit+upperCase+specialChar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_ReturnStringByPlacingAll returnStringByPlacingAll=new A23_ReturnStringByPlacingAll();
		String sample="te4c&Hno7CreD-8i*ts";
		returnStringByPlacingAll.placingAll(sample);
	}

}
