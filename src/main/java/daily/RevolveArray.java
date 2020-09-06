package daily;

import java.util.ResourceBundle;

public class RevolveArray {
	public static void main(String[] args){
		int[] nums = new int[]{2, 2, 2, 0, 1};
		System.out.println(new RevolveArray().minArray(nums));
	}
	public int minArray(int[] numbers) {
		int low = 0;
		int high = numbers.length - 1;
		while (low < high) {
			int pivot = low + (high - low) / 2;
			if (numbers[pivot] < numbers[high]) {
				high = pivot;
			} else if (numbers[pivot] > numbers[high]) {
				low = pivot + 1;
			}else {
				high--;
			}
		}
		return numbers[low];
	}

}
