package poojaRajguru;

public class A29_SumInDigitsUsingCharacterclass {
	void digitsInString(String str2) {
		String[] arr = str2.split(" ");
			int sum = 0;
			for(int i=0;i<arr.length;i++) {
				try {					
					sum= sum + Integer.parseInt(arr[i]);
				}
				 catch(NumberFormatException ne) {
				}
			} 
			System.out.println("The Sum : " + sum);
	}	
		public static void main(String[] args) {
		A29_SumInDigitsUsingCharacterclass sum = new A29_SumInDigitsUsingCharacterclass();
		String str2 = "I have 15 years and 3 months of automation experience";
		sum.digitsInString(str2);
	}
}
