import java.util.Scanner;

class A12_P4_reverseString{
	
	String findReverseString(String name){
		String output = " ";
		for(int index = name.length()-1;index>=0;index--){
			output += name.charAt(index);
		}
		return output;
	}
	
	void printReverse(String input){
		String reverse = findReverseString(input);
			System.out.println("Reverse of your input is : "+reverse);
	}
	
	public static void main(String[] args){
		A12_P4_reverseString a12 = new A12_P4_reverseString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String i = sc.next();
		a12.printReverse(i);
	}
}