package B2;

import java.util.Scanner;

public class for_Loop3 {
  public static void main(String[] args) {
  int k=0;char c;
  Scanner s = new Scanner(System.in);
//for(;;) {}  //infinite loop
for(;;) { 
	k++;
	System.out.print(" Continue y/n ? "); c = s.next().charAt(0);//input a char
	if (c=='n') break; // takes control outside the loop
} 
System.out.println(" Loop executed "+k+" times.");
System.out.print(" Loop_2 "	);
for(  k=1 ; k<8; k++  ) {// 1 3
 if(k%2==0) continue; // Loops back line 17, next iteration
 if(k%5==0) break;    // breaks the loop, control move to line 22
 System.out.print(k +" ");  }

System.out.print("\n Loop_3 "	);
for(  k=1 ; k<10; k++  ) { // 5 6 7 8
 if(k<5) continue;
 if(k>8) break;
 System.out.print(k +" ");  }

}}