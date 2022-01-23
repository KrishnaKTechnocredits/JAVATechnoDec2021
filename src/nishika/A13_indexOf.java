package nishika;

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
		
		String temp="";
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				temp=temp+ch;
			}
		}
			System.out.println("----->"+temp);
	}
	
	void firtUniqueChar(String name){
		
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				System.out.println("first unique char is----> : " + ch);
				break;
			}
		}
	}
	
	void firstDuplicate(String name){
		
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) != name.lastIndexOf(ch)){
				System.out.println("First duplicate character is------> : " + ch);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		A13_indexOf a13_indexOf  = new A13_indexOf();
		System.out.println("All duplicate characters are : ");
		a13_indexOf.AllDuplicateChar("technocredits");
		System.out.println("All unique characters are : ");
		a13_indexOf.allUniqueChar("technocredits");
		a13_indexOf.firtUniqueChar("technocredits");
		a13_indexOf.firstDuplicate("technocredits");
	}
}
