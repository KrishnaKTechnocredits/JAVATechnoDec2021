package shital;

public class Test_FindMaxDigit {
	
	
	void getMaxDigit(String number) {
		int maxNum=0;
		for(int i=0;i<number.length();i++) {
			char ch=number.charAt(i);
			
			int temp=Character.getNumericValue(ch);
				if(maxNum<temp) {
					maxNum=temp;
				}
			System.out.println("Digit is : "+temp);
		}
		System.out.println("Max number is : "+maxNum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_FindMaxDigit test_FindMaxDigit=new Test_FindMaxDigit();
		String arr="6832774";
		System.out.println("Input is:"+arr);
		test_FindMaxDigit.getMaxDigit(arr);
		
	}
}
