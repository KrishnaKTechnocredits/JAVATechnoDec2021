package shital;

import java.util.Scanner;

class FrequencyOfCharacter{
	
	String ch;
		
	void findFrequencyOfCharacter(String name){
		//System.out.println("Given String is: "+name);
		for(int index=0;index<name.length();index++){
			char c=name.charAt(index);
			int count=0;
			for(int i=0;i<name.length();i++){
				if(name.charAt(i)==c){
					count++;
				}
			}
				ch="Character: "+c+":"+count;
			//System.out.println("Frequency of Character:  "+c+" - "+count);
			if(count>0)
				System.out.println("Character Frequency: "+c+"-"+count);
			}
	}
 
	public static void main(String[] args){
		FrequencyOfCharacter frequencyOfCharacter=new FrequencyOfCharacter();
			Scanner sc = new Scanner(System.in);
			System.out.println("****Find Frequency of character from given String****");
			System.out.print("Enter the String : ");
			String name = sc.nextLine();
			frequencyOfCharacter.findFrequencyOfCharacter(name);
			System.out.println();
			sc.close();
	}
}