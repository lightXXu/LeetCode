package daily;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目：
 *
 * @author： lightXXu
 * 时间：2020-08-24 16:05
 */
public class Fibonacci {
	public static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) {
		System.out.println(fib(51));
	}

	public static int fib(int n) {
		return add(n) % 1000000007;
	}

	public static int add(int n) {
		if (n == 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		}

		if (map.get(n) != null) {
			return map.get(n);
		}

		int result = fib(n - 1) + fib(n - 2);
		map.put(n, result);
		return result;
	}

}
