package swapnali;

class StringOprations{
		
		void printString(String str){
			for(int index=0;index<str.length();index++)
				System.out.println(str.charAt(index));
		}
		
		void printReverseString(String str){
			for(int index=str.length()-1;index>=0;index--)
				System.out.println(str.charAt(index));
				
		}
		
		void printCharOcc(String str,char occ)
		{
			int count=0;
			for(int index=0;index<str.length();index++)
				if(str.charAt(index)==occ)
				count++;
				System.out.println(count);	
		}
		
		public static void main(String[] args){
		StringOprations ops=new StringOprations();
		ops.printString("techno");
		ops.printReverseString("techno");
		ops.printCharOcc("Swapnali",'a');
	}

}