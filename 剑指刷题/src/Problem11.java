/**
 * Created by lsc on 2018/11/16.
 * 题目：实现函数 double Power（double base，int exponent），求 base 的 exponent
 次方。不得使用库函数，同时不需要考虑大数问题。
 */


public class Problem11 {
    public static void main(String[] args) throws Exception {
        Problem11 p11 = new Problem11();
        System.out.println(p11.power(2.0, 3));
    }

    public double power(double base, int exponent) throws Exception {
        double result = 0.0;
        if (equal(base, 0.0) && exponent < 0) {
            throw new Exception("0的负数次幂没有意义");
        }
        if (exponent < 0) {
            result = 1.0 / powerWithExpoment(base, -exponent);
        } else {
            result = powerWithExpoment(base, exponent);
        }
        return result;
    }

    private double powerWithExpoment(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double result = 1.0;
        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }
        return result;
    }

    private boolean equal(double num1, double num2) {
        if ((num1 - num2 > -0.0000001) && num1 - num2 < 0.0000001) {
            return true;
        } else {
            return false;
        }
    }
}