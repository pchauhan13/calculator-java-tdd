/**
 * 
 */
package programs;

/**
 * @author Prashant Singh Chauhan
 *
 */
public class StringCalculator {

	public int Add(String string) {
		int sum = 0;
		if (string.isEmpty()) {
			return sum;
		}

		for (String str : string.split(",|\n")) {
			sum += Integer.parseInt(str);
		}
		return sum;
	}

}
