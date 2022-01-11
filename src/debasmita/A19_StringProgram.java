package debasmita;

public class A19_StringProgram {
	
	 int uppercasecnt=0,lowercasecnt=0,totalcnt=0,digitcnt=0;
	  
	 int stringCount(String input){
		 for(int index=0;index<input.length();index++) {
			 char ch=input.charAt(index);
			 if(Character.isLetter(ch)) {
				 if(Character.isLowerCase(ch)) 
					 lowercasecnt++;
				 if(Character.isUpperCase(ch))
					 uppercasecnt++;
			 }
			 else if(Character.isDigit(ch)) {
				     digitcnt++;
			 }
			 else
				 System.out.println("Special Characters");
	     }
		       System.out.println("Total number of lowercase letters: " +lowercasecnt);
		       System.out.println("Total number of  uppercase letters: " +uppercasecnt);
		       System.out.println("Total number of digits: "+digitcnt);
		       return uppercasecnt+lowercasecnt;
	  }
	  public static void main(String[] args) {
		  A19_StringProgram program=new A19_StringProgram();
		  int var=program.stringCount("TE1ch2noC2red9iTs");
          System.out.println(var);
	}

}
