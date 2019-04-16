package Ch1;

/**
 * Greatest Common Divisor
 * 欧几里得算法（求两个正整数的最大公约数）
 *
 * @author 郑智国 (zhengzhiguo7@gmail.com)
 * @time 2019/4/16 18:35
 */
public class GCD {

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }

    public static void main(String[] args) {
        System.out.println(gcd(1997, 615));
    }
}
