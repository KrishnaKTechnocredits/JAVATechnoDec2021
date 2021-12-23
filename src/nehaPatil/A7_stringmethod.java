package nehaPatil;

public class A7_stringmethod {
	
	void evenPosition(String input) {
		for(int index=0;index<input.length();index++) {
			if(index%2!=0)
				System.out.println(input.charAt(index));
		}
	}
	void vowels(String input) {
		for(int index=0;index<input.length();index++) {
			if(input.charAt(index)=='a'||input.charAt(index)=='e'||input.charAt(index)=='i'||input.charAt(index)=='o'||input.charAt(index)=='u')
				System.out.println(input.charAt(index));
		}
	}
    public static void main(String[] args) {
    	A7_stringmethod  a7_stringmethod =new A7_stringmethod();
        a7_stringmethod.evenPosition("technocredits");
        a7_stringmethod.vowels("technocredits");
    }
}




