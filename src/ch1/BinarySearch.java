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

    public static void main(String[] args) {

        // 指定文本文件:第一个数字为 key, 后面的为待查找的数据集
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);
            }
        }
    }
}
