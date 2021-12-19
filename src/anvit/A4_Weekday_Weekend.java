package anvit;

class A4_Weekday_Weekend{
	
	void dayIndex(int i){
		if(i<=5 && i>0){
			System.out.println("weekday");
			
		}else if(i>5 && i<=7){
			System.out.println("weekend");
			
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		A4_Weekday_Weekend assignment4 = new A4_Weekday_Weekend();
		assignment4.dayIndex(3);
		assignment4.dayIndex(6);
		assignment4.dayIndex(11);
		assignment4.dayIndex(-3);
	}
}