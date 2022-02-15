package gauravk.ProgramTests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Programming Test - 5 : 9th Feb'2022 

Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are. Return the total number of matching pairs of socks that a person can have

Example:

Input :  9 10 20 20 10 10 30 50 10 20

Output : 3

Input : 100 200 300 100 400 400 500 600

Output : 2

Hint : Use HashMap
 */
public class PairOfSocksWithMatchingColours {
	
	HashMap<Integer, Integer> pairOfSocks(int[] sockSet){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(Integer i : sockSet) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}else {
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		return hm;
	}
	
	void pairing(int[] socks) {
		HashMap<Integer, Integer> sortedSetOfSocks = pairOfSocks(socks);
		int totalCounter=0;
		for(Map.Entry<Integer, Integer> entry : sortedSetOfSocks.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" --> "+(int)(entry.getValue()/2)+" pair");
				totalCounter += (int)(entry.getValue()/2);
			}
		}
		System.out.println("Total pairs: "+totalCounter);
	}
	
	public static void main(String[] args) {
		int[] socks1 = {9,10,20,20,10,10,30,50,10,20};
		int[] socks2 = {100,200,300,100,400,400,500,600};
		PairOfSocksWithMatchingColours ps = new PairOfSocksWithMatchingColours();
		System.out.println("Socks box 1: "+Arrays.toString(socks1));
		ps.pairing(socks1);
		System.out.println("===================");
		System.out.println("Socks box 2: "+Arrays.toString(socks2));
		ps.pairing(socks2);
		
	}
}
