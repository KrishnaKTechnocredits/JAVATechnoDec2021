package shital;

class A19_PrintCountCombo{
	
	void getCount(String name){
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digitCount=0;
	
		System.out.println("Given String is :"+name);
		for(int index=0;index<name.length();index++){
			char ch=name.charAt(index);
			if(Character.isDigit(ch))
				digitCount++;
			
			else if(Character.isLetter(ch))
				if(Character.isUpperCase(ch))
					upperCaseCount++;
				else
					lowerCaseCount++;	
		}
		System.out.println("\nTotal Digit count is : "+digitCount);
		System.out.println("Total UpperCase Count is :"+upperCaseCount);
		System.out.println("Total Lower case Count is : "+lowerCaseCount);
		System.out.println("Total Letters count is :"+(upperCaseCount+lowerCaseCount));
	}
	
	public static void main(String[] args){
		A19_PrintCountCombo printcount=new A19_PrintCountCombo();
		printcount.getCount("TE1ch2noC2red9iTs");
	}

}