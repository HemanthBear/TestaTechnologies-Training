package B1;// 1-Sun, 2-Mon , ......
import java.util.Scanner;
public class Cond_switch_case {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println(" Enter day of Week(1-7) : ");
    int day= s.nextInt(); String dw,dyw;
    if(day == 1) dw="Sunday";
    else if(day == 2) dw="Monday";	
    else if(day == 3) dw="Tuesday"; 
    else if(day == 4) dw="Wednesday"; 
    else if(day == 5) dw="Thursday";
    else if(day == 6) dw="Friday";
    else if(day == 7) dw="Saturday";
    else dw="Wrong Input";
    switch(day) {// Boolean Expr(simple,compound)-NOT,Math operations, String, char- Yes
    case 1: dyw="Sunday";     break;//Fall Through
    case 3 : dyw="Tuesday";   break;
    case 4 : dyw="Wednesday"; break;
    case 5 : dyw="Thursday";  break;
    case 6 : dyw="Friday";    break;
    case 7 : dyw="Saturday";  break;
    default : dyw="Wrong Input";     }
    System.out.println("Day of the Week is(if-else-if)  "+dw);
    System.out.println("Day of the Week is(switch-case) "+dyw);
	}

}