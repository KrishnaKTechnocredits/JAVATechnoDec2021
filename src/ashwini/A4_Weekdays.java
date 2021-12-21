package ashwini;
public class A4_Weekdays 
{
	void identifyDay(int dayIndex)
	{
		if(dayIndex > 0 && dayIndex < 6)
			System.out.println("Weekday");
		else if(dayIndex == 6 || dayIndex == 7)
			System.out.println("WeekEnd");
		else
			System.out.println("Invalid Index");
	}
	
	public static void main(String[] a){
		A4_Weekdays weekdays = new A4_Weekdays();
		weekdays.identifyDay(-28);
	}
}
