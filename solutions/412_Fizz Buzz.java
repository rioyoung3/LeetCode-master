public class Solution {
    public static List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
			if(i % 3 != 0 && i % 5 != 0){
				list.add(i + "");
			}
			if(i % 3 == 0 && i % 5 == 0){
				list.add("FizzBuzz");
			}
			if(i % 3 == 0 && i % 5 != 0){
				list.add("Fizz");
			}
			if(i % 5 == 0 && i % 3 != 0){
				list.add("Buzz");
			}
		}
		return list;
    }
}