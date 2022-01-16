package anvit;

public class A20_Sum_Digits_From_String {
	
	void method(String name) {
		int sum=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Addition of digits is : "+ sum);
	}
	
	public static void main(String[] args) {
		A20_Sum_Digits_From_String a20_Sum_Digits_From_String = new A20_Sum_Digits_From_String();
		a20_Sum_Digits_From_String.method("tech1noc9red3its");
	}
}
