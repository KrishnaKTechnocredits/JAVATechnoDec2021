package shivangi;

public class A13_indexOf {
	void AllDuplicateChar(String name){
		boolean flag = true;
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				flag = false;
				break;
			}
			if(flag == true)
				System.out.println(ch);
		}
	}
	
	void allUniqueChar(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				System.out.println("Unique char of "+name+" string is : " + ch);
			}
		}
	}
	
	void firtUniqueChar(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				System.out.println("First unique char in the string is : " + ch);
				break;
			}
		}
	}
	
	void firstDuplicate(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) != name.lastIndexOf(ch)){
				System.out.println("First duplicate character is : " + ch);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		A13_indexOf ex1 = new A13_indexOf();
		System.out.println("All duplicate characters are : ");
		ex1.AllDuplicateChar("technocredits");
		
		System.out.println();
		System.out.println("-----------********----------");
		System.out.println("All unique characters are : ");
		ex1.allUniqueChar("technocredits");
		
		System.out.println();
		System.out.println("-----------********----------");
		ex1.firtUniqueChar("technocredits");
		
		System.out.println();
		System.out.println("-----------********----------");
		ex1.firstDuplicate("technocredits");
	}
}
