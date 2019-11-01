package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 题目：Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer
 * range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the
 * reversed integer overflows.

 *
 * @author： lightXXu
 * 时间：2019-10-31 14:42
 */
public class No7 {
	public static void main(String[] args){
		System.out.println(reverse(1534236469));

	}

	private static int reverse(int x) {
		List<Integer> list = new ArrayList<>();
		long result = 0;
		for (int j = 0; x != 0; j++) {
			list.add(x % 10);
			x = x / 10;
		}

		int size = list.size();
		for (int k = 0; k < size; k++) {
			result += (Math.pow(10, size - k - 1) * list.get(k));
		}
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}
		return (int) result;
	}

}
