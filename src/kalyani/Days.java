package kalyani;

class Days {
	
	void validateDay(int index){
		if (index >=1 && index <=5) 
			System.out.println("weekday");
		else if(index >= 6 && index<=7)
			System.out.println("weekend");
		else 
			System.out.println("Invalid index"); 
	}	
	public static void main(String b[]){	
		Days days = new Days();
			days.validateDay(3);
			days.validateDay(6);
			days.validateDay(11);
			days.validateDay(-3);
	}	
}		