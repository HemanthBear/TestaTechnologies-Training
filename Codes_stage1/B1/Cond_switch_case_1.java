package B1;
import java.util.Scanner;
public class Cond_switch_case_1 {
 public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Day of Week(sun/mon/tue...)? : ");
    int day=0; String dw=s.next();
    // MON , mon,Mon, mON -> toUpperCase() = "MON"
    // Boolean Expr(simple,compound)-NOT,Math operations,int,String, char- Yes
    switch(dw.toUpperCase()) {
    case "SUN": day=1;  break;//No break; == Fall Through
    case "MON": day=2;  break;//break-ignores all following cases, exits switch block 
    case "TUE": day=3;  break;//case - constant value,expre. NO expressions 
    case "WED": day=4;  break;
    case "THU": day=5;  break;
    case "FRI": day=6;  break;
    case "SAT": day=7;  break;
    default:    }//default - else - No case is true
    System.out.println("Day of the Week is   "+dw);
    System.out.println("Day of the Week is   "+day);
    /* rectify this code ...
    int day = 2;
    switch (  ) {    
    case () :  System.out.println("Saturday");        
    case () :  System.out.println("Sunday  ");     } */
    
	}
}