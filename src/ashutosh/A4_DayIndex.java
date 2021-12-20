package ashutosh;

class DayIndex{
	void findDay(int day){
		if(day>=1 && day<=7){
			if(day>=1 && day<=5)
			System.out.println("Weekday");
			else
			System.out.println("Weekend");
		}	
		else
			System.out.println("Invalid entry");
	}

	public static void main (String [] args){
	DayIndex dayindex = new DayIndex();
	dayindex.findDay(1);
	dayindex.findDay(-1);	
	dayindex.findDay(5);	
	dayindex.findDay(7);		
	}
}