package sham;

public class A24_ReverseTheCaseOfEachLeter {

	void reverseTheCaseOfEachChar(String name)
	{
		for(int i=0;i<name.length();i++)
		{
			String updatedCase="";
			char ch=name.charAt(i);
			
			if(Character.isUpperCase(ch))
			{
				ch=Character.toLowerCase(ch);
			}
			else
			{
				ch=Character.toUpperCase(ch);
			}
			updatedCase+=ch;
			System.out.print(updatedCase);
		}
		
	}
	public static void main(String[] args) {
		
		A24_ReverseTheCaseOfEachLeter revCase= new A24_ReverseTheCaseOfEachLeter();
		revCase.reverseTheCaseOfEachChar("TeCHnoCReditS");
		
	}

}
