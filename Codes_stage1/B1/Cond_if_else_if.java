package B1;

import java.util.Scanner;
//Accept a number and print if it is +ve , -ve or Zero
public class Cond_if_else_if {
	public static void main(String[] args) {
	     int a; 
	     Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a number ... ");
	     a = sc.nextInt(); 
	     if(a>0) System.out.println(" +ve");
	     else  if(a<0) System.out.print(" -ve");
	     else System.out.print(" Zero");
	     
	     if(a%2==0) System.out.print(" Even number"); //divisible any number
	     else System.out.print(" Odd number");
	}
}
// I/p   Ticket_cost= .. Age=...
// age >= 60 , disc_p=35% , 0
// O/p   Senior citizen  Discount -Y/N
// Disc = ....  Final Payable=....



