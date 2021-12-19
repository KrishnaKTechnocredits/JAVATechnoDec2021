package karan;

public class Assignment_4 {
	/*Assignment - 4 : 16th Dec2021

	Program 1: Find weekdays or weekend based on dayIndex.
	1 -> Monday
	2 -> Tuesday
	7 -> Sunday

	dayIndex -> 3 : Weekday
	dayIndex -> 6 : WeekEnd
	dayIndex -> 11 : Invalid Index
	dayIndex -> -3 : Invalid Index

	*/		
		void days(int day){
			if(day>=1&&day<=5){
				System.out.println(day +"->It's weekday");
			}
			else if(day==6||day==7){
				System.out.println(day +"->It's weekend");
			}
			else{
				System.out.println(day +"->Invaild Data");
			}	
		}
		
		public static void main(String[] args){
			Assignment_4 assginment4 = new Assignment_4();
			assginment4.days(2);
			assginment4.days(7);
			assginment4.days(-3);
			assginment4.days(11);
		}
}
