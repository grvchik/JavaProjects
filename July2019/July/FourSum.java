package July;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FourSum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		boolean removalDone = false;
		Arrays.sort(nums);
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		int fourth = Integer.MIN_VALUE;
		int tempSum = 0;
		Set<Integer> unique = new HashSet<Integer>();
		for (int i = 0; i < 4; i++) {
			List<Integer> oneSet = new ArrayList<Integer>();
			first = nums[i];
			for (int j = 1; i < 5; i++) {
				second = nums[j];
				tempSum = first + second;
				oneSet.add(first);
				oneSet.add(second);
				for (int k = 2; k < 6; k++) {
					third = nums[k];

					oneSet.add(third);
					tempSum = tempSum + third;

					for (int l = 3; l < 7; l++) {
						if (l < nums.length) {
							fourth = nums[l];
						} else {
							break;
						}

						tempSum = tempSum + fourth;
						oneSet.add(fourth);

						if (oneSet.size() == 4) {
							if (tempSum == target) {

								result.add(oneSet);
								oneSet = new ArrayList<Integer>();
							} else {
								oneSet.remove(3);
								tempSum = tempSum - fourth;
								removalDone = true;
							}

						}
					}
					unique.clear();
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = { 1, 0, -1, 0, -2, 2 };
		FourSum fourSum = new FourSum();
		fourSum.fourSum(nums, 0);
	}

}
