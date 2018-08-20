package com.yy.concurrent.base;
/**
 * 分析一下这个程序的输出
 * @author mashibing
 */
public class T05 implements Runnable{
    private int count = 10;

    public /*synchronized*/ void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {
        T05 t = new T05();
        for(int i=0; i<5; i++) {
            new Thread(t, "THREAD" + i).start();
        }
    }
}
