package daily;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：https://leetcode-cn.com/problems/pattern-matching-lcci/
 *
 * @author： lightXXu
 * 时间：2020-06-22 18:38
 */
public class PatternMatchingLCCI {
	public static void main(String[] args) {
		System.out.println(patternMatching("abba", "dogcatcatfish"));
	}

	public static boolean patternMatching(String pattern, String value) {
		List<String> patterns = new ArrayList<>();
		String oldValue = value;
		while (value.length() > 0) {
			value = extractPattern(value, patterns);
		}

		oldValue = oldValue.replaceAll(patterns.get(0), "a");
		oldValue = oldValue.replaceAll(patterns.get(1), "b");

		return oldValue.equals(pattern);

	}

	public static String extractPattern(String value, List<String> patterns) {
		for (int j = 1; j < value.length() - 1; j++) {
			String a = value.substring(0, j);
			String temp = value.substring(0, j - 1);
			if (value.indexOf(a) == value.lastIndexOf(a) && value.indexOf(temp) != value.lastIndexOf(temp)) {
				patterns.add(temp);
				value = value.replaceAll(temp, "");
			}
		}

		return value;
	}
}
