package technocredits.stringdemo;

// intern() method is to transfer content of object to SCP only.

public class Example6 {
	
	void processData() {
		String str1 = "technocredits";
		String str2 = "TEchnO";
		String str3 = str2 + "Credits"; // TEchnOCredits
		String str4 = str3.toLowerCase(); // technocredits
		
		System.out.println(str1 == str4); // false
	}
	
	void processData1() {
		String str1 = "technocredits";
		String str2 = str1.substring(0,6);
		String str3 = "techno";
		System.out.println(str2 == str3);
	}
	
	void processData2() {
		String str1 = "technocredits";
		String str2 = str1.replace("credits","");
		String str3 = "techno";
		System.out.println(str2 == str3);
	}
	
	void processData3() {
		String str1 = new String("techno");
		String str2 = "techno";
		String str3 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
	}
	
	void processData4() {
		String str1 = new String("techno");
		str1 = str1.intern();
		String str2 = "techno";
		String str3 = str1.intern();
		
		System.out.println(str2 == str3); // true
		
		String str4 = new String(str3); // SCP to Object area
		String str5 = str3.substring(0);// SCP to Object area
		
	}
	
	public static void main(String[] args) {
		new Example6().processData4();
	}
}
