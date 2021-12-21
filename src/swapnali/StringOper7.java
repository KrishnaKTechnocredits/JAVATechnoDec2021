package swapnali;

class StringOper7{
		
	void printeven(String str){
			for(int index=0;index<str.length();index++)
				if(index%2==0)
				{
					System.out.println(str.charAt(index));
				}
		}
		
		void printvowels(String str){
			
			for(int index=0;index<str.length();index++) {
				
				char vowels[]={'a','e','i','o','u'};
				for(int count=0;count<vowels.length;count++)
				{
					if(str.charAt(index)==vowels[count])
					{
						System.out.println(vowels[count]);
					}
				}
			}		
		}
		
		public static void main(String[] args){
			StringOper7 ops=new StringOper7();
			ops.printeven("technocredits");
			System.out.println("\n");
			ops.printvowels("technocredits");
	}

}