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
		String negs = "";
		String delimiter = ",|\n";
		if (string.isEmpty()) {
			return sum;
		}
		
		if (string.startsWith("//[")) {
			delimiter = (String) string.subSequence(string.indexOf("[") + 1, string.indexOf("]"));
			string = string.substring(string.indexOf("\n") + 1);
			delimiter = delimiter.replaceAll("\\*", "\\\\*");
		} else if (string.startsWith("//")) {
			delimiter = Character.toString(string.charAt(2));
			string = string.substring(4);
		}

		for (String str : string.split(delimiter)) {
			int num = Integer.parseInt(str);
			if (num < 0 && negs.isEmpty()) {
				negs = negs.concat(str);
			} else if (num < 0) {
				negs = negs.concat("," + str);
			} else if (num <= 1000) {
				sum += num;	
			}
		}
		if (!negs.isEmpty()) {
			throw new IllegalArgumentException("negatives not allowed - " + negs);
		}
		return sum;
	}

}
