package swati;
class assign3 {
	
	void simpleInterest(int p,int t,double r){
		double interest= p*t*r/100;
		System.out.println(interest);
	}
	void convertTemp(int temp) {
		double cels=(double)((temp-32)*5)/9;
		System.out.println(cels);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign3 m=new assign3();
		m.simpleInterest(15750,10,3.7);
		m.convertTemp(52);
		
	}

}