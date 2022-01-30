package tanu;
class Assignment29{
	int sum;
	void  totalSumPresentInString(String sentence) {
		String[] sentarry = sentence.split(" ");
		for(int index=0; index<sentarry.length; index++) {
			try {
				sum= sum+ Integer.parseInt(sentarry[index]);
			}
		 catch(NumberFormatException n){
			 
		}
	
		}
		
		System.out.println("Sum = " + sum);
	}
	
	public static void main(String [] arg) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.totalSumPresentInString("I have 15 years and 3 months of automation experience");
	}
}