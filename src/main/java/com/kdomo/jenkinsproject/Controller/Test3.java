package com.kdomo.jenkinsproject.Controller;

public class Test3 {
    public static void main(String[] args) {
        //주어진 strs에서 접두사에서 일치하는 문자열을 반환하시오.
        //입력 strs = {"abcccc","abcdwer","abcewqq"};
        //출력 abc
        String answer = "";

        String[] strs = {"abcccc","abcdwer","abccwqq"};

        System.out.println(longestCommonPrefix(strs));

    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        StringBuilder result = new StringBuilder();
        boolean same = true;

        for(int i = 0; i < strs[0].length(); i++) { // 0~5까지
            char temp = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(strs[j].length() <= i) {
                    same = false;
                    break;
                }
                else if(temp == strs[j].charAt(i)) {
                    continue;
                }
                same = false;
                break;
            }

            if(same) result.append(temp);
            else break;
        }


        return result.toString();
    }


}
