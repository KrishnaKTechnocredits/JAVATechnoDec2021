package omkar;

class Assignment3{
	
	void simpleInterest( int P , int T , float R){
		float interest = (P*T*R)/100;
		System.out.println(interest);	
	}
	
	void temperature(float temp){
		float celsius = (temp-32)*5/9 ;
		System.out.println(celsius);
	}
	public static void main(String[] args ){
		Assignment3 assignment3 = new Assignment3();
		assignment3.simpleInterest(200,3,4.5f);
		assignment3.temperature(40);
	}
}