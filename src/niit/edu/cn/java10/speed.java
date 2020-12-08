package niit.edu.cn.java10;

class speed {
    static int m;

    static {
        m = 888;
    }

    public static void main(String[] args) {
       speed a = null;
        System.out.println(speed.m + ":" + a.m);
    }
}