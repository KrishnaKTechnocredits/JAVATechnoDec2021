package ashwini;
class A7_stringpro 
{
	 
	public static void main(String[] args)
	{
		A7_stringpro s=new A7_stringpro();
		s.charAtEvenposition("Ashwini");
		System.out.println("--------");
		s.stringVowel("technocredits");
	}

	void charAtEvenposition(String s)
	{
		System.out.println("the characters at even position are:");
		for (int i = 0; i <= s.length()-1; i++)
			{
		
			if(i%2!=0)
				System.out.println(s.charAt(i));
		}
	}
	
	void stringVowel(String s1)
	{

		for(int i=0;i<=s1.length()-1;i++) 
		{
		if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			System.out.println("the String vowel are:"+ s1.charAt(i));
		}
	}
}
