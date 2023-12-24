package B2;

public class Pattern_Rb_c {
	public static void main(String[] args) {
	 int st=65,n=st+8,sp=n-st;
	 for(int k=st; k<n; k++)	{
		 for(int w=1; w<(n+1-k) ;w++)
			 System.out.print("  ");
		 for(int w=st; w<k ;w++)
			 System.out.print((char)w+" ");
		 for(int w=k; w>=st ;w--)
			 System.out.print((char)w+" ");
	     System.out.println();}
	 
	}
}
/*
 *              A 
              B A B
            C B A B C
          D C B A B C D  
          
          *
         * *
        *   *
       *     *
      * * * * *   
             
 */
*/