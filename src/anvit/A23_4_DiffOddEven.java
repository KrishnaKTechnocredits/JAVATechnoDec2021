package anvit;

public class A23_4_DiffOddEven {
	
	void mainMethod(String input) {
		int odd = 0;
		int even = 0;
		int total = 0;
		for(int i = 0; i<input.length();i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				String str = ch + "";
				int num = Integer.parseInt(str);
				if(num%2!=0) {
					odd = odd + num;
				}
				else {
					even = even + num;
				}
			}
		}
		total = odd - even;
		System.out.println("Difference between odd and even is: "+total);
	}
	
	public static void main(String[] args) {
		A23_4_DiffOddEven a23_4_DiffOddEven = new A23_4_DiffOddEven();
		a23_4_DiffOddEven.mainMethod("tec5hno3cre6di1ts");
	}
}
