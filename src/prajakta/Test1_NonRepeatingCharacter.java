package prajakta;

public class Test1_NonRepeatingCharacter{
	 
	int stringOccurance(String input, char ch) {
		      int count = 0;
		      for(int index =0; index<input.length(); index++) {
		    	     if(input.charAt(index) == ch)
		    	    	    count++;
		      }
		          return count;
	}
	
	void firstSingleOccurance(String input) {
		     char c = ' ';
		     for (int index = 0; index< input.length(); index++) {
		    	      char ch = input.charAt(index);
		    	      int count = stringOccurance(input,ch);
		    	      if(count == 1) {
		    	    	     c = ch;
		    	    	     break;
		    	      }
		     }
		      System.out.println("first character having single occurance in given string is:" +c);
	}
	
	public static void main(String[] a) {
		Test1_NonRepeatingCharacter test1_nonrepeatingcharacter = new Test1_NonRepeatingCharacter();
		test1_nonrepeatingcharacter.firstSingleOccurance("technocreadits");
	}
	
}
