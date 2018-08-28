package com.yy.concurrent.base.T26;

import java.util.concurrent.Executor;
public class T1_MyExecutor implements Executor{
    public static void main(String[] args) {
        new T1_MyExecutor().execute(()->System.out.println("hello executor"));
    }

    @Override
    public void execute(Runnable command) {
        //new Thread(command).run();
        command.run();

    }
}
