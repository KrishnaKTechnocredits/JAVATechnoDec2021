package tanu;
class Assignment7{

 void evenChar(String name){
 int start;
   for(start=0; start<name.length(); start++){
   if(start%2==0)
	System.out.println(name.charAt(start));
 }
}

 void vowelChar(String name){
System.out.println("-----------------------------------------------------------------------------------------------------------");
 int start;
  for(start=0; start<name.length(); start++){
  if((name.charAt(start) == 'a')||(name.charAt(start)=='e')||(name.charAt(start)=='i')||(name.charAt(start)=='o')||(name.charAt(start)=='u')){
	System.out.println(name.charAt(start));
  }
  }
 }
 public static void main(String[] arg){
  Assignment7 assignment= new Assignment7();
  assignment.evenChar("Sharvil");
  assignment.vowelChar("assignment");
 }
}

