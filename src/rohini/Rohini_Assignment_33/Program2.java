package rohini.Rohini_Assignment_33;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*5: 
Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1



Program 6: 
Find all character frequency from each name given in String array.
Input : Array -> {"raj", "aarya", "aavruti", "shruti","raj", "aarya"}*/

public class Program2 {

	public void findCharFreq(String str) {
		Map<Character,Integer> linkedhmap = new LinkedHashMap<>();
		int count=0; 
		for(int index=0;index<str.length();index++) {
			char ch =str.charAt(index);
			if(linkedhmap.containsKey(ch)) {
				count=linkedhmap.get(ch);
				linkedhmap.put(ch, count+1);
			}
			else {
				linkedhmap.put(ch, 1);
			}

		}System.out.println(linkedhmap);
	}



	public void findnameFreqfromstr(String[] input) {
		for(int i=0;i<input.length;i++){
			String[] str=input[i].split(", ");
			Map<String,Integer> treemap = new TreeMap<>();
			int count=0; 
			for(int index=0;index<str.length;index++) {
				String s=str[index];
				if(treemap.containsKey(s)) {
					count=treemap.get(s);
					treemap.put(s, count+1);
				}
				else {
					treemap.put(s, 1);
				}
			}
			System.out.print(treemap);		


		}
	}


	public static void main(String[] args) {
		Program2 prg2=new Program2();
		prg2.findCharFreq("RohiniMali");
		String[] arr= {"raj", "aarya", "aavruti", "shruti","raj", "aarya"};
		prg2.findnameFreqfromstr(arr);

	}

}
