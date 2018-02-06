package com.vulcan.product.core.test;


import com.vulcan.product.core.algorithms.Bag;

import java.util.Random;

/**
 * 2018/2/1
 * 演示数据类型bag
 * @author: likaisheng
 */

public class BagTest {
    public static void main(String[] args) {

        Bag<Double> numbers = new Bag<Double>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbers.add(random.nextDouble() * 10);
        }
        int N = numbers.size();

        double sum = 0.0;
        for(Double dou : numbers){
            sum += dou;
        }
        double mean = sum / N;

        sum = 0.0;
        for(double dou : numbers){
            sum += (dou -mean) * (dou - mean);
        }
        double std = Math.sqrt(sum / (N -1));
        System.out.println("Mean: " + mean);
        System.out.println("std dev:" + std);
    }
}
