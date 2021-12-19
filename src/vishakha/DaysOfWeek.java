package vishakha;


class DaysOfWeek{

	void dayDetermination(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5)
			System.out.println("It is a weekday : " + "Day" + dayIndex);
		else if(dayIndex > 5 && dayIndex <= 7)
			System.out.println("It is a Weekend : " + "Day" + dayIndex);
		else
			System.out.println("Invalid Index : " + "Day" + dayIndex);
	}
	
	public static void main(String[] args){
		DaysOfWeek daysofWeek = new DaysOfWeek();
		daysofWeek.dayDetermination(1);
		daysofWeek.dayDetermination(3);
		daysofWeek.dayDetermination(5);
		daysofWeek.dayDetermination(7);
		daysofWeek.dayDetermination(15);
		daysofWeek.dayDetermination(-8);
	}
}