package sham;
class A4_WeekendIndex{

	void findWeekdays(int dayNo){
		if(dayNo>=1&&dayNo<=5){
			System.out.println("Weekdays");
		}
		else if(dayNo==6 || dayNo==7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid Entry ");
	}
	public static void main(String args[]){
		A4_WeekendIndex wi= new A4_WeekendIndex();
		wi.findWeekdays(2);
		wi.findWeekdays(6);
		wi.findWeekdays(12);
		wi.findWeekdays(-2);
		
	}
}
   