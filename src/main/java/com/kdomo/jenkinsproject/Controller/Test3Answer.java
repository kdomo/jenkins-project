package com.kdomo.jenkinsproject.Controller;

public class Test3Answer {
    public static void main(String[] args) {
        String answer = "";
        String[] strs = {"abcdef","abc","abccwqq"};

        for(int i=0;i<strs[0].length();i++){
            boolean same = true;
            char temp = strs[0].charAt(i);  //a b c d e f 가 각각 들어감
            for(int j=1; j<strs.length;j++){
                if(strs[j].length() <= i){ //
                    same = false;
                    break;
                }
                else if ( temp == strs[j].charAt(i)){
                    continue;
                }
                same = false;
                break;
            }

            if(same) answer = answer+temp;
            else break;

        }
        System.out.println(answer);
    }
}
