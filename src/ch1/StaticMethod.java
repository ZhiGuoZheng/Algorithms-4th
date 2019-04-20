package ch1;

/**
 * 典型静态方法的实现
 * @author zhiguo.zheng
 * @time 2019/4/20 22:14
 */
public class StaticMethod {

    /**
     * 计算一个整数的绝对值
     * @param x 整数
     * @return 绝对值
     */
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * 计算一个浮点数的绝对值
     * @param x 浮点数
     * @return 绝对值
     */
    public static double abs(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /**
     * 判定一个数是否为素数
     * @param N 判定数
     * @return 布尔值
     */
    public static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }

        for (int i = 2; i * 2 <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 计算平方根（牛顿迭代法）
     * @param c 平方数
     * @return 平方根
     */
    public static double sqrt(double c) {
        if (c < 0) {
            return Double.NaN;
        }
        double err = 1e-15;
        double t = c;
        while (Math.abs(t - c / t) > err * t) {
            t = (c/t + t) / 2.0;
        }
        return t;
    }

    /**
     * 计算直角三角形的斜边
     * @param a 直角边1
     * @param b 直角边2
     * @return 斜边
     */
    public static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /**
     * 计算调和级数
     * @param N
     * @return
     */
    public static double harmonicSeries(int N) {
        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(abs(-7));
        System.out.println(abs(-3.5));
        System.out.println(isPrime(2));
        System.out.println(sqrt(5));
        System.out.println(hypotenuse(3, 4));
        System.out.println(harmonicSeries(7));
    }
}
