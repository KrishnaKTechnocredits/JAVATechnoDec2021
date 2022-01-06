package archana;


public class Ass20_ASCII {

	void sumofNumInstring(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + (Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum of numbers in string : " + sum);
	}

	public static void main(String[] a) {
		Ass20_ASCII ass20 = new Ass20_ASCII();	
		String str = "tech1noc9red3its";
		ass20.sumofNumInstring(str);
		
	}
}