/* 7. WAP to reverse the case of each char in a given word
Input    : "TeCHnoC"    */

package amruta.Assignment_24;

class ChangeTheCaseOfChar{

	void changeCharCase(String str){
		String temp = "";
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
			
			if(Character.isUpperCase(ch))
				temp = temp + Character.toLowerCase(ch);
			else
				temp = temp + Character.toUpperCase(ch);
		}
		System.out.println("After reversing Case of each char in given string: "+temp);
	}
	
	public static void main(String[] args){
		String str = "TeCHnoC" ;
		new ChangeTheCaseOfChar().changeCharCase(str);
	}
}