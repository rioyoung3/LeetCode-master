public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int index = 0;
		int length = nums.length;
		for(int i = 0; i < length; i++){
			index = target - nums[i];
			for(int j = i + 1; j < length; j++){
				if(index == nums[j]){
					return new int[]{i,j};
				}
			}
		}
		return new int[]{-1,-1};
    }
}