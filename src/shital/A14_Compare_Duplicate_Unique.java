package shital;

import java.util.Scanner;

class A14_Compare_Duplicate_Unique{
	
	int uniqueCharCount=0;
	int duplicateCharCount=0;
		
	void findComaparision(String name){
		
		for(int index=0;index<name.length();index++){
			char ch=name.charAt(index);
			if(index==name.indexOf(ch)){
				if(name.indexOf(ch)!=name.lastIndexOf(ch)){
					//System.out.println("Duplicate character is :"+ch);
					duplicateCharCount++;
				}
				
				if(name.indexOf(ch)==name.lastIndexOf(ch)){
					//System.out.println("Unique Char Count is: "+ch);
					uniqueCharCount++;
				}
			}
		}
		
		if(duplicateCharCount>uniqueCharCount){
			System.out.println("java");
			System.out.println("**********Duplicate Character are more than Unique********");
		}
		else{
			System.out.println("selenium");
			System.out.println("**********Unique Character are more than Duplicate********");
		}
	}

	public static void main(String[]  args){
		A14_Compare_Duplicate_Unique objCompare=new A14_Compare_Duplicate_Unique();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String name=sc.nextLine();
		objCompare.findComaparision(name);
		sc.close();
	}
}

