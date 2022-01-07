package priya;

public class A20_StringDigSum {
	
	void method(String name) {
			int sum=0;
			for(int i=0;i<name.length();i++) {
				char ch = name.charAt(i);
				if(Character.isDigit(ch)) {
					int num = Character.getNumericValue(ch); //returns the int value that the specified character
					sum = sum + num;
				}
			}
			System.out.println("Addition of digits is : "+ sum);
		}

		public static void main(String[] args) {
			A20_StringDigSum a20_stringdigSum = new A20_StringDigSum();
			a20_stringdigSum.method("tech1noc9red3its");
		}
}
