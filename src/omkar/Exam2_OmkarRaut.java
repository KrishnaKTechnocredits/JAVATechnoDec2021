
package omkar;

public class Exam2_OmkarRaut {
	
	void display(){
		int a[]={5,1,2,7,6,3,4,9} ;
		int sum=6;
		for (int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if((a[i]+a[j])==sum) {
					System.out.println(a[i]+"  " + a[j]);
				}
			}
		}		
	}
	
	void occurrence() {		
		int a[]={5,8,1,2,4,3,2,1};
		for (int i =0; i<a.length; i++) {
			int cnt=0;
			for(int j=0; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					
					cnt++;
				}	
				
			}
			if (cnt==1) {
				
				System.out.print(a[i]+" ");
			}	
			
		}
	}

	public static void main(String[] args) {
		Exam2_OmkarRaut exam2_OmkarRaut = new Exam2_OmkarRaut();
		exam2_OmkarRaut.display();
		exam2_OmkarRaut.occurrence();
	

	}

}

