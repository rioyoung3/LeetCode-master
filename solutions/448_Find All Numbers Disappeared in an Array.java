public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if(nums.length == 0){
		    return list;
		}
        Arrays.sort(nums);
		int index = 1;
		while(nums[0] > index){
			list.add(index++);
		}
		index = nums.length;
		while(nums[nums.length - 1] < index){
			list.add(index--);
		}
		for(int i = 0; i < nums.length - 1; i++){
			while(nums[i + 1] - nums[i] > 1){
				list.add(++nums[i]);
			}
		}
		return list;
    }
}