package sagarAcharya;

public class A23_P5 {

	public static void main(String[] args) {
		A23_P5 a23 = new A23_P5();
		a23.FindDiffOfOddEven("te112ch34no29");
	}
	
	void FindDiffOfOddEven(String input) {
		String temp = "";
		//int tempNum = Integer.parseInt(temp);
		int sumOdd = 0,sumEven = 0;
		for(int i = 0;i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				temp += ch;
			
				if(!temp.equals("") && isOddOrEven(Integer.parseInt(temp))) {
					int tempNum = Integer.parseInt(temp);
					sumEven += Integer.parseInt(temp);
				}else{
					//if(!temp.equals(""))
					sumOdd += Integer.parseInt(temp);
				}
				//temp = "";
			}
			
		}
		if(!temp.equals("")) {
			if(isOddOrEven(Integer.parseInt(temp))) {
			sumEven += Integer.parseInt(temp);
		}else {
			sumOdd += Integer.parseInt(temp);
		}
		}
		//temp = "";
		System.out.println("Diff between Odd and Even from given string is : " + (sumEven - sumOdd));
	}
	
	boolean isOddOrEven(int num) {
		if(num % 2 ==0 ) {
			return true;
		}else {
		return false;
		}
	}
}


/*Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)*/