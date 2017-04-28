public class Solution{
	public static String complexNumberMultiply(String a, String b){
        String[] aa = a.split("\\+");
		int a_r = Integer.parseInt(aa[0]);
		int a_i = Integer.parseInt(aa[1].substring(0,aa[1].length() - 1));
		System.out.println(aa[0]);
		System.out.println(aa[1].substring(0,aa[1].length() - 1));
		
		String[] bb = a.split("\\+");
		int b_r = Integer.parseInt(bb[0]);
		int b_i = Integer.parseInt(bb[1].substring(0,bb[1].length() - 1));
		System.out.println(bb[0]);
		System.out.println(bb[1].substring(0,bb[1].length() - 1));
		
		return a_r * b_r - a_i * b_i + "+" + (a_r * b_i + a_i * b_r) + "i";
    }
}
