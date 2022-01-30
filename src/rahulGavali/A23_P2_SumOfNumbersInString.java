package rahulGavali;

/*Assignment-23: 15th Jan'2022
Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41
*/
	public class A23_P2_SumOfNumbersInString {

		void getSumOfNum(String input) {
			int sum = 0;
			String temp = "";
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					temp = temp + ch;
				} else if (!temp.equals("")) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
			if (!temp.equals(""))
				sum = sum + Integer.parseInt(temp);
			System.out.println(sum);
		}

		public static void main(String[] args) {
			A23_P2_SumOfNumbersInString numSum = new A23_P2_SumOfNumbersInString();
			System.out.print("Sum of all the numbers in string: ");
			numSum.getSumOfNum("te12ch22nocre3dits4");
		}

}