package shital;

class A21_ReturnDigitOnly{
	
	void getDigitFromString(String name){
		System.out.println("Given String is: "+name);
		String temp="";
		for(int index=0;index<name.length();index++){
			char ch=name.charAt(index);
			if(Character.isDigit(ch)) {
				temp=temp+ch;			
			}
		}
		System.out.println("digit is:"+temp);
		//return temp;
	}
	
	public static void main(String[] args){
		A21_ReturnDigitOnly returnDigitOnly=new A21_ReturnDigitOnly();
		returnDigitOnly.getDigitFromString("t1e3h45n9o");
	}
	
}