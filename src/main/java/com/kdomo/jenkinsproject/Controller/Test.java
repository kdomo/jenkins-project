package com.kdomo.jenkinsproject.Controller;

public class Test {

    public static void main(String[] args) {
        int n = 423;
        int desc;
        int asc;
        String a = ""+n;
        int temp[] = new int[a.length()];
        int temp2;

//        for(int i=0;i<a.length();i++){
//            temp[i] = Integer.parseInt(a.charAt(i));
//        }

        for(int i=0;i<a.length();i++){
           temp[i] =  Integer.parseInt(a.substring(i,i+1));
        }
//        System.out.println(temp.length);
        for(int j=0;j<temp.length;j++){
            for(int k=0;k<temp.length-1-j;k++){
                if(temp[j] > temp[j+1]){
                    temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }
        for(int t : temp){
            System.out.println(t);
        }

        for(int j=0;j<temp.length;j++){
            for(int k=0;k<temp.length-1-j;k++){
                if(temp[j] < temp[j+1]){
                    temp2 = temp[j];
                    temp[j] = temp[j+1];
                    temp[j+1] = temp2;
                }
            }
        }
        for(int t : temp){
            System.out.println(t);
        }






//        for(int j=0;j<temp.length;j++){
//            for(int k=1;k<temp.length;k++){
//                if(temp[i] > temp[k]){
//
//                }
//            }
//
//        }
    }
}
