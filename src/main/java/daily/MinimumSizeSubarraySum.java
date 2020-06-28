package daily;

/**
 * 题目：
 *
 * Given an array of n positive integers and a positive integer s, find the minimal length of a
 * contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 *
 * Example: 
 *
 * Input: s = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 * Follow up:
 * If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
 *
 *
 * @author： lightXXu
 * 时间：2020-06-28 13:26
 */
public class MinimumSizeSubarraySum {
	public static void main(String[] args) {
		int[] nums = new int[]{2,3,1,2,4,3};
		System.out.println(minSubArrayLen(7, nums));
	}

	public static int minSubArrayLen(int s, int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		int left = 0;
		int right = 0;
		int sum = 0;
		int minLen = Integer.MAX_VALUE;
		while (right < nums.length) {
			sum += nums[right++];
			while (sum >= s) {
				minLen = Math.min(right - left, minLen);
				sum -= nums[left++];
			}
		}
		if (minLen == Integer.MAX_VALUE) {
			return 0;
		} else {
			return minLen;
		}

	}
}
