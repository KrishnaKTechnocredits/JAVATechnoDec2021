package debasmita;

public class A14_UniqueDuplicate {
	
	int unicount,dupcount;
	
	void uniqueCharacter(String name) {
		for(int index=0;index<name.length(); index++) {
			char ch=name.charAt(index);
			if(name.indexOf(ch)==name.lastIndexOf(ch)) {
				System.out.println(ch + "");
				 unicount++;
			}
		 }
	}
	void duplicateCharacter(String name) {
		String temp="";
		for(int index=0;index<name.length(); index++) {
			char ch=name.charAt(index);
			String s = ch + " ";
			if(temp.contains(s)) {
			}
			else {
				if(name.indexOf(ch)!=name.lastIndexOf(ch)) {
					System.out.println(ch+ " ");
					dupcount++;
				}
			}
			     temp = temp + ch;
		}
	}
    void display() {
    	if(unicount>dupcount) {
    		System.out.println("Selenium");
    	}
    	else {
    		System.out.println("Java");
    	}
    	
    }
	public static void main(String[] args) {
		A14_UniqueDuplicate ud1=new A14_UniqueDuplicate();
		ud1.uniqueCharacter("Debasmita");
		ud1.duplicateCharacter("Debasmita");
		ud1.display();

	}

}
