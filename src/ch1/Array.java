package ch1;

import java.util.Random;

/**
 * 对数组的基本处理
 * @author zhiguo.zheng
 * @time 2019/4/20 17:40
 */
public class Array {

    /**
     * 找出数组中最大的元素
     * @param a 数组
     * @return 最大值
     */
    public static double maxValue(double[] a) {

        if (a.length == 0) {
            return 0;
        }
        double max = a[0];
        for (double v : a) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    /**
     * 计算数组元素的平均值
     * @param a 数组
     * @return 平均值
     */
    public static double avgValue(double[] a) {

        if (a.length == 0) {
            return 0;
        }

        int len = a.length;
        double sum = 0;

        for (double v : a) {
            sum += v;
        }
        return sum / len;
    }

    /**
     * 复制数组中的元素
     * @param a 待复制的数组
     * @return 复制后的数组变量
     */
    public static double[] copyArray(double[] a) {
        int len = a.length;
        double[] b = new double[len];
        for (int i = 0; i < len; i++) {
            b[i] = a[i];
        }
        return b;
    }

    /**
     * 颠倒数组中的元素
     * @param a 数组
     */
    public static void reverseArray(double[] a) {
        int len = a.length;
        for (int i = 0; i < len / 2; i++) {
            double temp = a[i];
            a[i] = a[len - 1 - i];
            a[len - 1 - i] = temp;
        }
    }

    /**
     * 矩阵相乘（方阵）
     * @param a 矩阵a
     * @param b 矩阵b
     * @return 结果c
     */
    public static double[][] mulMatrix(double[][] a, double[][] b) {
        int len = a.length;
        double[][] c = new double[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                // 计算 行i 和 列j 的点乘
                for (int k = 0; k < len; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    /**
     * 打印数组中的值
     * @param a 数组
     */
    public static void printArray(double[] a) {
        for (double v : a) {
            System.out.print(v + " ");
        }
    }

    private static double[] genArray(int len) {
        double[] a = new double[len];
        for (int i = 0; i < len; i++) {
            a[i] = new Random().nextInt(100);
        }
        return a;
    }

    public static void main(String[] args) {

        // 初始化数组
        double[] a = genArray(23);
        // 打印随机生成的数组
        Array.printArray(a);
        // 获取最大值
        System.out.println();
        double max = maxValue(a);
        System.out.println("Max Value: " + max);
        // 获取平均值
        double avg = avgValue(a);
        System.out.println("Average Value: " + avg);
        // 复制数组
        double[] c = copyArray(a);
        System.out.print("Copy Array: ");
        printArray(c);
        // 颠倒数组
        reverseArray(c);
        System.out.println();
        System.out.print("Reverse Array: ");
        printArray(c);
    }
}
