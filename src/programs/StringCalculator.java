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

		String[] nums = string.split(",");
		for (String str : nums) {
			sum += Integer.parseInt(str);
		}
		return sum;
	}

}
