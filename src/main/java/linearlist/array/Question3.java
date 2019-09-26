package linearlist.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 * For example, Given [100, 4, 200, 1, 3, 2] , The longest consecutive elements sequence is [1, 2,
 * 3, 4] . Return its length: 4.
 * Your algorithm should run in O(n) complexity.
 * @author xush22487
 */
public class Question3 {
	public static void main(String[] args){
		int[] nums = {1, 5, 3, 45, 10, 43, 44, 35};
		System.out.println(longestConsecutive(nums));

	}

	private static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}

		int longest = 0;
		for (int i : nums) {
			int length = 1;

			for (int j = i - 1; set.contains(j); j--) {
				set.remove(j);
				length++;
			}

			for (int j = i + 1; set.contains(j); j++) {
				set.remove(j);
				length++;
			}

			if(length > longest) {
				longest = length;
			}
		}
		return longest;
	}



	 //如果允许O(n \log n)O(nlogn)的复杂度，那么可以先排序，可是本题要求O(n)。
	 //由于序列里的元素是无序的，又要求O(n)，首先要想到用哈希表。
	 //用一个哈希表存储所有出现过的元素，对每个元素，以该元素为中心，往左右扩张，直到不连续为止，记录下最长的长度。

}
