public class Solution {
    public String reverseString(String s) {
       char[] arr = s.toCharArray();
       for(int i = 0; i < arr.length / 2; i++){
           char ch = arr[i];
           arr[i] = arr[arr.length - 1 - i];
           arr[arr.length - 1 - i] = ch;
       }
       return new String(arr);
    }
}