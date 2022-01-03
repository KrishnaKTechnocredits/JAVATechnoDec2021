package ashok;

public class A17_Triplet {

	void findTriplet(int num[]) {
		
		for(int index = 0 ; index < num.length-2 ; index++) {
			if(num[index]+1 == num[index+1] && num[index]+2 == num[index+2] )
				System.out.println(num[index] +"  "+ (num[index]+1) +"  "+ (num[index]+2));
			}
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A17_Triplet a17_Triplet = new A17_Triplet();
		int arr[] = {10,13,14,15,16,19,20,22,23,24};
		a17_Triplet.findTriplet(arr);
		
	}

}