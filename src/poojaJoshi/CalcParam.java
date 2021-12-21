package poojaJoshi;

class CalcParam{

	void add(int num1, int num2){
		int ans= num1+num2;
		System.out.println(ans);
		}
		
	void sub(int num1, int num2){
		int ans= num1-num2;
		System.out.println(ans);
		}
		
	void div(int num1, int num2){
		int ans= num1*num2;
		System.out.println(ans);
		}
	

	void multi(int num1, int num2){
		int ans= num1/num2;
		System.out.println(ans);
		}
		
	public static void main (String[] args){
		CalcParam calcParam = new CalcParam();
		calcParam.add(10,20);
		calcParam.sub(20,15);
		calcParam.div(30,4);
		calcParam.multi(70,6);
		}
}
