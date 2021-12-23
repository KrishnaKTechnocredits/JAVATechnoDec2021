package tanu;
class Assignment4{
  
   void processData(int day){
   if(day>=1 && day<=7){
		if(day>=1 && day<=5)
			System.out.println("weekday");
		else
         System.out.println("weekend");
	 }
   else {
         System.out.println("Invalid day");
    }
  }
   
   public static void main(String[] arg){
	Assignment4 dayindex =new Assignment4();  
    dayindex.processData(7);	
   }
}