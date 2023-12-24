package B1;

import java.util.Scanner;

//1. accept the length of 3 sides of a triangle and calculate Area, Perimeter
//a = sqrt[s(s-a)(s-b)(s-c)]  s= (a+b+c)/2
//Print if a Triangle is Right Angled or not using Math.hypot  a*a = b*b + c*c
public class Scanner_2 {
	public static void main(String[] args) {
     double a,b,c,area,peri,s; boolean RtAn;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter values for 3 sides of a triangle ... ");
     a = sc.nextDouble();      b = sc.nextDouble();
     c = sc.nextDouble();      s = (a+b+c)/2;
     area = 0;                 peri =s*2;		 
     System.out.print("Perimeter ="+ peri);
     System.out.print("Area ="+ area);
System.out.print((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)?"RtAngTri":"NotRtAngTri"); 
if((a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a))  {
	  System.out.print("RtAngTri"); 
	  RtAn=true;                     //True block
	  }
else {
	System.out.print("Not a RtAngTri");
    RtAn=false; 					//false block
    }
String Tr=(a*a==b*b+c*c)||(b*b==a*a+c*c)||(c*c==b*b+a*a)?
		     "Right Angled Triangle":"Not a Right Angled Triangle";
System.out.println(Tr); sc.close();
	}
}