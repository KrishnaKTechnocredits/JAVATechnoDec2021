package poojaRajguru;

class WeekIndex{
	void dayCheck(int index){
		if(index<=5 && index>=1){
			System.out.println("Today is Weekday");
		}
		else if(index==6 || index==7){
			System.out.println("Today is Weekend");		
		}
		else
			System.out.println("Invalid index!!");
	}
	
	public static void main(String[] args){
		WeekIndex weekindex = new WeekIndex();
		weekindex.dayCheck(2);
		weekindex.dayCheck(7);
		weekindex.dayCheck(11);
		weekindex.dayCheck(-3);
	}
}