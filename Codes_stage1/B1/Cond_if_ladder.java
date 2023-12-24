package B1;
 
import java.util.Scanner;
// >=60 - 35 , >70 - 45, >80 - 55, >90 - 65, >100 - 100%, Others - 0
//Age: 1-12 - 50%,  13-59 - 0 ,60 -70,    70-80   , 80-90     ,90-100,
public class Cond_if_ladder {//Ag1= 10,25,65,75,85,95,105
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter ticket cost:");double ticketCost = scanner.nextDouble();
 System.out.print("Enter age: ");  int age = scanner.nextInt();
  double discP = 0;
  // Methods, data-types, variables, operators(math, compare, assignment,unary, scanner)
  if(age<=12)     discP = 50; //1-12
  else if(age<60) discP = 0;  // 13-59 
  else if(age<70) discP=35;   //60-69
  else if(age<80) discP=45;   //70-69
  else if(age<90) discP=55;   //80-89
  else if(age<100) discP=65;  //90-99
  else discP=100;// > 100
  double Disc= (discP/100)*ticketCost ;
  double AmtP =ticketCost -Disc;
  System.out.println("Ticketcost="+ticketCost+" Age="+age );
  System.out.println("Disc Per="+discP+" DiscountPybl="+Disc );
  System.out.println("Ticketcost="+ticketCost+" Age="+age );
  System.out.println("Amount Payable ="+AmtP );
 }
}