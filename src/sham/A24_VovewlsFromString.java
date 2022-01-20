package sham;

public class A24_VovewlsFromString {

	void findVowelsfromName(String name)
	{
		//String  name="ganesh";
		String vowels="";
		for(int i= 0;i<name.length();i++)
		{
			
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				//System.out.println();
				vowels=vowels+name.charAt(i)+" ";
			}
		}
		System.out.println("vowels From "+name+" : "+vowels);
		
	}
	void findVowelsfromString(String words)
	{
		
		
		String[] names=words.split(" ");
		for(int i=0;i<names.length;i++)
		{
			findVowelsfromName(names[i]);
		}
				
	}
	public static void main(String[] args) {
		
		A24_VovewlsFromString vowels= new  A24_VovewlsFromString();
		String words= "aashvi technocredits";
		vowels.findVowelsfromString(words);
	}

}
