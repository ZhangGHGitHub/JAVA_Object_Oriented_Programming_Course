package niit.edu.cn.java1014;

/**
 * @author: 张国豪
 * @date: 2020/10/14 9:23
 * FileName: MyInteger
 * @version: 1.0
 * Description: MyInteger  10.3                10.3 10.4 10.7 10.10
 */
public class MyInteger {
    private int value;
    public MyInteger(int value)
    {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    /**@param偶数*/
    public boolean isEven()
    {
        return isEven(value);
    }
    public static boolean isEven(int num)
    {
        return num % 2 == 0;
    }
    public static boolean isEven(MyInteger num) {
        return isEven(num.getValue());
    }
    /**@param奇数*/
    public boolean isOdd()
    {
        return isOdd(value);
    }
    public static boolean isOdd(int num)
    {
        return num % 2 != 0;
    }
//    public static boolean isPrime(int num)
//    {
//        return isOdd(num);
//    }
    /**@param素数*/
    public boolean isPrime()
    {
    return isPrime(value);
    }
    public static boolean isPrime(int num)
    {
        if ((num == 1) || (num == 2)) {
            return true;
        }
        /**@param从2开始到num的一半*/
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime(MyInteger num) {
        return isPrime(num.getValue());
    }
    public boolean equals(int num)
    {
        return (value == num);
    }
    public boolean equals(MyInteger num)
    {
        return (value == num.getValue());
    }
    public static int parseInt(char[] numbers) {
        int print = 0;
        for (int i = 0; i < numbers.length; i++) {
            print = print * 10 + (numbers[i] - 48);
        }
        return print;
    }

    public static int parseInt(String string) {
        int print = 0;
        for (int i = 0; i < string.length(); i++)
        {
            print = print * 10 + (string.charAt(i) - 48);
        }
        return print;
    }
    @Override
    public String toString() {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
    public static void main(String[] args) {
        MyInteger mi = new MyInteger(1000);
        System.out.println(mi.getValue()+"是偶数吗 "+mi.isEven());
        System.out.println(mi.getValue()+"是奇数吗 "+mi.isOdd());
        System.out.println(mi.getValue()+"是素数吗 "+mi.isPrime());

        String str="100";
        char []array = {'1','2'};
        System.out.println(MyInteger.parseInt(str));
        System.out.println(MyInteger.parseInt(array));
    }
}
