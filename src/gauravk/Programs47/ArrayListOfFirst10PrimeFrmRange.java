package gauravk.Programs47;
import java.util.ArrayList;

/*
 * 37. Return ArrayList of first 10 prime numbers in the range [100,500].

 */
public class ArrayListOfFirst10PrimeFrmRange {
	
	ArrayList<Integer> first10PrimeFrmRange(int startNum, int endNum){
		ArrayList<Integer> arl = new ArrayList<>();
		for(int i=100; i<=500; i++) {
			int counter=0;
			for(int j=i; j>=1; j--) {
				if(i%j==0) {
					counter++;
				}
			}
			if(counter==2) {
				if(arl.size()<10) {
					arl.add(i);
				}else break;
			}
		}
		return arl;
	}
	
	public static void main(String[] args) {
		ArrayListOfFirst10PrimeFrmRange tenPrime = new ArrayListOfFirst10PrimeFrmRange();
		System.out.println("Returning ArrayList of first 10 prime numbers in the range [100,500].\n"+tenPrime.first10PrimeFrmRange(100, 500));
	}
}
