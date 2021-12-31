package yogiraj;

public class IndexOfAssignment 
{
		public void printNonRepeatingCharacters(String str)
		{
				for (int i =0; i<str.length(); i++)
				{
					
					if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
					{
						System.out.print("\t"+str.charAt(i));
					}
				}
		}
		
		public void firstRepeatingChar(String str)
		{
			for (int i =0; i<str.length(); i++)
			{
				
				if(str.indexOf(str.charAt(i))!=str.lastIndexOf(str.charAt(i)))
				{
					System.out.println(str.charAt(i));
					
					break;
				}
			}
		}
		
		
		
		public static void main(String[] args) 
			{
				IndexOfAssignment i = new IndexOfAssignment();
				
				System.out.println("First Repeating char is : ");
				
				i.firstRepeatingChar("technocredits");
				
				System.out.println("\nNon repeating char is :");
				
				i.printNonRepeatingCharacters("technocredits");
				
			}
}
