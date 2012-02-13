/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Chp3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(String.valueOf(new char[] { 'a', 'b' }));
		System.out.println("a\u0022.length() + \u0022b");
		System.out.println("a\".length() + \"b".length());
	}

	public static void theLastLaugh() {
		System.out.print("H" + "a");
		System.out.print('H' + 'a');
	}

	public static void ABC() {
		String letters = "ABC";
		char[] numbers = { '1', '2', '3' };
		System.out.println(letters + " easy as " + numbers);
	}

}
