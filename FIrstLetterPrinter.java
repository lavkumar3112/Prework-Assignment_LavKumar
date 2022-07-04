import java.util.Scanner;
class FirstLetterPrinter {
	public static void main (String[] args) {
 Scanner in = new Scanner(System.in);
 String input = in.nextLine();
System.out.println(firstLetterPrinter(input));
}

static String firstLetterPrinter(String str) {
 // write your code here
	 String result="";
	for(int i=0;i<str.length();i++){
		
		if(str.charAt(i)!=' ' && (i==0 || str.charAt(i-1)==' ')){
			result+=(str.charAt(i));

	}


 }
 return result;
}
}