package swati;
public class A2_Calculator {
int ans;

void add(int a,int b) {
	ans=a+b;
	System.out.println(ans);
}
void sub(int a,int b) {
	ans=a-b;
	System.out.println(ans);
}
void multiply(int a,int b) {
	ans=a*b;
	System.out.println(ans);
}
void div(int a,int b) {
	ans=a/b;
	System.out.println(ans);
}



	public static void main(String[] args) {
		
		A2_Calculator cal=new A2_Calculator();
		cal.add(10, 20);
		cal.sub(50,30);
		cal.multiply(5,10);
		cal.div(100,10);
		
	}

}
