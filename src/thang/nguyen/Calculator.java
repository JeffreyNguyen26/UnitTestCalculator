/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang.nguyen;

import java.util.StringTokenizer;

/**
 *
 * @author ACER
 */
public class Calculator {
    public static int findMax(int arr[]){  
        int max=arr[0];//arr[0] instead of 0  
        for(int i=1;i<arr.length;i++){  
            if(max<arr[i])  
                max=arr[i];  
        }  
        return max;  
    }  
    
//            public static int findMax(int arr[]){  
//        int max=0;  
//        for(int i=1;i<arr.length;i++){  
//            if(max<arr[i])  
//                max=arr[i];  
//        }  
//        return max;  
//    }  

    //method that returns cube of the given number  
    public static int cube(int n){  
        return n*n*n;  
    }  
    //method that returns reverse words   
    public static String reverseWord(String str){  
  
        StringBuilder result=new StringBuilder();  
        StringTokenizer tokenizer=new StringTokenizer(str," ");  
  
        while(tokenizer.hasMoreTokens()){  
        StringBuilder sb=new StringBuilder();  
        sb.append(tokenizer.nextToken());  
        sb.reverse();  
  
        result.append(sb);  
        result.append(" ");  
        }  
        return result.toString();  
    }  
}
