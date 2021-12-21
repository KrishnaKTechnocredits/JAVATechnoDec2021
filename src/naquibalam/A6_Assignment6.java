package naquibalam;

class A6_Assignment6 {
	
	void displayString(String input) {
		int count = 0;
		System.out.println("Display each character of string : ");
		for (int i = 0; i <= input.length() - 1; i++){
			System.out.println(input.charAt(i));
		}
	}
	
	void displayReverseString(String input) {
		int count = 0;
		System.out.println("Display in reverse each character of string : ");
		for (int i = input.length() - 1; i >= 0; i--){
			System.out.println(input.charAt(i));
		}
	}
	
	void findOccurance(String input, char in) {
		int count = 0;
		System.out.println("Number of times '" + in + "' is displayed in string - " + input + ", is : ");
		for (int i = 0; i <= input.length() - 1; i++){
			if (input.charAt(i)==in) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main (String[] args){
		A6_Assignment6 assignment6 = new A6_Assignment6();
		System.out.println("-------------------------------------------------------------------------");
		assignment6.displayString("techno");
		System.out.println("-------------------------------------------------------------------------");
		assignment6.displayReverseString("techno");
		System.out.println("-------------------------------------------------------------------------");
		assignment6.findOccurance("Naquibalam",'a');
		System.out.println("-------------------------------------------------------------------------");
	}
}