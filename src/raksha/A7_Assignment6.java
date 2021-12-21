package raksha;

class A7_Assignment6{
	
	void display(String input)
	{
		System.out.println("characters of given input " +input+ " are:");
		for(int i = 0;i<input.length();i++){
		System.out.println(input.charAt(i));
		}
		
	}
	
	void reverse(String input)
	{
		System.out.println("characters of given input " +input+ " in reverse order:");
		for(int i=input.length()-1;i>=0;i--){
		System.out.println(input.charAt(i));
		}
	}
	
	void findCharFreq(String input,char ch)
	{
		System.out.println("occurance of " +ch+ " in " +input+ ":");
		int count =0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == ch)
				count++;
		}
		System.out.println(ch + "-" +count);
	}
	
	public static void main(String[]args)
	{
		A7_Assignment6 assignment6 = new A7_Assignment6();
		assignment6.display("techno");
		assignment6.reverse("techno");
		assignment6.findCharFreq("rakshawani" ,'a');
	}
}