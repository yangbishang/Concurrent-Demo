package com.yy.concurrent.base1;

/**
 *匿名内部类的方式启动线程
 */
public class T2 {
    public static void main(String[] args) {

        new Thread(){
            public void run(){
                System.out.println("thread1 start ... ");
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread2 start .... ");
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("runnable");
            }
        }){
            public void run(){
                System.out.println("sub");
            }
        }.start();

    }
}
