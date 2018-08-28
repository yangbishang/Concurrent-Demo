package com.yy.concurrent.base.T25;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
public class T6_ArrayBlockingQueue {
    static BlockingQueue<String> strs = new ArrayBlockingQueue<>(10);//有界队列(10个元素）

    static Random r = new Random();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            strs.put("a" + i);
        }

        strs.put("aaa"); //满了就会等待，程序阻塞
        //strs.add("aaa");   //满了报异常
        //strs.offer("aaa");  //不会报异常，也不会加进去，会返回boolean值
        //strs.offer("aaa", 1, TimeUnit.SECONDS);  //一段时间还加不进去就不加了

        System.out.println(strs);
    }
}
