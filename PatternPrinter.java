import java.util.Scanner;
class PatternPrinter {
 public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 int n = in .nextInt();
 patternPrinter(n);
 }
 static void patternPrinter(int n) {
 // write your code here
 	int in=n;
 	while(n>0){
 		for(int j=in;j>0;j--)
 			for(int i=1;i<=n;i++)
 			{
				System.out.print(j+" ");
			}
 		System.out.println();
 		n--;
 	}
 }
}
