package shital;

public class A23_PlacingAllFromString {

	
	void byPlacingAll(String str) {
		String temp="";
		String odd="";
		String even="";
		String upperCaseLetter="";
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				upperCaseLetter=upperCaseLetter+ch;
				break;
			}
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				temp=temp+ch;
				int num=Integer.parseInt(temp);
					if(num%2==0) {
						even=even+temp;
						temp="";
					}
					else {
						odd=odd+temp;
						temp="";
					}
			}
		}
		System.out.println(odd+upperCaseLetter+even);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A23_PlacingAllFromString placingAllFromString=new A23_PlacingAllFromString();
		String sample ="eTe1CH9cred4it6s";
		placingAllFromString.byPlacingAll(sample);
	}
}
