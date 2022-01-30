package kavleen;

public class Assignment23_DiffEvenOdd {

	void differenceFromOddDigits(String input){
		int sumOdd = 0;
		int sumEven = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (!temp.equals("")) {
				int num = Integer.parseInt(temp);
				if (num % 2 == 0) {
					sumEven += Integer.parseInt(temp);
					temp = "";
				} else if (!temp.equals("")) {
					num = Integer.parseInt(temp);
					if (num % 2 != 0)
						sumOdd += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (!temp.equals("")) {
			int num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				sumEven += Integer.parseInt(temp);
				temp = "";
			} else if (!temp.equals("")) {
				num = Integer.parseInt(temp);
				if (num % 2 != 0)
					sumOdd += Integer.parseInt(temp);
				temp = "";
			}
		}
		System.out.println(sumEven - sumOdd);
	}
	public static void main(String [] args){
		Assignment23_Difference assignmentdiff = new Assignment23_Difference();
		String input = "te112ch34no29";
		assignmentdiff.differenceFromOddDigits(input);
		System.out.println("Diff between sum of odd and even numbers is " );
	}	
}
