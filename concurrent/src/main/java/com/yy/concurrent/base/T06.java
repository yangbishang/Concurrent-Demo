package com.yy.concurrent.base;

public class T06 implements Runnable{
    private int count = 10;

    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            T06 t = new T06();
            new Thread(t, "THREAD" + i).start();
        }
    }
}
