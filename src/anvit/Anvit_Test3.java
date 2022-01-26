package anvit;

public class Anvit_Test3 {
	
	void findMaxDigit(int input) {
		
		int remainder = 0;
		int maxNum = 0;
		while(input > 0) {
			remainder = input% 10;
			input = input /10;
			if(remainder>maxNum)
				maxNum = remainder;
		}
		System.out.println(maxNum);
	}
	
	public static void main(String[] args) {
		Anvit_Test3  anvit_Test3 = new Anvit_Test3();
		anvit_Test3.findMaxDigit(6832774);
	}
}
