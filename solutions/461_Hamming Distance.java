public class Solution {
    public int hammingDistance(int x, int y) {
        String str_x = Integer.toBinaryString(x);
        String str_y = Integer.toBinaryString(y);
		char[] xx = str_x.toCharArray();
		char[] yy = str_y.toCharArray();
		int length_x = xx.length;
		int length_y = yy.length;
		int count = 0;
		if(length_x < length_y){
			int distance = length_y - length_x;
			for(int i = 0; i < length_x; i++){
				if(xx[i] != yy[i + distance]){
					count++;
				}
			}
			for(int i = 0; i < distance; i++){
				if(yy[i] == '1'){
					count++;
				}
			}
		}
		else{
			int distance = length_x - length_y;
			for(int i = 0; i < length_y; i++){
				if(xx[i + distance] != yy[i]){
					count++;
				}
			}
			for(int i = 0; i < distance; i++){
				if(xx[i] == '1'){
					count++;
				}
			}
		}
		return count;
    }
}