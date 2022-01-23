package rushikesh.assign23;
//Program 2 : Find sum of numbers from given string.
//input : te12ch22nocre3dits4
//output : 12 + 22 + 3 + 4 = 41
public class Assign23_2 {
	String temp="";
	int sum=0;
	void calculatesum(String str) {
	for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch)) {
				temp+=ch;
			}
			if ((Character.isLetter(ch) && !temp.isEmpty()) || index == str.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}

		}
		
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
	Assign23_2 assign23_2=new Assign23_2();
	String input = "te12ch22nocre3dits4";
	assign23_2.calculatesum(input);
	}
}
