package B2;

public class pattern_box {
 public static void main(String[] args) {
	 int n=5;
	 /*
	   & & & ..n
	   & & & ..
	   & & & ..
	   n lines
	 */
	for(int r=1; r<=n; r++)
	{ for(int k=1; k<=(n-r); k++) 
		System.out.print(" "); 
	  for(int k=1; k<=r; k++) 
		System.out.print("# "); 
	  System.out.println();
	} 
	  

	 
   for(int w=1; w<=n; w++) { 
	  for(int k=1; k<=n; k++) {
	 if( (w==1||w==n) || ((w>1&&w<n) && (k==1||k==n))) System.out.print(" &");
	 if( (w>1&&w<n) && ((k>1&&k<n)) ) System.out.print("  "); 		 }
       System.out.println("");} 
   for(int w=1;w<=n;w++) {
		for(int k=1;k<=n;k++) {
			if(w==1 || w==n || k==1 || k==n) {
				System.out.print("&"+" ");
			} else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
/* & & & & & & & & & &
   & 				 &
   & 				 &
   & 				 &
   & 				 &
   & 				 &
   & & & & & & & & & &      */
 // start=11; r=7 col=5// standli=verical=cal horiz=sleepingl=rows  
 /*  11 12 13 14 15
   16 17 ... 
   1 2 3 4 5
   1 2 3 4 4
   1 2 3 3 3
   1 2 2 2 2
   1 1 1 1 1 
   
1 2 3 4 5 6 7 
2 3 4 5 6 7 1 
3 4 5 6 7 1 2 
4 5 6 7 1 2 3 
5 6 7 1 2 3 4 
6 7 1 2 3 4 5 
7 1 2 3 4 5 6

Pascals triangle

row 0 =1
row 1 = (0+1), (1+0) = 1, 1
row 2 = (0+1), (1+1), (1+0) = 1, 2, 1
row 3 = (0+1), (1+2), (2+1), (1+0) = 1, 3, 3, 1
row 4 = (0+1), (1+3), (3+3), (3+1), (1+0) = 1, 4, 6, 4, 1
row 5 = (0+1), (1+4), (4+6), (6+4), (4+1),(1+0) = 1, 5, 10, 10, 5, 1
row 6 = (0+1), (1+5), (5+10), (10+10), (10+5), (5+1), (1+0) = 1, 6, 15, 20, 15, 6, 1
       1
      1 1 
     1 2 1
    1 3 3 1
   1 4 6 4 1
  1 5 10 10 5 1 
1 6 15 20 15 6 1
    */
     		 
 }
}
