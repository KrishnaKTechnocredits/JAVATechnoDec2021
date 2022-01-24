package nasir;

public class Trees{
	int findtrees(int[] input) {
		int max=0;
		int count=0;
		for(int index=0; index<input.length;index++) {
			if(max<input[index]) {
			max=input[index];
			count++;	
		}}
		return count;
	}
	public static void main(String[] args) {
		Trees tress = new Trees();
		int[] arr = {20,15,30,40,60,45,70,60,55,75,80};
		int ans=tress.findtrees(arr);
		System.out.println("Total Trees can be seen - "+ans);
	}
}