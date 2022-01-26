package yogiraj;

import java.util.Iterator;

public class Assignment24 
{
	String str = "";
	
	public void countLenght()
	{		
		String str = "Hi Hello";
		
		String temp = "";
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp= temp + str.charAt(i);
			}
			else
			{
				System.out.println(temp + "-->   " + temp.length() + "\n");
				
				temp = "";
			}
			
			if(i==str.length()-1)
			{
				System.out.println(temp + "-->   " + temp.length() + "\n");			
			}
		}
	}
	
	public void countVowel()
	{
		String str ="aashvi technocredits"; 
		
		String temp ="";
		
		int vowelCount = 0;
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp = temp +str.charAt(i);
			}
			else
			{
				for(int j = 0; j<temp.length();j++)
				{
					if(temp.charAt(j)=='a' || temp.charAt(j)=='e' || temp.charAt(j)=='i' || temp.charAt(j)=='o'  ||temp.charAt(j)=='u' )
					{
						vowelCount++;
					}
				}
				System.out.println("Vowels in "+temp + "  " + vowelCount+"\n");
				
				temp="";
				
				vowelCount=0;
			}
			
			if(i==str.length()-1)
			{
				for(int j = 0; j<temp.length();j++)
				{
				
					if(temp.charAt(j)=='a' || temp.charAt(j)=='e' || temp.charAt(j)=='i' || temp.charAt(j)=='o'  ||temp.charAt(j)=='u' )
					{
						vowelCount++;
					}
				}
			}				
		}
		System.out.println("Vowels in "+temp + "  " + vowelCount+"\n");
	}
	
	public void digitArray()
	{
		/*Input    : "Te1c2h C94re3"
		  Output : "12" "943"
		 */
		
		String input ="Te1c2h C94re3";
		
		String digitArray="";
		
		for(int i=0; i<input.length();i++)
		{
			if(Character.isDigit(input.charAt(i)))
			{
				digitArray = digitArray + input.charAt(i);
			
			}	
		}
		
		System.out.println("Array of digits "+digitArray + "\n");
	}
	
	public void reverseString()
	{
		/*Input    : "Hi techno hello"
		Output : "iH onhcet olleh"
		 */
		
		String input ="Hi techno hello";
		
		String output="";
		
		String reversedString="";
		
		for (int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i)!=' ')
			{
				output = output + input.charAt(i);
			}
			else
			{
				for(int j = output.length()-1; j>=0; j--)
				{
					reversedString += output.charAt(j);
				}

				
				output = "";
				reversedString = reversedString + " ";
			}
			if(i==input.length()-1)
			{
				for(int j = output.length()-1; j>=0; j--)
				{
					reversedString += output.charAt(j);
				}
			}
		}
		
		System.out.println("Reversed string: "+reversedString +"\n");
	}
	
	public void toCapital()
	{	/*
		  Input    : "anvit harsh dipali"
		   Output : "Anvit Harsh Dipali"
		*/		String input = "anvit harsh dipali";
		
		String output="";
		
		String temp="";

		int i =0;
		
		while(i<input.length())
		{
			if(input.charAt(i)!=' ')
			{
				temp += input.charAt(i);
			}
			else 
			{
				temp=temp.substring(0,1).toUpperCase()+temp.substring(2).toLowerCase();

				output = output+temp +" ";

				temp="";
			}

			i++;
		}
		temp=temp.substring(0,1).toUpperCase()+temp.substring(1);

		output = output+temp +" ";

		System.out.println(output);
	}
	
	public void reverseAndCapital()
	{
		/*Input    : "Vrushali Sagar Shital"
		  Output : "IlahsurV Ragas LatihS
		 */
		String s = "Vrushali Sagar Shital";
		
		String temp="";
		
		String reverseString="";
		
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp = temp+s.charAt(i);
			}
			else
			{
				//temp = temp + " ";
				temp= temp.substring(0, temp.length()-1).toLowerCase() + temp.substring(temp.length()-1).toUpperCase();
				
				for(int j = temp.length()-1; j>=0; j--)
				{
					reverseString += temp.charAt(j);
				}
				temp = "";

				reverseString = reverseString +" ";
			}
			if(i==s.length()-1)
			{
				temp= temp.substring(0, temp.length()-1).toLowerCase() + temp.substring(temp.length()-1).toUpperCase();
				
				for(int j = temp.length()-1; j>=0; j--)
				{
					reverseString += temp.charAt(j);
				}
			}
		}
		System.out.println("Reversed String with Capital letters "+reverseString + "\n");
	}
	
	public void reverseEachChar()
	{
		String st="TeCHnoC";
		
		String output="";
		
		String temp="";
		
		for(int i=0; i<st.length();i++)
		{
			if(Character.isUpperCase(st.charAt(i)))
			{
				temp+= temp +Character.toLowerCase(st.charAt(i));
				
				output = output + temp;
				
				temp="";
			}
			else
			{
				temp+= temp +Character.toUpperCase(st.charAt(i));
				
				output = output + temp;
				
				temp="";

			}
			
		}
		System.out.println("String with each char reversed is  "+output);
	}

	
		
	
	public static void main(String[] args)
	{
		Assignment24 a = new Assignment24();
		
		a.countLenght();
		
		a.countVowel();
		
		a.digitArray();
		
		a.reverseString();
		
		a.toCapital();
		
		a.reverseAndCapital();
		
		a.reverseEachChar();
		
	}

}
