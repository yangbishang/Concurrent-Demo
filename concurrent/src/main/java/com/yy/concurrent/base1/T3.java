package com.yy.concurrent.base1;
/**
 *
 * Callable,有返回值，能抛异常
 */

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class T3 implements Callable<Integer> {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        T3 t = new T3();
        FutureTask<Integer> task = new FutureTask<>(t);
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("我先干点别的。。。。");

        Integer result = task.get();
        System.out.println("线程执行的结果为："+result);
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("正在进行紧张的计算。。。");
        Thread.sleep(3000);
        return 1;
    }
}
