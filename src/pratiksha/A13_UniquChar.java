package pratiksha;

public class A13_UniquChar {
	
	

	void uniqueCharacter(String name) {
    	char ch =' ';
    	for(int index=0; index<=name.length()-1; index++) {
    		ch=name.charAt(index);
    		if(name.indexOf(ch)== name.lastIndexOf(ch)  && name.lastIndexOf(ch)==index) {
    			System.out.println("Unique characters are :"+ch);
    		}
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A13_UniquChar uniqueChar= new A13_UniquChar();
		uniqueChar.uniqueCharacter("Sidhi");
		
	}

}
