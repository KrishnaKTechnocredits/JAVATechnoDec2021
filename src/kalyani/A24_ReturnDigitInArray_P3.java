package kalyani;

public class A24_ReturnDigitInArray_P3 {
	
	void processData(String input) {
		String[] ans=input.split(" ");
		for(int index=0; index<ans.length;index++) {
			String output1=ans[index];
			String name=findDigit(output1);
			System.out.println("Digit present in word : ");
			System.out.println(name);
		}		
	}

	String findDigit(String digit) {
		String temp=" ";
		for(int index=0; index<digit.length();index++) {
			char ch = digit.charAt(index);
			if(Character.isDigit(ch))
				temp=temp+ch;
		}
		return temp;
	}

	public static void main(String[] args) {
		A24_ReturnDigitInArray_P3 assign24 = new A24_ReturnDigitInArray_P3();
		assign24.processData("Te1c2h C94re3");
	}
}