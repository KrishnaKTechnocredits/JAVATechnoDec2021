package saurav;

public class A33_AsciiValuePrograms {
	
	int getAsciiOfChar(char ch)
	{
		int x = ch;
		System.out.println(x);
		return ch;
	}
	
	static	void getAsciiOfAtoZ()
		{
		for(char ch = 'A'; ch<='Z'; ch++) {
			System.out.println(ch+"--"+(int)ch);
		}
	}
 
      char getAsciiOfChar(int asciiValue) 
      {
    	  char ch = (char)asciiValue;
    	  System.out.println(asciiValue+"-"+ch);
		return 1;	
    }
	
      void getAsciiOf97to122()
      {
    	  for(char index = 97; index<=122; index++) {
    		  System.out.println(index);
    	  }
      }
      
	public static void main(String[] args) {
		new A33_AsciiValuePrograms().getAsciiOfChar('=');
		new A33_AsciiValuePrograms().getAsciiOfChar('e');
		new A33_AsciiValuePrograms().getAsciiOfChar('A');
		new A33_AsciiValuePrograms().getAsciiOfChar('{');
		System.out.println("#############");
		getAsciiOfAtoZ();
		System.out.println("#############");
		A33_AsciiValuePrograms assignment33 = new A33_AsciiValuePrograms();
		assignment33.getAsciiOfChar(100);
		assignment33.getAsciiOfChar(101);
		System.out.println("#############");
		assignment33.getAsciiOf97to122();
	}
}
