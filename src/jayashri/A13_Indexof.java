package jayashri;

public class A13_Indexof {

String str = "technocredits";
	
	void allDuplicate(){
		System.out.println("Duplicate characters are:");
		for(int index = 0;index<str.length();index++){
			char ch = str.charAt(index);
		if(index == str.indexOf(ch)) {
			if(str.indexOf(ch)!= str.lastIndexOf(ch)) {
				System.out.println(ch + " is duplicate");
			}
		}
		}
	}
	
	void allUnique(){
		System.out.println("Unique characters are:");
		for(int index = 0;index<str.length();index++){
			char ch = str.charAt(index);
		if(index == str.indexOf(ch)) {
			if(str.indexOf(ch)== str.lastIndexOf(ch)) {
				System.out.println(ch + " is unique");
			}
		}
		}
	}
	
	void firstUnique(){
		System.out.println("First Unique characters is:");
		for(int index = 0;index<str.length();index++){
			char ch = str.charAt(index);
		if(str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println(ch + " is unique");
				break;
			}
		}
		}
	void firstDuplicate(){
		System.out.println("First Duplicate characters is:");
		for(int index = 0;index<str.length();index++){
			char ch = str.charAt(index);
		if(str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println(ch + " is duplicate");
				break;
			}
		}
		}
	public static void main(String [] args){
		A13_Indexof a13_indexof = new A13_Indexof();
		a13_indexof.allUnique();
		a13_indexof.allDuplicate();
		a13_indexof.firstUnique();
		a13_indexof.firstDuplicate();
	}
}
