package kavleen;

public class Assignment23_Sum {
	static void sumOfDigits(String input){
		int sum = 0;
		String temp = "";
		for (int index =0 ; index<input.length() ; index++){
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
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
	public static void main (String [] args) {
		Assignment23_Sum assignmentSum = new Assignment23_Sum();
		assignmentSum.sumOfDigits("te12ch22nocre3dits4");
	}
}
