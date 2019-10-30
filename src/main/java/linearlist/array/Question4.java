package linearlist.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1
 * must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * @author xush22487
 */

public class Question4 {

	//可以根据put和get的方法调用频率，来判断具体把复杂逻辑放到put还是get
	private Map<Integer, Integer> numPair = new HashMap<>();


	public static void main(String[] args){
		int[] nums = {1, 5, 3, 45, 10, 43, 44, 35};
		System.out.println(Arrays.toString(twoSum(nums, 8)));
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int j = 0; j < nums.length; j++) {
			Integer k = map.get(target - nums[j]);
			if(k != null && k > j) {
				return new int[]{j + 1, k + 1};
			}
		}

		return null;
	}


	//方法1：暴力，复杂度O(n^2)，会超时
	//方法2：hash。用一个哈希表，存储每个数对应的下标，复杂度O(n).
	//方法3：先排序，然后左右夹逼，排序O(n\log n)O(nlogn)，左右夹逼O(n)，最终O(n\log n)O(nlogn)。
	// 但是注意，这题需要返回的是下标，而不是数字本身，因此这个方法行不通。


	/**
	 * 扩展问题
	 */
	public static int add(int x) {
		return 0;
	}
}
