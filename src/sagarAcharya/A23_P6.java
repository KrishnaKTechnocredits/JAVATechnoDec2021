package sagarAcharya;

public class A23_P6 {

	public static void main(String[] args) {
		String str = new A23_P6().p5("eTe1CH9cred4it6s");
		System.out.println(str);
	}
	
	String p5(String input) {
		String oddNum = "", capLetter = "", evenNum = "", digit = "";
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				digit += ch;
				if(Integer.parseInt(digit)%2 == 0) {
					evenNum += ch;
				}
				else {
					oddNum += ch;
				}
			}
			else if(Character.isUpperCase(ch)) {
				capLetter += ch;
			}
		}
		
		return oddNum + capLetter.charAt(0) + evenNum;
	}
}

/*Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46*/