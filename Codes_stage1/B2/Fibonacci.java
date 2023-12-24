package B2;
/*
 0   1   1   2  3   5   8   13    21    33    54
 a   b  c=a+b
     a   b  c=a+b
         a   b  c=a+b  
           .....
 */
public class Fibonacci {
	public static void main(String[] args) {
     int a,b,c,n=18,k;
		a=0;b=1; 
	 System.out.print("First "+n+" fibonacci num : "+a+" "+b);
	 for( k=2;	k<=n; k++)	 {
		 c=a+b; System.out.print(" "+c);
		 a =b; b=c;
	 }
		a=0;b=1; n=1000;
	 System.out.print("\nFibonacci num less than "+n+" : "+a+" "+b);
	 for(c=a+b; c<=n; c=a+b )	 {
		  System.out.print(" "+c);
		 a =b; b=c;
	 }
	 n=3000;  int m=10000; a=0;b=1;
	 System.out.print("\nFibonacci num between "+n+" and "+m+" : ");	 
	 for(; ; )	 {
		  c=a+b;
		  if(c>m) break;
		  if (c>=n) System.out.print(" "+c);
		  a =b; b=c;
	 }


	 
	}

}
