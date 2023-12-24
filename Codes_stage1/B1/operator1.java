package B1;

public class operator1 {
	public static void main(String[] args) {/*
       byte a=10, b=20,c=30;// equating c to 30
       byte j = 3%30;// + - / * %(modulus-=Remainder)
       boolean bool = a>b;//false 
       System.out.println("a>b "+(a>b));
       System.out.println("a<b "+(a<b));// b<=c  c<=a  a==a     a==c   a!=a   a!=b	
       System.out.println("b<=c "+(b<=c));
       System.out.println("a==a "+(a==10));//comparing a, b
       //?  b<50 and b>10 - Logical multiplication
       System.out.println("b is between 50 and 10  "+ (b<50 && b>10));		
       System.out.println("a is between 50 and 10  "+ (a<50 && a>10));	// 1*0=0
       //? b==10 OR b==20, a==100 OR a==200
       System.out.println("b is 20 or 10  "+(b==10 || b==20));	// 1 + 0 = 1
       System.out.println("a is 200 or 100  "+(a==100 || a==200));	// 0 + 0 = 0
       byte z =10, y=1;; z++; z = (byte) (z+y); y=(byte) (y-1);*/
       int z =20;  
       System.out.println(z++);// POST: return-display(20) add(z=21) 
       System.out.println(++z);// PRE:  add(z=22)   return-display(22)
       z=25;  int a=z++; System.out.println("a="+a+" z="+z); 
       z=25;      a=++z; System.out.println("a="+a+" z="+z); 
       z =5;a= ++z + z++ +z;System.out.println("a="+a+" z="+z);//a= 6+6+7=19,z=7
       z=5;  z += z++ + ++z +z; System.out.println(" z="+z); 
       //z =z + ++z + z++ +z = 5 + 6 + 6 + 7 = , z=7,
       a = z + a/2;  System.out.println("a="+a+" z="+z); 
       a = z*3+a/2;  System.out.println("a="+a+" z="+z); 
       
       }

}
