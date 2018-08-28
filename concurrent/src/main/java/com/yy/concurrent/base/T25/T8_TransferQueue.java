package com.yy.concurrent.base.T25;
/**
 * 举个例子：
 * 前面说的情况：一般生产者生产了一个物品的话，都会往队列里面丢，然后消费者去队列里面取
 * 但是TransferQuese不同
 * 生产者生产了一个物品后，直接丢给消费者，如果此时没有消费者，就会堵塞——只限于用transfer()函数时
 * add,put等如果没有消费者就直接丢队列里面了
 *
 */

import java.util.concurrent.LinkedTransferQueue;
public class T8_TransferQueue {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<String> strs = new LinkedTransferQueue<>();

		/*new Thread(() -> {
			try {
				System.out.println(strs.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();*/

        strs.transfer("aaa");

//        strs.put("aaa");


        new Thread(() -> {
            try {
                System.out.println(strs.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
