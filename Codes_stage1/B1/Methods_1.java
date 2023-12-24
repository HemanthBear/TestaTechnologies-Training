package B1;

//Polymorphism - same method name - different method signatures
//method signatures - no and datatype of Parameter
public class Methods_1  {
		static int sum(int n1, int n2, int n3) {
		return (n1 + n2 + n3);	}
	static double sum(double n1, double n2) {
		System.out.print("DOUBLE-");return (n1 + n2);	}
	static float sum(float n1, float n2) {
		System.out.print("FLOAT-"); return (n1 + n2);	}
	static String sum(String n1, String n2) {
		return  (n1 + n2);	}//string concatenation
	public static void main(String[] args) {
		int a = 10, b = (int)20.8; long L = a;
		System.out.println(" Sum = " + (sum(a, b) + 1000));//FLOAT- Sum = 1030.0 when int method is absent
		int s1 = sum(300,500,100) + 50/3 ;// 900+ 50/3 = 900+16
		System.out.println("s1 ="+s1);//916
		System.out.println( (sum("123", "456")+78));// 12345678
		System.out.println( sum(3.3, 4.5) );//DOUBLE-7.8
		System.out.println( sum(3, (float)4.5) );//3.0 + 4.5 =FLOAT-7.5
		System.out.println( sum(3.3, 4) );//DOUBLE-7.3
	}
}
