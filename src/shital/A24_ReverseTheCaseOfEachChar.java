package shital;

public class A24_ReverseTheCaseOfEachChar {

	void reverseEachChar(String str) {
		String temp="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch))
					temp=temp+Character.toLowerCase(ch);
				else
					temp=temp+Character.toUpperCase(ch);
			}
		}
		System.out.println("The Original String with Swapped Cases : " +str);
		System.out.println("The New String with Swapped Cases : " +temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_ReverseTheCaseOfEachChar reverseTheCaseOfEachChar=new A24_ReverseTheCaseOfEachChar();
		reverseTheCaseOfEachChar.reverseEachChar("TeCHnoCReditS");
	}

}
