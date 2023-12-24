package B1;

public class Methods {//Access_specifier return_type Method_name(parameters)
    public static double Sum(double n1, int n2) {//yes return, 2 parameters
	 return (n1 + n2);  		}
	public static void main(String[] args) {
		double s = Sum(100, 200);// method_name(arguments..)
		Hi();  // method call
		Hello("world");
		String st = World();
		System.out.println("Hi "+ st);
		System.out.println(" Sum = " + s);
		System.out.println("Sum(11.2,23) = "+Sum(11.2,23));
	} // method declaration
	private static String World() {// - yes return, No parameter
		return "WORLD !!"; 	}
    static void Hello(String st) { // - no return, 1 parameter
		System.out.println("Hello "+st); 	}
	static void Hi() {//void - no return, no parameter
		System.out.println(" Hi !!!");   	}
}
