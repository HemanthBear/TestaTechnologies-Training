package B2;

public class Pattern_Rb {
	public static void main(String[] args) {
	 int n=4;
	 for(int k=1; k<n; k++)	{
		 for(int w=1; w<(n+1-k) ;w++)
			 System.out.print("  ");
		 for(int w=1; w<k ;w++)
			 System.out.print(w+" ");
		 for(int w=k; w>=1 ;w--)
			 System.out.print(w+" ");
	     System.out.println();}
	 for(int k=n; k>=1; k--) {
		 for(int w=1; w<(n+1-k) ;w++)
			 System.out.print("  ");
		 for(int w=1; w<k ;w++)
			 System.out.print(w+" ");
		 for(int w=k; w>=1 ;w--)
			 System.out.print(w+" ");
	     System.out.println();}
	}
}
/*
       1
     2 1 2
   3 2 1 2 3
 4 3 2 1 2 3 4
*/
