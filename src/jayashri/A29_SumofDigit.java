package jayashri;

public class A29_SumofDigit {
	void calculateSumOfDigit(String stmt){
		int sum=0;
		for(int i=0; i<stmt.length(); i++) {
			char temp = stmt.charAt(i);
				if (Character.isDigit(temp)) {
					int digit = Integer.parseInt(String.valueOf(temp));
					sum = sum + digit;
				}
		}
		System.out.println("Sum of digits in string is:" +sum);
		
	}

	public static void main(String[] args){
		A29_SumofDigit a29 = new A29_SumofDigit();
		a29.calculateSumOfDigit("I have 15 years and 3 months of automation experience");
	}

}
