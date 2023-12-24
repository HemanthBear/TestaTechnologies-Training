package B2;
public class for_Loop5 {
	 public static void main(String[] args) {
		// How many times does the following method print  *? 6 stars
				 for (int i = 3; i < 9; i++)
				    System.out.print("* ");//3,4,5,6,7,8
				 System.out.println();
	    // How many times does the following method print a *? 18
				 for (int i = -5 ;i <= 12 ; i++)
				    System.out.print("* ");//-5 -4 -3 -2 -1 0 1 2 3 4 5..12
				 System.out.println();
		// How many times does the following method print a *?
				 for (int i = 1; i < 5; i++)
				    System.out.print("* ");
				 System.out.println();
		// How many times does the following method print a *?4
				 for (int i=1,k=8 ; i<5 && k>0;  i++,k--)//i=1-4, k=8-1
				    System.out.print("* ");	
				 System.out.println();
		// How many times does the following method print a *? 8
				 for (int i=1,k=8 ; i<5 || k>0;  i++,k--)//i=1-4, k=8-1
				    System.out.print("* ");	
				 

	 }}

