package com.yy.concurrent.base1;

/**
 * Runnable是作为线程任务存在的
 */
public class T1 implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("thread running");

        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new T1());
        thread.start();
    }
}
