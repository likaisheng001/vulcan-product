package com.vulcan.product.core.test;

import com.vulcan.product.core.algorithms.*;
import org.junit.Test;


/**
 * 2018/1/25
 *
 * @author: likaisheng
 */

public class AlgorithmsTest {

    // 测试欧几里得算法
    @Test
    public void gcd() {
        System.out.println("########:" + Algorithms.gcd(10, 100));
    }


    // 测试二分查找算法
    @Test
    public void binarySearch() {

    }

    // 测试dijkstra双栈算术表达式
    @Test
    public void dijkstra() {
        String str = " ( 1 + ( ( 6 * 6 ) * ( 1 + 1 ) ) )";
        System.out.println("该表达式计算结果: " + Algorithms.dijkstra(str));
    }

    // 测试定容栈
    @Test
    public void fixedCapacityStackOfStrings() {
        FixedCapacityStackOfStrings fixedStack;
        fixedStack = new FixedCapacityStackOfStrings(100);
        String[] arr = new String[]{"1", "-", "100", "f"};
        for (String s : arr) {
            if (!s.equals("-")) {
                fixedStack.push(s);
            } else if (!fixedStack.isEmpty()) {
                System.out.println("弹出一个：" + fixedStack.pop());
            }
        }
        System.out.println(fixedStack.size() + " left on stack");
    }

    // 测试定容栈
    @Test
    public void fixedCapacityStack() {
        FixedCapacityStack<String> fixedStack;
        fixedStack = new FixedCapacityStack<String>(100);
        String[] arr = new String[]{"1", "-", "100", "f", "I"};
        for (String s : arr) {
            if (!s.equals("-")) {
                fixedStack.push(s);
            } else if (!fixedStack.isEmpty()) {
                System.out.println("弹出一个：" + fixedStack.pop());
            }
        }
        System.out.println(fixedStack.size() + " left on stack");
    }

    // 测试可遍历的栈
    @Test
    public void resizingArrayStack() {
        ResizingArrayStack<String> stack;
        stack = new ResizingArrayStack<String>(100);
        String[] arr = new String[]{"1", "-", "100", "f", "I"};
        for (String s : arr) {
            if (!s.equals("-")) {
                stack.push(s);
            } else if (!stack.isEmpty()) {
                System.out.println("弹出一个：" + stack.pop());
            }
        }
        System.out.println(stack.size() + " left on stack");
        for (String str : stack) {

        }
    }

    @Test
    public void stack() {
        Stack<String> s = new Stack<String>();
        String[] arr = new String[]{"1", "-", "100", "f", "I"};
        for (String str : arr) {
            if (!str.equals("-")) {
                s.push(str);
            } else if (!s.isEmpty()) {
                System.out.println(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + ")");
    }

    @Test
    public void queue() {
        Queue<String> q = new Queue<String>();
        String[] arr = new String[]{"1", "-", "100", "f", "I"};
        for (String str : arr) {
            if (!str.equals("-")) {
                q.enqueue(str);
            } else if (!q.isEmpty()) {
                System.out.println(q.dequeue() + "");
            }
        }
        System.out.println("(" + q.size() + ") left on queue" );
    }
}





