public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums.length * nums[0].length != r * c){
			return nums;
		}
		if(nums.length == r){
			return nums;
		}
		int[] a = new int[r * c];
		for(int i = 0; i < nums.length; i++){
			for(int j = 0; j < nums[0].length; j++){
				a[i * nums[0].length + j] = nums[i][j];
			}
		}
		int index = 0;
		int[][] arr = new int[r][c];
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				arr[i][j] = a[index++];
			}
		}
		return arr;
    }
}