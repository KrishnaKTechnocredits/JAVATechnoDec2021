package nasir;

public class Test3_MaxNumber {
	int findMaxNumber(int input) {
		int max=0;
		while(input>0) {
			int lastdigit =input%10;
			if(max<lastdigit)
				max=lastdigit;
			input=input/10;
		}
			return max;
		}
	
	public static void main(String[] args) {
		Test3_MaxNumber maxNumber = new Test3_MaxNumber();
		int ans=maxNumber.findMaxNumber(6832774);
		System.out.println("Max digit number is "+ans);
		
	}
}
