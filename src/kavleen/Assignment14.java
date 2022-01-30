package kavleen;

public class Assignment14 {
	int count;
	int count1;
	void uniqueChar(String name){
		for(int index= 0 ; index<name.length();index++){
		  char ch = name.charAt(index);
		  if(index==name.indexOf(ch)){
		     if(name.indexOf(ch)== name.lastIndexOf(ch)){
			  count++;
		  }
		}	
	   }
            System.out.println("Unique character count is " + count);	   
     }
    void duplicate(String name){
		for(int index= 0 ; index<name.length();index++){
		  char ch = name.charAt(index);
		  if(index==name.indexOf(ch)){
		     if(name.indexOf(ch)!= name.lastIndexOf(ch)){
			  count1++;
		  }
		}
	   }	
	      System.out.println("duplicate character count is " + count1);	   
     }
	 void display(){
		 if(count1>count){
			 System.out.println("Java");
		 }
		 else{
			 System.out.println("Selenium");
	 }
	}
    public static void main (String [] args){
		Assignment14 assignment14 = new Assignment14();
		assignment14.uniqueChar("abcdabc");
		assignment14.duplicate("abcdabc");
		assignment14.display();
		System.out.println("Hopeyou got what you were looking for!");
		
	}
}
