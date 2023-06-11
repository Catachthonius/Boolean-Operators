package BooleanOperators;

public class BooleanOperators {
    public static void main(String[] args) {
        //Try to solve on paper the following boolean algebra operations:
        //Then compare your solutions with a Java program that tests the validity of your assumptions.

        //[A]:
        boolean a = 2 <= 2 && !true;
        System.out.println(a);

        //[A] results false because while (2 <= 2) is true, !true is false, giving a false result.

        //[B]:
        boolean b = !false && 3 > 2;
        System.out.println(b);

        //!false means true and since 3 > 2 is true, the result will be true.

        //[C]:
        boolean t = false;
        boolean f = true;
        System.out.println(!(!t) || f);

        //Both booleans will become true.

        //[D]:
        boolean d = 6 > 6 ^ !(true && true);
        System.out.println(d);

        //The operator "^" will result true in the case of both result being different from each other.
        //In this case it will result false.
    }
}
