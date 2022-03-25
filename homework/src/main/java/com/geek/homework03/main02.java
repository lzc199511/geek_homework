package com.geek.homework03;

public class main02 {

    public static void main(String[] args) {

        long start=System.currentTimeMillis();

        int result = sum();

        System.out.println("异步计算结果为："+result);

        System.out.println("使用时间："+ (System.currentTimeMillis()-start) + " ms");

    }

    private static int sum() {
        return fibo(36,52);
    }

    private static int fibo(int a,int b) {
        if ( a > b){
            return a;
        }
        return fibo(a-2,b-4);
    }
}
