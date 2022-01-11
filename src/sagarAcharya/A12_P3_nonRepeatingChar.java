//two methods practice

class A12_P3_nonRepeatingChar{
	
	int findFreq(String input,char ch){
		int count = 0;
		for(int index = 0;index<input.length();index++)
			if(input.charAt(index) == ch)
				count++;
			//System.out.println(ch + ":" + count);
		return count;
	}
	
	void findNonRepeating(String input1){
		for(int innerIndex = 0;innerIndex<input1.length();innerIndex++){
			char ch1 = input1.charAt(innerIndex);
			int count1 = findFreq(input1,ch1);
			//System.out.println("Freq of "+ch1+" is :" +count1);
			if(count1 == 1){
				System.out.println("First nonrepeating character is : "+ch1);
				break;
			}
			//break;
		}
	}
	
	void findRepeatingChar(String input2){
		for(int innerIndex = 0;innerIndex<input2.length();innerIndex++){
			char ch2 = input2.charAt(innerIndex);
			int count2 = findFreq(input2,ch2);
			//System.out.println("Freq of "+ch1+" is :" +count1);
			if(count2 > 1){
				System.out.println("First repeating character is : "+ch2);
				break;
			}
			//break;
		}
	}
	
	public static void main(String[] args){
		A12_P3_nonRepeatingChar a12 = new A12_P3_nonRepeatingChar();
		a12.findNonRepeating("technocredits");
		a12.findRepeatingChar("Sagar");
	}
}

/* 1. print freq of each character in given String. [prgram-1]
2. find max primenumber from given range. [range : 2 to 100, ans ; 97] [program-2]
3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i
5. write a method to return the reverse string. [program-3] */