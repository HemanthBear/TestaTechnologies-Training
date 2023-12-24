package B1;

public class operator2_pre_post {

	public static void main(String[] args) {
		int a=10, b=20,c=0;
		c = a++; // 1. Return value 10 to c    2. Increments a=a+1=11
		System.out.println("a= "+a+" c= "+c);
		c = ++b; // 1. Increments b, b=21      2. Return value 21 to c     
		System.out.println("b= "+b+" c= "+c);
		System.out.println(c++); // ret  o/p=21, incr c=22
		System.out.println(++c); // incr c=22=1 = 23, ret o/p=23
		c = c++; System.out.println("c = "+c);//23
		c = ++c; System.out.println("c = "+c); // 24
		c += c++; System.out.println("c = "+c);//c= c + c++= 24 + 24 ,c=25 .. = 48
		c += ++c; System.out.println("c = "+c); // c = c + ++c = 48 + 49 ,c=49.. =97
		c=10;
		c += c++ + c + ++c;// 10+ 10+11+12 =43        c=11
		System.out.println("c="+c);//43
		a=11; b=22; c =a + b + a++ + b++ + ++a + ++b; //11+22+11+22+13+24
		System.out.println("a = "+a+"b = "+b+"c = "+c);
		int k = c++; System.out.println("k="+k+" c="+c); // k = 11++; NO
		int m=10; byte r = 5; 
		m=r;//implicit
		r=(byte) m;//explicit
		
	}

}
