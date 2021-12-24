package hevin;

public class A11_OccurrenceOfCharacter {
	
	int firstOccurance(String input, char ch){
		for(int index=0; index<input.length();index++){
			int output=0;
			if(input.charAt(index)==ch){
				output=index;
				System.out.println("First Occurance of Character "+ch+" is : "+output);
				return output;
			}
		}
			return -1;
	}

	int lastOccurance(String input, char ch){
		for(int index=input.length()-1; index<=input.length();index--){
			int output=0;
			if(input.charAt(index)==ch){
				output=index;
				System.out.println("Last Occurance of Character "+ch+" is : "+output);
				return output;
			}
		}
			return -1;
	}

	boolean trueOutput(String input, char ch){
		boolean flag=false;
		for(int index=0; index<input.length();index++){
			if(input.charAt(index)==ch){
				flag=true;
				return flag;
			}		
		}
	            return flag;
	}
	 int totalOccurance(String input, char ch){
		 int count=0;
		for(int index=0; index<input.length();index++){
			if(input.charAt(index)==ch){
				count++;
			}		
		}
		    return count;
	 }
	public static void main(String[]args){
		A11_OccurrenceOfCharacter returnoccurance = new A11_OccurrenceOfCharacter();
		returnoccurance.firstOccurance("Hevinpatel",'e');				
		returnoccurance.lastOccurance("Hevinpatel",'e');
		boolean output1=returnoccurance.trueOutput("Hevinpatel",'n');
		if(output1==true)
			System.out.println("Character n found : "+ output1);
		else
			System.out.println("Character n not found : "+ output1);
		int output2=returnoccurance.totalOccurance("Hevinpatel",'e');
		System.out.println("Total Occurance of Character e is : "+ output2);		
	}	

}
