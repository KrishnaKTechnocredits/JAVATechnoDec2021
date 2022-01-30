package apurva;

/*
Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6*/
public class A23_DifferenceOddNoEvenNoInString {

	void displayDifferenceofOddNoEvenNo(String str) {
		int evensum = 0;
		int oddsum = 0;
		String temp = "";
		
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				int num = Character.getNumericValue(ch);
				if (num % 2 == 0) {
					evensum = evensum + num;
				} else
					oddsum += num;
			}
		}
		System.out.println("Difference of odd and even numbers in string is " + (oddsum - evensum));
	}

	public static void main(String[] args) {
		new A23_DifferenceOddNoEvenNoInString().displayDifferenceofOddNoEvenNo("tec5hno3cre6di1ts");
	}
}