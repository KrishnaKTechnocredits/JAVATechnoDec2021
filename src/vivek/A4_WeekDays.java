package vivek;

class A4_WeekDays{

	void displayWeekDays(int day){
		if(day >= 1 && day <=5)
			System.out.println("weekdays");
		else if(day == 6 || day == 7)
			System.out.println("weekend");
		else
			System.out.println("Invalid Index");
	}
	public static void main(String[] args){
		A4_WeekDays weekdays = new A4_WeekDays();
		weekdays.displayWeekDays(7);
		weekdays.displayWeekDays(1);
		weekdays.displayWeekDays(2);
		weekdays.displayWeekDays(3);
		weekdays.displayWeekDays(6);
		weekdays.displayWeekDays(11);
		weekdays.displayWeekDays(-3);
	}
}