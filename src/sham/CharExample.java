package sham;
class CharExample
{
	void compareString(String str1,String str2)
	{
		if(str1.equals(str2))
			System.out.println("Both the Strings are same");
		else
			System.out.println("Both the Strings are not identical");
	}
	
	void usingEqualtoOperator(String str1,String str2)
	{
		//System.out.println( "using equal too operator "str1==str2);
		if(str1==str2)
		{
			System.out.println("Both the String are refering same memory loaction hence : True");
		}
		else{
			System.out.println(" Both Strings at Differt memory Location : false");
		}
	}
	void dispalyChar(String name)
	{
	//String name= "Technocredits";
	int len= name.length();
	int count=0;
	for(int i=len-1;i>0;i--)
	{	System.out.print(name.charAt(i) + " ");
		if(name.charAt(i)=='c')
		{
			count++;
		}
	}
	System.out.println();
	System.out.println("Number occurance of C: " +count);
	}

	public static void main(String args[])
	{
		CharExample ce= new CharExample();
		ce.dispalyChar("Technocredits");
		ce.compareString("This is December","This is NOvember");
		ce.usingEqualtoOperator("Welcome","Welcome");
		
	}
}