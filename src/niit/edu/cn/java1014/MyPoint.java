package niit.edu.cn.java1014;

/**
 * @author: 张国豪
 * @date: 2020/10/14 10:13
 * FileName: MyPoint
 * @version: 1.0
 * Description: MyPoint 10.4
 */
public class MyPoint {
    private double x;
    private double y;
    public MyPoint()
    {
        x = 0;
        y = 0;
    }
    public MyPoint(double x,double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distance(MyPoint zhidingMp)
    {
    return distance(this,zhidingMp);
    }
    public static double distance(MyPoint mp1 ,MyPoint mp2)
    {
        /**
         * 点到点距离公式：设两点坐标为A
         * （x1，y1）B（x2，y2）AB=根号下（(x1-x2)^2+(y1-y2)^2）
         * */
       double m = Math.pow((mp1.x - mp2.x),2) + Math.pow((mp1.y - mp2.y),2);
       return Math.sqrt(m);
    }

    public static void main(String[] args) {
        MyPoint mp1 = new MyPoint(5,5);
        MyPoint mp2 = new MyPoint();
        System.out.println("第一个点：("+mp1.getX()+","+mp1.getY()+")\n第一个点到第二个点的距离为："+mp1.distance(mp2));
        //System.out.println("第一个点：("+mp1.getX()+","+mp1.getY()+")\n第一个点到第二个点的距离为："+MyPoint.distance(mp1,mp2));

    }
}
