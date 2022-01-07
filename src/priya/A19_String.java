package priya;

public class A19_String {
	
	int uppercasecnt,lowercasecnt,totalcnt,digitcnt;
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
				
		     }
			       System.out.println("LOWERCASE LETTER COUNT IN THE GIVEN STRING IS : " +lowercasecnt);
			       System.out.println("LOWERCASE LETTER COUNT IN THE GIVEN STRING IS : " +uppercasecnt);
			       System.out.println("DIGIT COUNT IN THE GIVEN STRING IS : "+digitcnt);
			       return uppercasecnt+lowercasecnt;
		  }
		  public static void main(String[] args) {
			  A19_String str=new A19_String();
			  int var=str.stringCount("TE1ch2noC2red9iTs");
	          System.out.println(var);
		  }

	}

