package B1;

public class Operator2_Ternary {

	public static void main(String[] args) {
		int i = 100,  k=200, w=50, min=0,max=0;
		min = (i<k)? i : k;
		if(i<k) min=i; 	else  min=k;
		max = (i>k)? i : k;
		System.out.println("max ="+max+" min ="+min);
		max = (i>k)?               // condition
				(i>w)? i : w :     // true block
					(k>w)? k : w;  // false block
		System.out.println("Max of 3 no's ="+max);
		// i = 100,  k=20,  w=50
		// i = 100,  k=200, w=50
		// i = 100,  k=200, w=500
		int a=3, b=4;
		int c= (a<b)? (a*b): (a+b); System.out.println(" c="+c);
		System.out.println((b<3)?'Z':'Y');
		boolean bool;
		a=18; b=12;  bool=(a>20&&b<15)?true:false; System.out.println(bool);//false
		a=18; b=12;  bool=(a>20||b<15)?true:false; System.out.println(bool);//true	
		a=180; b=12; bool=(a>20&&b<15)?true:false; System.out.println(bool);//true
		a=180; b=12; bool=(a>20||b<15)?true:false; System.out.println(bool);//true
		c=(a+550<1700)? 200 : 400; System.out.println("c="+c);//200
		c=(a+550<700)? 200 : 400;  System.out.println("c="+c);//400
		c=100; c=(a+550<1700)? c-- : c++; System.out.println("c="+c); // 100 c= c--
		c=100; c=(a+550<1700)? --c : ++c; System.out.println("c="+c); // 99  c= --c
		c=100; c=(a+550<700)? c-- :  c++; System.out.println("c="+c); // 100 c= c++ 
		c=100; c=(a+550<700)? --c :  ++c; System.out.println("c="+c); // 101 c= ++c
		a=180;  c= a++<=180 ? 100 :  200; System.out.println("c="+c+" a="+a); // 100
		a=180;  c= ++a<=180 ? 100 :  200; System.out.println("c="+c+" a="+a); // 200
		
		// c=c++; c=c--; // NO Effect
		String answer;
b=180;a=180;answer=(a==b)?"yes":"no"; System.out.println("answer = "+answer);
b=10;a=100; answer=(a==b)?"yes":"no"; System.out.println("answer = "+answer);

	}

}
