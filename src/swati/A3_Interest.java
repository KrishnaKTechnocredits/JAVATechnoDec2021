package swati;
class A3_Interest {
	
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
		A3_Interest m=new A3_Interest();
		m.simpleInterest(15750,10,3.7);
		m.convertTemp(52);
		
	}

}