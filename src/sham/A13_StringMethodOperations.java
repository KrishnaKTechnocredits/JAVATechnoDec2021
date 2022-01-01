package sham;

public class A13_StringMethodOperations {
	
	void findFirstUniqueChar(String name)
	{
		
				String temp="";
		for( int i= 0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.println(" First unique character: "+ch);
				break;
			}
		}
		
	}
	
	void findFirstDuplicateChar(String name)
	{			
		for( int i= 0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			if(name.indexOf(ch)!=name.lastIndexOf(ch))
			{
				System.out.println(" First duplicate character: "+ch);
				break;
			}
		}
		
	}
	
	
	void findAllUniqueChar(String name)
	{
		System.out.println(" unique character: ");
		
				String temp="";
		for( int i= 0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			
			
			if(name.indexOf(ch)==name.lastIndexOf(ch))
			{
				System.out.print(ch+" ");
				
			}
		
		}
		
		
	}
	
	void findAllDuplicateChar(String name)
	{	System.out.println(" duplicate characters: ");
		String temp= "";
		for( int i= 0;i<name.length();i++)
		{
			char ch= name.charAt(i);
			String s=ch+"";
			if(temp.contains(s)) {
				
			}
			else {
				if(name.indexOf(ch)!=name.lastIndexOf(ch))
				{
					System.out.print(ch+" ");
				
				}
			}
			temp=temp+ch;
		}
		
	}
		
	public static void main(String[] args) {
		A13_StringMethodOperations stringOpertions= new A13_StringMethodOperations();
		//stringOpertions.displayDuplicateCharacters("technocredits", 'e');
		
		stringOpertions.findFirstUniqueChar("technocredits");
		stringOpertions.findFirstDuplicateChar("technocredits");
		stringOpertions.findAllUniqueChar("technocredits");
		stringOpertions.findAllDuplicateChar("technocredits");
	}

}
