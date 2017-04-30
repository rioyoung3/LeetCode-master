public class Main{
	public static void main(String[] args){
		Main main = new Main();
		System.out.println(main.reverseWords("Let's take LeetCode contest"));
	}
	// public String reverseWords(String s) {
        // s = s.trim();
        // String[] str = s.split(" ");
        // if(str.length == 0){
            // return "";
        // }
		// s = "";
		// for(int i = 0; i < str.length - 1; i++){
			// String ss = str[i];
			// if(!ss.equals("")){
				// for(int j = 0; j < ss.length(); j++){
				    // s += ss.charAt(ss.length() - 1 - j);
				// }
			// }
			// s += " ";
		// }
		// for(int i = 0; i < str[str.length - 1].length(); i++){
			// s += str[str.length - 1].charAt(str[str.length - 1].length() - 1 -i);
		// }
		// return s;
    // }
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