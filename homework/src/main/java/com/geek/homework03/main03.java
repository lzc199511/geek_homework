package com.geek.homework03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main03 {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();

        int result = sum();

        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

    }

    private static int sum() {
        String a = "12!@#$%^370/";
        return fibo(a);
    }

    private static int fibo(String a) {
        Pattern pattern = Pattern.compile("[0-9*]");
        Matcher isNum = pattern.matcher(a);
        if (!isNum.matches()){
            String result=a.replaceAll("[0-9]","");
            return result.length();
        }
        return a.length();
    }
}
