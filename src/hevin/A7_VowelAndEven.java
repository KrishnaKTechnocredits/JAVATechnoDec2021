package hevin;

public class A7_VowelAndEven {
	
	String vowelEven = "";
	
	void vowels(String name) {
		String vowelEven = "";
		for(int index=0; index<name.length(); index++) {
			if(name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u') 
				vowelEven = vowelEven + name.charAt(index);
		}			
		System.out.println("The vowels are :  " + vowelEven);
		System.out.println("-------------------------------");
	}
	
	
	void evenNumChar(String name){
		System.out.println("Below Characters are on the even Position : ");
		for(int index=0; index<name.length(); index++) {
			if(index%2!=0)
				System.out.println(name.charAt(index));
		}			
		
	}
	
	public static void main (String[] a){
		A7_VowelAndEven vowelandeven = new A7_VowelAndEven();
		vowelandeven.vowels("technocredits");
		vowelandeven.evenNumChar("technocredits");
		}
}
