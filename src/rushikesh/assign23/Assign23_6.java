package rushikesh.assign23;
//Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
//input : eTe1CH9cred4it6s
//output : 19T46
public class Assign23_6 {
	String returnString(String str) {
		String odd = "";
		String even = "";
		String cap = "";
		
		for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index); 
			if(Character.isDigit(ch)) {
				int num=Integer.parseInt(String.valueOf(ch));
				if(num%2==0) 
					even+=ch;
				else
					odd+=ch;
				
			}else {
				if(Character.isLetter(ch) && Character.isUpperCase(ch)) 
					cap+=ch;	
			}
		
		}
	return odd+cap.charAt(0)+even;
		
	}
	public static void main(String[] args) {
		Assign23_6 assign23_6=new Assign23_6();
		String str=assign23_6.returnString("eTe1CH9cred4it6s");
		System.out.println(str);
	}
}
