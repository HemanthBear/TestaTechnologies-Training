package B2;

public class for_Loop4 {
 public static void main(String[] args) {
	int num=5, sum=0, fact=1;
 System.out.println("Multiples(1-10) of  num"); // 12 24 36 48 60... 120
	for(int k=1;k<=10;k=k+1 )
		System.out.print(" "+(num*k));
 System.out.println("\nMultiples(10-1) of  num");
		for(int k=10;k>=1;k--)
			System.out.print(" "+(num*k));	
 System.out.println("\nDisplay multiples of 3 from num - 1 in reverse order"); // 12 9 6 3 
		for(int k=num;k>=1;k--) {
			sum+=k; fact*=k;
			if(k%3==0) System.out.print(" "+(k));	
		}
 // sum of all numbers till num sum=1+2+3...12=...., num! = 2*3*4*....num;
 System.out.println(" sum= "+sum+" num!= "+fact);		
		
// accept 10 numbers and display their averages
// display the Unicode values from st=100 - ed=120  i=st ... ed, sysout((char)i)
 }
}
