package B1;
// Add nos' input by the user
import java.util.Scanner;
public class Scanner_demo {
	public static void main(String[] args) {
		byte a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 2 no's");
		//a =sc.nextByte();  
		//b =sc.nextByte(); 
		//sum = (byte) ( sc.nextByte() + sc.nextByte() );
		System.out.println("sum="+ ( sc.nextByte() + sc.nextByte() ) );
		sc.close();
	}
}
