package dharam;

public class A7_Dharam {
	void evenNumber(String name){
		System.out.println("All Even character display as following from technocredits");
		for(int index=0; index<name.length(); index++) {
			if ((index+1)%2==0)
				System.out.println(name.charAt(index));
		}
	}
	
	void vovelsNumber(String name) {
		System.out.println("All vovels number display as following from technocredits");
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				System.out.println(ch);
		}
	}
	public static void main (String[]args) {
		A7_Dharam a7_Dharam = new A7_Dharam();
		a7_Dharam.evenNumber("technocredits");
		a7_Dharam.vovelsNumber("technocredits");
	}
}
