package com.kdomo.jenkinsproject.Controller;

import java.net.Proxy;

public class Test2 {
    public static void main(String[] args) {
        int reslut = 80;
        int count = 0;


        while(reslut != 1){
            reslut = resultFunction(reslut);
            count += 1;
            if(count > 10){
                count = -2;
                break;
            }
        }
        System.out.println(count);
    }


    public static int resultFunction(int result){
        String a = ""+result;
        result = 0 ;
        int temp[] = new int[a.length()];
        for(int i=0;i<temp.length;i++){
            temp[i] = Integer.parseInt(a.charAt(i)+"");
            result += (temp[i] * temp[i]);
        }
        return result;
    }
}
