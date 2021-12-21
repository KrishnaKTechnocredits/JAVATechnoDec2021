package ashutosh;

public class A7_String{
	
	int i;
	
	void evenPosition(String str){
		System.out.print("Characters at even places in " + str + " : ");
		for(i=0;i<str.length();i++){
			if(i%2==1)
				System.out.print(str.charAt(i));
	   	}
	}
	
	void vowel(String str){
		System.out.print("Vowels in " + str + " : ");
		for(i=0;i<str.length();i++){
			if(str.charAt(i) == 'a' || str.charAt(i)== 'i'|| str.charAt(i) == 'e'|| str.charAt(i) == 'o'|| str.charAt(i) =='u')
				System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args){
		A7_String sm = new A7_String();
		sm.evenPosition("ashutoshshahi");
		System.out.println();
		System.out.println("-------");
		sm.vowel("ashutoshshahi");
	}	
}
