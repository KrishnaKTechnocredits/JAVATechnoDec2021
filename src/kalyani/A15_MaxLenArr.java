package kalyani;

public class A15_MaxLenArr {

	String findLongestName(String [] names){
        String longestName = names[0];
        for(int i = 0; i < names.length; i++){
            if(names[i].length() > longestName.length()){
            longestName = names[i];
        	}
		}
		return longestName;
    }
	
	public static void main(String[] args) {
        String [] names = {"Kalyani", "Ragini", "Anita", "Abhijeet"};
		A15_MaxLenArr arr = new A15_MaxLenArr();
		String str = arr.findLongestName(names);
        System.out.println( str);
    }
}
