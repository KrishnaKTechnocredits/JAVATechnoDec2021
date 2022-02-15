package prajakta;
import java.util.HashMap;

public class Test5_Collection {
	int findPairOfSocks(int[] number) {
		HashMap<Integer,Integer> map =new HashMap<>();
		for(int index=0;index<number.length;index++) {
			int output = number[index];
			if(map.containsKey(output)) {
				int cnt =map.get(output);
				map.put(output,cnt+1);
			}
			else
				map.put(output,1);
		}
		int count=0;
		for(int value:map.values()) {
			count=count+(value/2);
		}
		System.out.println(map);
		return count;
		}

	public static void main(String[] args) {
		Test5_Collection test5 = new Test5_Collection();
		int[] input = {9,10,20,20,10,10,30,50,10,20};
		System.out.println("Total pair "+test5.findPairOfSocks(input));

	}

}