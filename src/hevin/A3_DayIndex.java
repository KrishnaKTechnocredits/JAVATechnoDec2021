package hevin;

class A3_DayIndex{
	
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
		A3_DayIndex dayindex = new A3_DayIndex();
		dayindex.displayWeekdays(2);
		dayindex.displayWeekdays(6);
		dayindex.displayWeekdays(8);
		dayindex.displayWeekdays(-3);
	}
}