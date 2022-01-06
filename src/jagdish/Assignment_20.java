package jagdish;

public class Assignment_20 {

	void allcaseMethod(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}

		}
		System.out.println("The sum of the given digit in String is:- " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_20 a20 = new Assignment_20();
		a20.allcaseMethod("Tech1nocre22di6ts");
	}

}
