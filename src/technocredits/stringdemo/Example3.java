package technocredits.stringdemo;

public class Example3 {

	String processData(String name) {
		String reverseName = "";
		
		for(int index=name.length()-1;index>=0;index--) {
			reverseName = reverseName + name.charAt(index);
		}
		reverseName = Character.toUpperCase(reverseName.charAt(0)) + reverseName.substring(1);
		return reverseName;
	}
	
	String[] processInput(String[] arr) {
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index] = processData(arr[index]);
		}
		return output;	
	}
	
	String generateStringOutput(String[] arr) {
		String output = "";
		for(int index=0;index<arr.length;index++) {
			output = output + processData(arr[index]) + " ";
		}
		return output.trim();	
	}
	
	//String[] arr = {"AnJAli", "sAWatI", "ARchnA", "ABHisheK"};
   //"AJA AWI ARA ABHK"
}
