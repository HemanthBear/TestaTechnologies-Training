package B1;

public class var_range {
	public static void main(String[] args) {
        // -128 -127 -126 ...... 0 ...... 126 127 
		// 128/127 - R 1, 129/127 - R 2
		//Explicit type conversion - Programmer
		byte  b=(byte)128+120, c=(byte)129, d = (byte)130, e = (byte)131;
		int i = b;// Implicit type conversion - By JVM
		System.out.println(" b="+b+" c="+c+" d="+d+" e="+e);	
	}
}
