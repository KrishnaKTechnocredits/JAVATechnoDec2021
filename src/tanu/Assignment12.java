package tanu;

import java.util.Scanner;

class Assignment12 {

	void charFrequency(String name) {
		int index = 0;
		char i;
		for (index = 0; index < name.length(); index++) {
			int count = 0;
			i = name.charAt(index);
			for (int charIndex = 0; charIndex < name.length(); charIndex++) {
				if (name.charAt(charIndex) == i) {
					count++;
				}
			}
			System.out.println(i + " is present " + count + " times in " + name);

		}
	}

	void maxPrimeRange(int firstnum, int lastnum){
		 int maxPrime=firstnum;
		 
		 for(int primeindex=firstnum; primeindex<=lastnum; primeindex++){
			 boolean flag = true;
		 for(int index=2; index<=primeindex/2; index++){
			 if(primeindex%index == 0){
		     flag = false;
		     break;
	}
	  }
		 if(flag == true) {
			 if (primeindex>maxPrime) {
				 maxPrime=primeindex;
			 }
		 }
	  }
			  
	 System.out.println("max prime num is "+maxPrime);
	 
		 }
	
	
	void nonRepeatCharString(String name) {
		int index=0;
		char first;
		char next;

		for(index=0; index<name.length(); index++ ) {
			boolean nonRepeat=false;
			first = name.charAt(index);		
			for(int num=index+1; num<name.length(); num++) {
				next = name.charAt(num);
				if(first == next)
				{
					nonRepeat = true;
					break;
				}
				}
			if(nonRepeat == false)
			{
				System.out.println(name.charAt(index) + " is first non repeating");
				break;
			}
		}


	}

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = input.next();
		Assignment12 assignment = new Assignment12();
		assignment.charFrequency(userInput);
		System.out.println("Enter a range");
		int firstnumber = input.nextInt();
		int secondnumber = input.nextInt();
		assignment.maxPrimeRange(firstnumber,secondnumber);
		System.out.println("Enter a string");
		String inputcharacter = input.next();
		assignment.nonRepeatCharString(inputcharacter);
		
		
		
	}
}