package ashok;

public class A7_String {
	
	void evenChar(String str) {
		
		for(int index=0; index < str.length(); index++) {
			if(index % 2 != 0)
			System.out.print(str.charAt(index));
		}
	}
	
	void vowelsChar(String str) {
		
		for(int index=0; index < str.length(); index++) {
			if(str.charAt(index)== 'a' || str.charAt(index)== 'e' || str.charAt(index)== 'o' || str.charAt(index)== 'i' || str.charAt(index)== 'u')
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A7_String a7 = new A7_String();
		System.out.println("Even string charcter");
		a7.evenChar("technocredits");
		System.out.println("\nVowels");
		a7.vowelsChar("technocredits");
	}

}
