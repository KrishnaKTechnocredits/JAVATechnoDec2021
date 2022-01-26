package sagarAcharya;

public class A23_P4 {

	public static void main(String[] args) {
		A23_P4 a23 = new A23_P4();
		//a23.findDiff("tec5hno3cre6di1ts");
		a23.findDiff1("tec5hno3cre6di1ts");
	}
	
	void findDiff(String input) {
		int oddNum = 0,evenNum = 0;
		//String num ="";
		for(int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				int temp = Character.getNumericValue(ch);
				if(temp % 2 == 0) {
					evenNum += temp;
				}
				else {
					oddNum += temp;
				}
			}
			
		}
		System.out.println("Difference is :" + (oddNum - evenNum));
	}
	
	//OR
	
	void findDiff1(String input) {
		int oddNum = 0,evenNum = 0;
		String num ="";
		for(int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				num += ch;
				int temp = Integer.parseInt(num);
				//int temp = Character.getNumericValue(ch);
				if(temp % 2 == 0) {
					evenNum += temp;
					num = "";
				}
				else {
					oddNum += temp;
					num = "";
				}
			}
			
		}
		System.out.println("Difference is :" + (oddNum - evenNum));
	}
}

/*Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6*/