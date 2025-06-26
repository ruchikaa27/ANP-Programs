package anudip;
 public class palindrome{
	 public static void main(String args[]){
		 String letter="ruchika";
		 String reversed=" ";
		 
		 for(int i=letter.length()-1;i>=0;i--) {
			 reversed=reversed + letter.charAt(i);
		 }
		 if(letter.equals(reversed)) {
			 System.out.println("it is a palindrome");
		 }
		 else {
			 System.out.println("it is not a palindrome");
		 }
	 }
 }
 
 