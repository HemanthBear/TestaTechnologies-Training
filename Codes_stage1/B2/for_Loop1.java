package B2;
//Loop - set of repetitive line of code
public class for_Loop1 {
 public static void main(String[] args) {
	 int k,r;
	for(  k=-1 ; k<5 ; k++ )//for( initial value ; true condition ; increment/decr)
	   System.out.println(k +" Hello World!!"); 

	System.out.print("\n Loop 2: "); //1
	for(  k=5,r=2 ; k>0 ; k--, r++ )		  
		System.out.print("* " ); 
	System.out.print("\n Loop 3: "); //1
	for(  k=5,r=2 ; r<10 ; k--, r++ )		  
		System.out.print("* " );
	System.out.print("\n Loop 4: "); //1
	for(  k=5,r=2 ; k>0 && r<10 ; k--, r++ )		  
		System.out.print("* " );
	System.out.print("\n Loop 5: "); //1
	for(  k=5,r=2 ; k>0 || r<10 ; k--, r++ )		  
		System.out.print("* " );
	}
}

// k=1 (I); k<5 (II) ; k++ 
 // System.out.println("...");(III)

//k=1 ; k<5 (II) ; k++ (I)
// System.out.println("...");(III)

//....k=4 - .. 
