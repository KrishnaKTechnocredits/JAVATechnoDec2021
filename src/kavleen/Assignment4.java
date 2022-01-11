package kavleen;

class DayIndex{

   void dayCheck(int index){
     
	 if (index<=4 && index>=1){
	   System.out.println("It is a Weekday");
	}
     else if (index==6 || index ==7){
	   System.out.println ("It is a Weekend");
	}
	 else{
	   System.out.println("Invalid Index");
	}
}
    public static void main (String[] args){
	   DayIndex  dayindex = new DayIndex();
	   dayindex.dayCheck(1);
	   dayindex.dayCheck(7);
	   dayindex.dayCheck(4);
	
	}
}