package com.yy.concurrent.base1;
/**
 * parallelStream相当于迭代器 ，是不可逆的过程
 * mapToInt---将stream转换位intStream
 */

import java.util.Arrays;
import java.util.List;

public class T4 {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(10,20,30,40);
        int res = new T4().add(values);
        System.out.println("计算结果为："+res);
    }

    public int add(List<Integer> values){
        values.parallelStream().forEach(System.out :: println);  //并行
        System.out.println("---------");
        values.stream().forEach(System.out :: println);        //非并行
        return values.parallelStream().mapToInt(i -> i).sum();                   //并发流,将转换出来的intStream求和
    }
}
