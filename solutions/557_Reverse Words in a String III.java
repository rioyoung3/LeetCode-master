public class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        if(str.length == 0){
            return "";
        }
		s = "";
		for(int i = 0; i < str.length - 1; i++){
			String ss = str[i];
			if(!ss.equals("")){
				s += reverseString(ss);
			}
			s += " ";
		}
		s += reverseString(str[str.length - 1]);
		return s;
    }
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