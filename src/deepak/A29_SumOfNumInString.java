package deepak;

public class A29_SumOfNumInString {
	
	void getSumOfNumsInString(String input) {
		int sum = 0;
		String[] arr = input.split(" ");
		for(int index = 0 ; index < arr.length ; index++) {
			try {
				sum = sum + Integer.parseInt(arr[index]);
			}
			catch(NumberFormatException ne) {
			}
		}System.out.println("The sum digits in the string is: "+sum);
	}	
	
	public static void main(String[] args) {
		A29_SumOfNumInString sum = new A29_SumOfNumInString();
		sum.getSumOfNumsInString("I am 15 years old and my brother is 5 years old");
		
	}

}
