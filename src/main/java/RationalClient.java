public class RationalClient {
    
    public static void main(String[] args) {
        Rational r = new Rational(1, 4);
        Rational s = new Rational(1, 8);
        System.out.println(r);

        // We can use dot notation to access the integer values
        // of the numerator and denominator directly
        System.out.println(r.numerator);
        System.out.println(r.denominator);
        System.out.println(Rational.add(r, r));
        System.out.println(Rational.subtract(r, s));
        System.out.println(Rational.multiply(r, r));
        System.out.println(Rational.divide(s, r));
        // Rational s = new Rational(1, 3);
        // System.out.println(s);
        // Rational t = Rational.add(r, s);
        // System.out.println(t);
    }
}
