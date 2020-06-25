/**
 * 
 */
package programs;

/**
 * @author Prashant Singh Chauhan
 *
 */
public class StringCalculator {
	
	static int calledCount = 0;

	public int Add(String string) {
		calledCount = calledCount + 1;
		int sum = 0;
		String negs = "";
		String delimiter = ",|\n";
		String anotherDelimiter = "";
		if (string.isEmpty()) {
			return sum;
		}
		
		if (string.startsWith("//[")) {
			delimiter = (String) string.subSequence(string.indexOf("[") + 1, string.indexOf("]"));
			delimiter = delimiter.replaceAll("\\*", "\\\\*");
			if (string.indexOf("[") != string.lastIndexOf("[")) {
				anotherDelimiter = (String) string.subSequence(string.lastIndexOf("[") + 1, string.lastIndexOf("]"));
				anotherDelimiter = anotherDelimiter.replaceAll("\\*", "\\\\*");
				delimiter = delimiter.concat("|" + anotherDelimiter);
			}
			string = string.substring(string.indexOf("\n") + 1);
		} else if (string.startsWith("//")) {
			delimiter = Character.toString(string.charAt(2)).replaceAll("\\*", "\\\\*");
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

	public int GetCalledCount() {
		System.out.println(calledCount);
		return calledCount;
	}

}
