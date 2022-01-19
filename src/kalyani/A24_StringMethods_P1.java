package kalyani;

public class A24_StringMethods_P1 {
	
	void countOfWords(String inputString) {
		String[] outputString = inputString.split(" ");
		for (int index = 0; index < outputString.length; index++) {
			System.out.println(outputString[index] + " - total length is " + outputString[index].length());
		}
	}

	public static void main(String[] args) {
		A24_StringMethods_P1 assign24 = new A24_StringMethods_P1();
		assign24.countOfWords("Hi Kalyani");

	}
}
