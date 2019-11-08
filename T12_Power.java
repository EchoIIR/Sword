/*
题目描述
给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
保证base和exponent不同时为0
*/
class T12_Power {
    public static void main(String[] args) {
        double base = 2;
        int exponent = 3;
        double result = Power(base, exponent);
        System.out.println("result = " + result);
    }

    public static double Power(double base, int exponent) {
        double result = 1;
        if (base != 0 || exponent != 0) {

            for (int i = 1; i <= Math.abs(exponent); i++) {
                result = result * base;
            }
            if (exponent > 0) {
                return result;
            } else if (exponent < 0) {
                result = 1 / result;
                return result;
            } else {
                result = 1;
                return result;
            }
        } else {// base和exponent同时为0
            return 0;
        }

    }
}
