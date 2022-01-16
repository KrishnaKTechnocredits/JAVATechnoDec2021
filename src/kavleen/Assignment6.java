package kavleen;

class Assignment6{
	void display(String input){
		
		 for (int index=0;index<input.length();index++)
		 {
		   System.out.println(input.charAt (index));
	}
	}
	
	void displayRev(String input){
		
		for(int index=input.length()-1 ; index>=0 ; index--){
			
			System.out.println(input.charAt(index));
	}
	}
	void occurence(String input , char ch){
		int count = 0;
	 for (int index = 0 ;index < input.length();index++){
		 if(input.charAt(index)== ch)
			 count++;
	 }
	 
	}
	public static void main(String[] args){
		Assignment6 assignment6 = new Assignment6();
		assignment6.display("techno");
		assignment6.displayRev("techno");
		assignment6.occurence("akansha",'a');
	}
	
}