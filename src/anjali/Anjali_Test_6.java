/*Programming Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70

Expected time to complete all 3 program is 1 hr 15 mins (max)
 */
package anjali;

public class Anjali_Test_6 {
	
	char firstNonReapChar(String name) 
	{
		char firstNonRepeatChar=' ';
		for(int index=0;index<name.length();index++) 
		{
			char ch=name.charAt(index);
			if(Character.isUpperCase(ch)) 
			{
				if(name.indexOf(ch)==name.lastIndexOf(ch)) 
				{
				  firstNonRepeatChar=ch;
				  break;
				}
			}
		}
		return firstNonRepeatChar;
	}
	
	
	String wordHaveMaxLength(String name) 
	{
		String arr[]=name.split(" ");
		int max=0;
 	    String wordHaveMaxLength="";
		for(int index=0;index<arr.length;index++) 
		{
			if(arr[index].length()>max)
			{
				max=arr[index].length();
			    wordHaveMaxLength=arr[index];
			}
		}
		return  wordHaveMaxLength;
		
	}
	
	int sumOfDigit(String name) 
	{
		String arr[]=name.split(" ");
		int sum=0;
		for(int index=0;index<arr.length;index++) 
		{
			int num=Integer.parseInt(arr[index]);
			sum=sum+num;
		}
		return sum;
	}

	
	public static void main(String[] args) {
		Anjali_Test_6 anjali_Test_6 = new Anjali_Test_6();
		String input="tEChNoCrEdits";
		char output=anjali_Test_6.firstNonReapChar(input);
		System.out.println("In String "+input+" the first non repeating Capital character is "+output);
		
		String MaxlenghthWord=anjali_Test_6.wordHaveMaxLength("good morning technocredits hi hello");
		System.out.println(MaxlenghthWord+" is the word having maximum length");
		
		int outputSum=anjali_Test_6.sumOfDigit("10 10 20 30");
		System.out.println("The sum od digits is given string is "+outputSum);
		
	}

}
