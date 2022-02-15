package rohini;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Rohini_Test5 {

	public TreeMap<Integer, Integer> findPairOfSocks(int[] number) {
		TreeMap<Integer,Integer> treemap=new TreeMap<Integer,Integer>();

		int count=0;
		for(int index=0;index<number.length;index++) {
			if(treemap.containsKey(number[index])) {
				count=treemap.get(number[index]);
				treemap.put(number[index], count+1);
				count++;

			}
			else treemap.put(number[index], 1);

		}return findcoutofsocks(treemap);
	}



	public TreeMap<Integer, Integer> findcoutofsocks(TreeMap<Integer, Integer> treemap) {
		Set<Entry<Integer, Integer>> entries= treemap.entrySet();

		int value=0;
		for(Entry<Integer, Integer> entry:entries) {
			value+=entry.getValue()/2;
		}
		System.out.println("Pairs of socks are : "+value);




		return treemap;
	}

	public static void main(String[] args) {

		Rohini_Test5 prg3 = new Rohini_Test5();
		int arr[] = {9,10,20,20,10,10,30,50,10,20};
		int arr1[] = {100,200,300,100,400,400,500,600};
		prg3.findPairOfSocks(arr);
		prg3.findPairOfSocks(arr1);


	}

}
