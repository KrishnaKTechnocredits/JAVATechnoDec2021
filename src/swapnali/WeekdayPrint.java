package swapnali;

class WeekdayPrint{

	void printday(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("Weekday");
		else if(dayIndex>=6 && dayIndex<=7)
			System.out.println("WeekEnd");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] args){
		WeekdayPrint week=new WeekdayPrint();
		week.printday(3);
		week.printday(7);
		week.printday(9);
	}
}