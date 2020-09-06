package daily;

import java.util.HashMap;
import java.util.Map;

public class StepsQuestion {
	Map<Integer,Integer> map = new HashMap<>();
	public int numWaysRecursive(int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}

		if (n == 2) {
			return 2;
		}

		if (map.containsKey(n)) {
			return map.get(n);
		}
		return numWaysRecursive(n - 1) + numWaysRecursive(n - 2);
	}

	public static void main(String[] args){
		System.out.println(new StepsQuestion().numWaysRecursive(39));
		System.out.println(new StepsQuestion().numWays(39));
	}


	public int numWays(int n) {
		int[] nums = new int[n + 1];
		nums[0] = 1;
		if (n > 0) {
			nums[1] = 1;
		}
		for (int i = 2; i < n + 1; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
			nums[i] %= 1000000007;
		}

		return nums[n];
	}

}
