package kalyani;

public class StringReverse {
	
	void printString(String name) {
		System.out.println("String is :");
		for(int index =0; index<name.length();index++) {
		System.out.println(name.charAt(index));
		}
	}
	
	void revStrg(String name){
		System.out.println("Reverse the String");
		for(int index =name.length()-1;index>=0;index--){
			System.out.println(name.charAt(index));
		}
	}	
	
	public static void main(String args[]){
		StringReverse stringreverse = new StringReverse();
		stringreverse.printString("Kalyani");
		stringreverse.revStrg("Kalyani");
	}
}


