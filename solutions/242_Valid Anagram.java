public class Solution {
    public static boolean isAnagram(String s, String t){
		int[] arr = new int[26];
		int[] arr1 = new int[26];
		for(int i = 0; i < s.length(); i++){
			int n = (int)(s.charAt(i) - 97);
			arr[n]++;
		}
		for(int i = 0; i < t.length(); i++){
			int n = (int)(t.charAt(i) - 97);
			arr1[n]++;
		}
		
		for(int i = 0; i < 26; i++){
			if(arr[i] != arr1[i]) return false;
		}
		return true;
	}
}