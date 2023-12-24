package B2; // Know the no of iterations
public class for_Loop2 {
	 public static void main(String[] args) {
		 int k;
		for(  k=1 ; ++k<5 ;  ) 
		  { System.out.print(k +" "); }
		System.out.println(" Outside the loop_1 : k="+k); 
		for(  k=1 ; k++<5;  ) 
		  { System.out.print(k +" "); }
		System.out.println(" Outside the loop_2 : k="+k);  
		for(  k=1 ; k<5;  ) 
		  { System.out.print(++k +" "); }
		System.out.println(" Outside the loop_3 : k="+k); 
		for(  k=1 ; k<5;  ) //for( initial value ; true condition ; increment/decr)
		  { System.out.print(k++ +" "); }
		System.out.println(" Outside the loop_4 : k="+k);
		 
		}
	}