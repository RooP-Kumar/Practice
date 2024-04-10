import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[]{9, 7, 5, 2, 8};
		sort(arr);
	}
	
	public static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while(j > 0 && nums[j] <= nums[j-1]) {
				int temp = nums[j];
				nums[j] = nums[j-1];
				nums[j-1] = temp;
				j--;
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}

