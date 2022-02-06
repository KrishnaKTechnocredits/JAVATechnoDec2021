/*Find all character frequency from given name.
Input: name - aakanksha
Output :
a -> 4
k -> 2
n -> 1
s -> 1
h -> 1 */
package anjali.Assignment33;

import java.util.LinkedHashMap;
import java.util.Map;

public class A33_Program5_FindFreqofleltterUsinglLinkHashMAp {
	
	static void FindFreqofleltter(String name) 
	{
		Map<Character,Integer> map= new LinkedHashMap<> ();
		for(int index=0;index<name.length();index++) 
		{
			char ch=name.charAt(index);
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(name.charAt(index), 1);
		
		}System.out.println(map);
	}

	public static void main(String[] args) {
		FindFreqofleltter("aakanksha");
	}

}


