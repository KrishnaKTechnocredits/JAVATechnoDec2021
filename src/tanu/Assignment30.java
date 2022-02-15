package tanu;
import java.util.Arrays;
//import java.util.*;
class Assignment30{
	
void shiftAllZeroAtEndt(int[] inputarr)	{
	int [] outArray = new int[inputarr.length];
    int position=0;
	for(int inputarrindex=0; inputarrindex<inputarr.length; inputarrindex++) { //1=//1
		if(inputarr[inputarrindex]!=0) {  //
			outArray[position]=inputarr[inputarrindex];// 
			
			position++;
		}
		
	}
	System.out.println(Arrays.toString(outArray));
	
	
}
void shiftUniqueElement(int[] inputarr) {
	int [] outArray = new int[inputarr.length];
    int position = 0;
	for(int inputarrindex=0; inputarrindex<inputarr.length; inputarrindex++) { //1
		boolean IsNotunique = false ;
		for(int outArrayindex = inputarrindex+1; outArrayindex<outArray.length; outArrayindex++) {//9
			if(inputarr[outArrayindex]==inputarr[inputarrindex]) {//
				IsNotunique = true;//
		}
		}
		if(IsNotunique == false)
		{
			outArray[position] = inputarr[inputarrindex];
			position++; 
		}
	}
	
	int[] finalarray = new int[position];
	
	for(int index = 0; index<position;index++)
	{
		finalarray[index] = outArray[index];//
	}
	System.out.println(Arrays.toString(finalarray));
}
	
public static void main(String[] arg){
	Assignment30 assignment = new Assignment30();
    int[] input = {0,1,0,2,0,3,4};
	assignment.shiftAllZeroAtEndt(input);
	int[] input1 = {0,1,0,2,0,3,4,4};
	assignment.shiftUniqueElement(input1);


	}
	
}