import java.math.BigDecimal;

/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Chp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dosEquis();
		System.out.println("2 + 2 = " + (2 + 2));

		// isOdd(33);
	}

	// Negative odd numbers will be wrong, because of how modulus is coded. Use
	// bit operations instead
	public static void isOdd(int i) {
		System.out.println(i % 2 == 1); // bad way
		System.out.println((i & 1) != 0); // good way
	}

	// Imprecision of float/double leads to errors, use ints or BigDecimal
	public static void change() {
		System.out.println(2.00 - 1.1); // bad way
		BigDecimal bD2Dollars = new BigDecimal("2.00");
		BigDecimal bD1D10C = new BigDecimal("1.1");
		System.out.println(bD2Dollars.subtract(bD1D10C));
	}

	// By the time we set the value, we've already gone over the int max limit
	public static void longDivision() {
		// bad way
		long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		// right way
		MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
	}

	// The number at the end of the second number is actually an l (for long)
	// instead of a numeric one. Always use a capital L!
	public static void itIsElementary() {
		System.out.println(12345 + 5432l);
	}

	// overflow issue
	public static void joyOfHex() {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe)); // wrong
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));// right

	}

	// conditional operator has rules about different types.
	public static void dosEquis() {
		char x = 'X';
		int i = 0;
		System.out.print(true ? x : 0);
		System.out.print(false ? i : x);
		// prints out X88

		System.out.print(true ? x : 0);
		System.out.print(false ? (int) i : x);

	}

	// compound operators auto cast to the left type.
	// incrementing, doesn't
	public static void tweedleDum() {
		short x = 0;
		int i = 1;
		x += i;
		x = (short) (x + i); // need cast
	}

	public static void tweedleDee() {

	}
}
