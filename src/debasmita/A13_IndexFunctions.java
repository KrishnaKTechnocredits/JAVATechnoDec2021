package debasmita;

public class A13_IndexFunctions {
	void uniqueCharacter(String name) {
		char ch = ' ';
		for(int index=0; index<name.length(); index++) {
			ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println("unique characters are :"+ch);
			}
		}
	}
    void duplicateCharacter(String name) {
    	char ch =' ';
    	for(int index=0; index<name.length(); index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
    			System.out.println("duplicate characters are :"+ch);
    		}
    	}
    }
    void firstUniqueCharacter(String name) {
    	char ch=' ';
    	for(int index=0; index<name.length(); index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)==name.lastIndexOf(ch)) {
    			System.out.println("first unique character is:"+ch);
    			break;
    		}
    	}
    }
    void firstDuplicateCharacter(String name) {
    	char ch=' ';
    	for(int index=0; index<name.length(); index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
    			System.out.println("first duplicate character is: "+ch);
    			break;
    		}
    	}
    }
    public static void main(String[] args) {
    	A13_IndexFunctions indexfunctions=new A13_IndexFunctions();
    	indexfunctions.uniqueCharacter("Debasmita");
    	System.out.println("*******************************");
    	indexfunctions.duplicateCharacter("Debasmita");
    	System.out.println("*******************************");
    	indexfunctions.firstUniqueCharacter("Debasmita");
    	System.out.println("*******************************");
    	indexfunctions.firstDuplicateCharacter("Debasmita");
    }
}
