package leetcode.contest.contest185;

/**
 * @author chenyuhao
 * @version 1.0.0
 * @ClassName Leetcode5388.java
 * @createTime 2020年04月19日 10:30:00
 * @Description TODO
 */
public class Leetcode5388 {
    public static String reformat(String s) {
        if (s == null) return "";
        String nums = "";
        String letters = "";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                nums += String.valueOf(s.charAt(i));
            } else {
                letters += String.valueOf(s.charAt(i));
            }
        }

        if (nums.length() - letters.length() > 1) {
            return "";
        }
        if (letters.length() - nums.length() > 1) {
            return "";
        }
        int flag = 0;
        if (nums.length() < letters.length()) {
            flag = 1;
        }
        int a = 0, b = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == flag) {
                res += nums.charAt(a++);
            } else {
                res += letters.charAt(b++);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reformat("covid2019"));
    }

}
