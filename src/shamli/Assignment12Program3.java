package shamli;
import java.util.Scanner;

public class Assignment12Program3 {
	
	int findCountOfChar(String name,char ch)
	{
		int count=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)==ch)
			{
				count++;
			}
		}
		return count;
	}
	
	void findFirstNonRecuringCharFromString(String input)
	{
		for(int index=0;index<input.length();index++)
		{
			int count=findCountOfChar(input,input.charAt(index));
			if(count==1)
			{
				System.out.println("First Non recuring character from given string is : "+ input.charAt(index));
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		Assignment12Program3 program3 = new Assignment12Program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter input String : ");
		String input = scanner.next();
		program3.findFirstNonRecuringCharFromString(input);
		

	}

}
