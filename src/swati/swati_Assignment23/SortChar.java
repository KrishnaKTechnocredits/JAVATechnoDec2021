package swati.swati_Assignment23;

public class SortChar {

	String lower="";
	String upper="";
	String num="";
	String special="";
	
	void sort(String str) {
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isLetter(c)) {
				if(Character.isLowerCase(c)) {
					lower=lower+c;
				}
				else if(Character.isUpperCase(c)) {
					upper=upper+c;
				}
			}
			else if(Character.isDigit(c)) {
				num=num+c;
			}
			else {
				special=special+c;
			}
		}
		System.out.println(lower +num + upper+special);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortChar sc=new SortChar();
		sc.sort("tecnoreits478HCD&-*");
	}

}
