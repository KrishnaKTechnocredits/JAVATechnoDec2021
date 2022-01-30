package yogeshNimbalkar;

public class A29_SumOfNumbersInStr {

	int getSumOfNumbers(String str) {
		String[] arr = str.split(" ");
		int sum = 0;
		for(int index=0; index<arr.length; index++) {
			try {
				sum = sum + Integer.parseInt(arr[index]);
			}catch(RuntimeException re) {
				
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A29_SumOfNumbersInStr sumOfNumbersInStr = new A29_SumOfNumbersInStr();
		String input = "I have 15 years and 3 months of automation experience in 2 componies";
		System.out.println("Sum of numbers : " + sumOfNumbersInStr.getSumOfNumbers(input));
	}
}
