package technocredits;

public class StringExample1 {

	void printData(boolean flag) {
		if(flag)
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		if(flag == true)
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		if(flag != false)
			System.out.println("Hi");
		else
			System.out.println("Hello");
		
		if(!flag)
			System.out.println("Hello");
		else
			System.out.println("Hi");
	}
	
	void printDuplicateChar(String str) {
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				if(str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.println(ch + " is duplicate");
				}
			}
		}
	}
	
	void containsDemo() {
		String str = "technocredits";
		System.out.println(str.contains("e"));
		
		String temp = ""; // techno
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			String s = ch + ""; //'t'// 't' + "" = "t"
			if(!temp.contains(s)) {
				if(str.indexOf(ch) != str.lastIndexOf(ch)) {
					System.out.println(ch + " is duplicate");
				}
				temp = temp + ch;
			}
		}
	}
	
	public static void main(String[] args) {
		new StringExample1().printDuplicateChar("technocredits");
	}
}
