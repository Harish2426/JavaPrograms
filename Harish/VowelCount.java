package Harish;

public class VowelCount {
 String str= "Beautiful";
 int count =0;
 VowelCount(){
	 for(int i =0;i<str.length();i++)
	 {
		 if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
				 str.charAt(i)=='o'||str.charAt(i)=='u')
            {
					 count++;
				 }}
	 }
	 void show() {
		          System.out.println("Number of vowels = "+count);
	             }
	 public static void main (String[] args) {
		 VowelCount vc= new VowelCount();
		 vc.show();
	 }
	 }