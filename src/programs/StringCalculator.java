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
		String delimiter = ",|\n";
		if (string.isEmpty()) {
			return sum;
		}
		
		if (string.startsWith("//")) {
			delimiter = Character.toString(string.charAt(2));
			string = string.substring(4);
		}

		for (String str : string.split(delimiter)) {
			int num = Integer.parseInt(str);
			if (num < 0) {
				throw new IllegalArgumentException("negatives not allowed - " + str);
			}
			sum += num;
		}
		return sum;
	}

}
