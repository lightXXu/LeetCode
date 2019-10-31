package linearlist.array;

import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets
 * in the array which gives the sum of zero.
 * Note:
 *     Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 *     The solution set must not contain duplicate triplets.
 * For example, given array S = {-1 0 1 2 -1 -4}.
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 *
 * @author： xush
 * 开发时间：2019-10-30 15:50
 */
public class Question5 {
	private static int[] array = new int[]{-1, 0, 1, 2, -1, -4};

	public static void main(String[] args){
		solution5(array);
	}

	// 3Sum
	// 先排序，然后左右夹逼，注意跳过重复的数
	// Time Complexity: O(n^2)，Space Complexity: O(1)
	private static void solution5(int[] array) {
		List<List<Integer>> result = new ArrayList<>();
		if(array.length < 3) {
			return;
		}

		Arrays.sort(array);

		for (int i = 0; i < array.length - 2; i++) {
			//跳过重复的数,防止出现重复的结果
			if(i > 0 && array[i] == array[i - 1]) {
				continue;
			}
			int j = i + 1;
			int k = array.length - 1;
			while (j < k) {
				if(array[i] + array[j] + array[k] < 0) {
					++j;
					while (array[j] == array[j - 1] && j < k) {
						++j;
					}
				} else if(array[i] + array[j] + array[k] > 0) {
					--k;
					while (array[k] == array[k + 1] && j < k) {
						--k;
					}
				} else {
					result.add(Arrays.asList(array[i], array[j], array[k]));
					++j;
					--k;
					while (array[j] == array[j - 1] && j < k) {
						++j;
					}
					while (array[k] == array[k + 1] && j < k) {
						--k;
					}
				}
			}
		}

		for (List<Integer> item : result) {
			for (Integer i : item) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}
}
