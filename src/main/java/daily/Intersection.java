package daily;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 题目：
 *
 * @author： lightXXu
 * 时间：2020-07-13 17:17
 */
public class Intersection {
	public static void main(String[] args){
		int[] num1 = new int[]{1,2,2,1};
		int[] num2 = new int[]{2,2};
		System.out.println(intersect(num1, num2).toString());

	}

	public static int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> result = new ArrayList<>();
		List<Integer> number1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> number2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		for (Integer num : number1) {
			if (number2.contains(num)) {
				result.add(num);
				number2.remove(num);
			}
		}

		int[] resultArray = new int[result.size()];
		int i = 0;
		for (Integer x : result) {
			resultArray[i] = x;
			i++;
		}
		return resultArray;
	}
}
