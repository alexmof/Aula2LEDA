
public class main {

	public static void main(String[] args) {
		I1 x = new D();
		x.m3("5");
		C z = (C) x;
		z.m2(2.0);
		A y = (A) x;
		A k = (A) x;
		
		I1 n = new E();
		System.out.println(n instanceof B);
		System.out.println(n instanceof C);
		System.out.println(n instanceof A);
		System.out.println(n instanceof I1);
		System.out.println(n instanceof I2);
		System.out.println(x instanceof E);
		System.out.println(x instanceof I2);
		System.out.println(x instanceof C);
	}

}
