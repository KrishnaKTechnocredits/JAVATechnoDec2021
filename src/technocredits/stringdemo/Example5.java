package technocredits.stringdemo;

// Done : toString method
public class Example5 {

	int num = 10;
	
	void processData() {
		String str1 = "Techno";
		String str2 = "Techno";
		String str3 = new String("Techno");
		String str4 = new String("Techno");
		
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false
		System.out.println(str1 == str4); // false
		System.out.println(str2 == str3); // false
		System.out.println(str3 == str4); // false
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3)); // true
		System.out.println(str1.equals(str4));// true
		System.out.println(str2.equals(str3));// true
		System.out.println(str3.equals(str4));// true
		
		String input1 = "Hi";
		String input2 = new String("hi");
		System.out.println(input1.equals(input2)); // false 
	}
	public static void main(String[] args) {
		Example5 example5 = new Example5();
		example5.processData();
	}
}
