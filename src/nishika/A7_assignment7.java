package nishika;

public class A7_assignment7 {
	String temp = "";
	void evenChar(String name){
		String tem ="" ; 
		for(int index=0; index<name.length(); index++)
			if(index%2 !=0)
			tem = tem + name.charAt(index);	
			System.out.println(tem);
	}

	void displayVowels(String name){
		for(int index=0; index<name.length(); index++){
			if(name.charAt(index)=='a' || name.charAt(index)=='e' || name.charAt(index)=='i' || name.charAt(index)=='o' ||name.charAt(index)=='u')
			System.out.println(name.charAt(index));	
		}
	}
	
	void displayVowel(String name){
		for(int index=0; index<name.length(); index++)
		{
			
			char ch = name.charAt(index);
			if(ch == 'a' || ch =='e' || ch =='i' || ch=='o' || ch=='u') {
				temp = temp + ch;
			}
		}System.out.println(temp);
	}

	public static void main(String[] args){
		A7_assignment7 a7_assignment7 = new A7_assignment7();	
		a7_assignment7.evenChar("technocredits");
		System.out.println("-----");
		a7_assignment7.displayVowels("technocredits");
		
		a7_assignment7.displayVowel("technocredits");
		}
}
