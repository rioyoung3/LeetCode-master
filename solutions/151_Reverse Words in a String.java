public class Solution {
    public String reverseWords(String s) {
       s = s.trim();
        String[] str = s.split(" ");
        if(str.length == 0){
            return "";
        }
		s = "";
		for(int i = 0; i < str.length - 1; i++){
			if(!str[str.length - 1 - i].equals("")){
				s += str[str.length - 1 - i] + " ";
			}
		}
		s += str[0];
		return s;
    }
}