/*
Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6
*/
package shivangi.Assignment23;

public class A23_Program4 {
	void findDiffEvenOddNumString(String input){
		int evenSum = 0;
		int oddSum = 0;
		String temp = "";
		for(int index=0; index<=input.length()-1; index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				temp = temp + ch;
				int digit = Integer.parseInt(temp.valueOf(ch));
				if(digit % 2 == 0) {
					evenSum = digit + evenSum;
				}else {
					oddSum = digit + oddSum;
				}
			}
		}
		int evenOddDiff = oddSum - evenSum;
		System.out.println("Difference between odd sum "+oddSum+" and even sum "+evenSum+" is : " + evenOddDiff );
	}
	
	public static void main(String[] args) {
		A23_Program4 p4 = new A23_Program4();
		p4.findDiffEvenOddNumString("tec5hno3cre6di1ts");
	}
}
