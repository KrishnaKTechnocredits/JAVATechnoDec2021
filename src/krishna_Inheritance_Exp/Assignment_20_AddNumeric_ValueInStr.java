package krishna_Inheritance_Exp;

public class Assignment_20_AddNumeric_ValueInStr {
	void sumNumericValue(String find) {
		int sum = 0;
		for (int index = 0; index < find.length(); index++) {
			char ch = find.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("The Sum of Numeric Value is : " + sum);
	}

	public static void main(String[] args) {
		Assignment_20_AddNumeric_ValueInStr ass20 = new Assignment_20_AddNumeric_ValueInStr();
		ass20.sumNumericValue("Tech1credi2ts");
	}

}
