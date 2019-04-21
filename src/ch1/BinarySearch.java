package ch1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 二分查找法
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/4/17 15:56
 */
public class BinarySearch {

    public static int rank(int key, int[] a) {

        // 递归实现
//        return rank(key, a, 0, a.length - 1);

        int lo = 0;
        int hi = a.length - 1;

        // key is in a[lo..hi] or not present
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归实现 二分查找
     * @param key 查找元素
     * @param a 数组
     * @param lo 低位索引
     * @param hi 高位索引
     * @return -1 或者索引位置
     */
    private static int rank(int key, int[] a, int lo, int hi) {
        // 如果 key 存在于 a 中，它的索引不会小于 lo 且不会大于 hi
        if (lo > hi) {
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {

        // 指定文本文件:第一个数字为 key, 后面的为待查找的数据集
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            // 不存在的话将 key 打印出来
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);
            }
        }
    }
}
