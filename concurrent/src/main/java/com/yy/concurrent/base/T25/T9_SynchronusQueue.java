package com.yy.concurrent.base.T25;
/**
 * 一种特殊TranferQueue
 * SynchronusQueue是容量为0的队列
 *
 *
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
public class T9_SynchronusQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> strs = new SynchronousQueue<>();

        new Thread(()->{
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        strs.put("aaa"); //阻塞等待消费者消费（里面其实就是transfer）
        //strs.add("aaa");   //报错
        System.out.println(strs.size());
    }
}
