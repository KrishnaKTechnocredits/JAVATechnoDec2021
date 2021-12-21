package poojaRajguru;

class A6_StringOperation{
	
	void characterDisplay(String ch){
		for(int i=0;i<ch.length();i++){
			System.out.println(ch.charAt(i));
		}
	}
	
	void reverseString(String str){
		for(int i=str.length()-1;i>=0;i--){
			System.out.println(str.charAt(i));
		}
	}
	
	void count(String str, char ch){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)== ch)
				count++;
		}
			System.out.println(count);
	}
	
	public static void main(String[] args){
		A6_StringOperation so = new A6_StringOperation();
		so.characterDisplay("Pooja");
		so.reverseString("Pooja");
		so.count("Pooja",'o');
	}

}