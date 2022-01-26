package sagarAcharya;

public class A23_P2 {

	public static void main(String[] args) {
		A23_P2 a23 = new A23_P2();
		a23.findSumOfNum("te12ch22nocre3dits4");
	}
	
	void findSumOfNum(String input) {
		String temp = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				temp += ch;
			}else{
				if(!temp.equals("")) {
					sum += Integer.parseInt(temp);
				}
				temp = "";
			}
		}
		if(!temp.equals("")) {
			sum += Integer.parseInt(temp);
		}
		System.out.println(sum);
	}
}


/*Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41
*/