package daily;

import java.util.Arrays;

public class Print1toN {
	StringBuilder sb = new StringBuilder();
	int n;
	char[] curr;
	char[] bases = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	int nine;
	int start;
	int res[];
	public int[] printNumbers(int n) {
		this.n = n;
		curr = new char[n];
		start = n - 1;
		res = new int[(int)Math.pow(10, n) - 1];
		addNum(0);
		sb.deleteCharAt(sb.length() - 1);
		return res;
	}

	public void addNum(int x) {
		if (n == x) {
			String currS = String.valueOf(curr).substring(start);
			if (!"0".equals(currS)) {
				int index = Integer.parseInt(currS);
				res[index-1] = index;
				sb.append(currS).append(",");
			}
			if (start == n - nine) {
				start--;
			}
			return;
		}
		for (char num : bases) {
			if (num == '9') {
				nine++;
			}
			curr[x] = num;
			addNum(x + 1);
		}
		nine--;

	}

	public static void main(String[] args) {
		new Print1toN().printNumbers(2);
	}
}
