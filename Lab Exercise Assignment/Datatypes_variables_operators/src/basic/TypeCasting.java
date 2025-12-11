package basic;

public class TypeCasting {

	public static void main(String[] args) {
		 // Implicit (Widening) Casting
        int a = 10;           // smaller type
        double b = a;         // automatically converted to double

        System.out.println("Implicit Casting (int → double):");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // ----------------------------
        // Explicit (Narrowing) Casting
        // ----------------------------
        double x = 9.78;      // larger type
        int y = (int) x;      // manually converted to int

        System.out.println("\nExplicit Casting (double → int):");
        System.out.println("x = " + x);
        System.out.println("y = " + y); // decimal removed

        // Another example of explicit casting
        int big = 130;
        byte small = (byte) big;   // value overflow

        System.out.println("\nExplicit Casting with Overflow (int → byte):");
        System.out.println("big = " + big);
        System.out.println("small = " + small);
	}
}
