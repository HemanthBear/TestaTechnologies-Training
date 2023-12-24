package B1;//-14 .. -13 -12 -11 ... 0 ... 11 12 13 .. 14         -1> -2 , 1<2
public class Math_class {// java.lang.Math
	public static void main(String[] args) {
		System.out.println("PI = "+Math.PI +" E="+ Math.E);	double r = 5;
		System.out.print  (" Area a circle r=5units :"+ (Math.PI*r*r)); 
		System.out.println(" Perimeter = "+(2*Math.PI*r));
		System.out.print  ("floor(-13.2) = " + Math.floor(-13.2));//Lower -14
		System.out.println (" ceil(-13.2) = " + Math.ceil(-13.2));// Higher -13
		System.out.print   (" pow(10,2) ="+ Math.pow(10,2));
		System.out.println (" sqrt(100) ="+Math.sqrt(10.5)+"cbrt(27) ="+Math.cbrt(27));
		System.out.print (" round(10.48) ="+Math.round(10.48));
		System.out.print (" round(10.5) ="+Math.round(10.5));
		System.out.print (" rint(10.48) ="+Math.rint(10.48));
		System.out.print (" rint(10.5) ="+Math.rint(10.5));
		System.out.println(" rint(10.8) ="+Math.rint(10.8));
		System.out.print (" max(-12,-3) ="+Math.max(-12, -3));
		System.out.print (" min(-12,-3) ="+Math.min(-12, -3));
		System.out.println(" hypot(4,3) = "+Math.hypot(4, 3));
		System.out.print (" sin(0) ="+Math.sin(0));
		System.out.print (" cos(0) ="+Math.cos(0));
		System.out.print (" abs(10) ="+Math.abs(10));
	}
}// Menu a):  1 + 2- 3* 4/ 5 % 6 max
 //      b):  1 sin 2 cos 3 .... 