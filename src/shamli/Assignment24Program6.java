package shamli;

public class Assignment24Program6 {


		void splitAndGetOutputString(String input)
		{
			
			String[] arr=input.split(" ");
			String output="";
			for(int index=0;index<arr.length;index++)
			{
				output =output+ " " +reverseWord(arr[index]);
			}
			output=output.trim();
			System.out.println(output);
		}
		
		String reverseWord(String word)
		{
			String reverseword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				char ch=word.charAt(i);
				if(i==word.length()-1)
				{
					ch=Character.toUpperCase(ch);
				}
				reverseword=reverseword+ch;
			}
			
			return reverseword;
		}
		
		public static void main(String[] args) {
			Assignment24Program6 assignment24program6= new Assignment24Program6();
			String input="Aashvi Hello good Technocredits";
			assignment24program6.splitAndGetOutputString(input);
		}

	}



