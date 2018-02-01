package com.vulcan.product.core.algorithms;

/**
 * 2018/1/25 算法库
 *
 * @author: likaisheng
 */
public class Algorithms {
    /**
     * 欧几里得算法
     *
     * @param p
     * @param q
     * @return
     */
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    /**
     * 二分查找算法
     *如果数组存在要查找的值，并且存在多个，该算法随机返回一个满足条件的下标
     * @param target 需要查找的数据
     * @param nums   有序数组
     * @return 如何找到，返回元素下标；如果找不到，返回-1
     */
    public static int binarySearch(int target, int[] nums) {
        // 数字必须是有序的
        int head = 0;
        int tail = nums.length - 1;

        while (head <= tail) {

            int mid = head + (tail - head)/2;
            int tmp = nums[mid];

            if(target == tmp){
                return mid;
            }else if(target > tmp){
                head = mid + 1;
            }else if(target < tmp){
                tail = mid - 1;
            }
        }
        return -1;
    }
    /**
     * 二分查找算法
     * 如果数组存在要查找的值，并且存在多个，该算法返回第一次出现的下标
     * @param target 需要查找的数据
     * @param nums   有序数组
     * @return 如何找到，返回元素下标；如果找不到，返回-1
     */
    public static int binarySearch2(int target, int[] nums) {
        // 数字必须是有序的
        int head = 0;
        int tail = nums.length - 1;
        int result = -1;

        while (head <= tail) {

            int mid = head + (tail - head)/2;
            int tmp = nums[mid];

            if(target == tmp){
                result = mid;
                tail = mid - 1;
            }else if(target > tmp){
                head = mid + 1;
            }else if(target < tmp){
                tail = mid - 1;
            }
        }
        return result;
    }
}
