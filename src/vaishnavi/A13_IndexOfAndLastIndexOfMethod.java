package vaishnavi;

public class A13_IndexOfAndLastIndexOfMethod {

	void printAllDuplicateChar(String name) {
		char ch =' ';
    	for(int index=0; index<name.length(); index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
    			System.out.println(ch);
    		}
    	}
    }
	void printAllUniqueChar(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				System.out.println(ch);
			}
		}
	}

	void displayFirtUniqueChar(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) == name.lastIndexOf(ch)){
				System.out.println("First unique character in given string is : " + ch);
				break;
			}
		}
	}

	void displayFirstDuplicateChar(String name){
		for(int index = 0; index < name.length(); index++){
			char ch = name.charAt(index);
			if(name.indexOf(ch) != name.lastIndexOf(ch)){
				System.out.println("First duplicate character in given string is : " + ch);
				break;
			}
		}
	}

	public static void main(String[] args){
		A13_IndexOfAndLastIndexOfMethod a13_IndexOfAndLastIndexOfMethod  = new A13_IndexOfAndLastIndexOfMethod();
		System.out.println("All duplicate characters are : ");
		a13_IndexOfAndLastIndexOfMethod.printAllDuplicateChar("vaishnavi");
		System.out.println();

		System.out.println("All unique characters are : ");
		a13_IndexOfAndLastIndexOfMethod.printAllUniqueChar("vaishnavi");
		System.out.println();

		a13_IndexOfAndLastIndexOfMethod.displayFirtUniqueChar("vaishnavi");
		System.out.println();

		a13_IndexOfAndLastIndexOfMethod.displayFirstDuplicateChar("vaishnavi");
	}
}