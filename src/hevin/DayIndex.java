package hevin;

class DayIndex{
	
	void displayWeekdays(int indexNo){
		if(indexNo == 6 || indexNo == 7){
			System.out.println("Weekend");
		}
		else if(indexNo>=1 && indexNo<=5)
			System.out.println("Weekday");
		else
			System.out.println("Invalid Index Number");
	}
	
	public static void main(String[] a){
		DayIndex dayindex = new DayIndex();
		dayindex.displayWeekdays(2);
		dayindex.displayWeekdays(6);
		dayindex.displayWeekdays(8);
		dayindex.displayWeekdays(-3);
	}
}