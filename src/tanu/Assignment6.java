package tanu;

class Assignment6{

	  void stringPrintChar(String name){
	   for(int start=0; start<name.length(); start++){
	   System.out.println(name.charAt(start));
	   }
	  }
	  void stringPrintReverse(String name){
		int endofstring = name.length()-1;
	   for(int end = endofstring; end>=0; end--){ 
	   System.out.println(name.charAt(end));
	   }
	  }
	void stringCharCount(String name, char repeat){ 
	  int count=0;
	   for(int start=0; start<name.length(); start++){
		if(name.charAt(start)== repeat)
	     count = count + 1;
	   }
	    System.out.println(count);
	  }
	  
	 public static void main(String[] arg){
	   Assignment6 assignment = new Assignment6();
	   assignment.stringPrintChar("Technocredits");
	   assignment.stringPrintReverse("Java");
	   assignment.stringCharCount("Selenium",'e');
	 }
	}