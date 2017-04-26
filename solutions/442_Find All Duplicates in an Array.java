public class Solution {
    public List<Integer> findDuplicates(int[] nums){
		List<Integer> list = new ArrayList<>();
		if(nums.length == 1 || nums.length == 0){
		    return list;
		}
		if(nums.length == 2){
		    if(nums[0] == nums[1]){
		        list.add(nums[0]);
		    }
		    return list;
		}
        Arrays.sort(nums);
		if(nums[0] == nums[1] && nums[1] != nums[2]){
			list.add(nums[0]);
		}
		if(nums[nums.length - 2] == nums[nums.length - 1] && nums[nums.length - 3] != nums[nums.length - 2]){
			list.add(nums[nums.length - 2]);
		}
		for(int i = 1; i < nums.length - 2; i++){
			if(nums[i] == nums[i + 1] && nums[i] != nums[i - 1] && nums[i + 1] != nums[i + 2]){
				list.add(nums[i]);
			}
		}
		return list;
    }
}