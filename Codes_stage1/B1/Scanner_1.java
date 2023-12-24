package B1;
import java.util.Scanner;
// calculate Simple interest I, 
// Principal, TimeDuration , Rate are user inputs
public class Scanner_1 {
	public static void main(String[] args) {
     double i, p, t, r;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter values for P, T, R ... ");
     p = sc.nextDouble();      t = sc.nextDouble();
     r = sc.nextDouble();
     i = p*t*r/100;
     System.out.println("Simple interest I ="+i);
     System.out.println("Amount ="+(p+i));
     System.out.println("Enter values for n ... ");
     double n = sc.nextDouble();// no of times int is calculated per time period
     double amt = Math.pow(p*(1+(r/n)),n*t) ; //A = P[1+ (r/n)]^nt
     double ci = amt-p;
     System.out.println("Compount interest I ="+ci);
     System.out.println("Compounded Amount ="+(p+ci));     
	}
}
//1. accept the length of 3 sides of a triangle and calculate Area, Perimeter
// a = sqrt[s(s-a)(s-b)(s-c)]  s= (a+b+c)/2
// Print if a Triangle is Right Angled or not using Math.hypot  a*a = b*b + c*c