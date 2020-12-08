package niit.edu.cn.java1014;

import java.util.Arrays;

/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Circle版本
 * Description: 圆
 */
public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(this.getArea()>o.getArea()) {
            return 1;
        }
        else if (this.getArea()<o.getArea())
        {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        ComparableCircle[] cc = {new ComparableCircle(5),new ComparableCircle(4),new ComparableCircle(3)};
        for(ComparableCircle rec:cc) {
            System.out.println(rec);
        }
        Arrays.sort(cc);
        for(ComparableCircle rec:cc) {
            System.out.println(rec);
        }
    }
}
 class Circle {
    private double radius = 3;
    public Circle()
    {
        //方法的重载
        /*
         *@param 圆的属性之周长
         */
    }
    public Circle(double radius)        //构造方法
    {
         this.radius = radius;
    }
    public double getArea()
    {
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "ComparableCircle{ radius=" + radius + "  Area" + getArea() + "  Perimeter" +getPerimeter() +
                '}';
    }

    public static void main(String[] args) {
//    ComparableCircle circle = new ComparableCircle(5);
//    System.out.println(circle.getPerimeter());
//    System.out.println(circle.getArea());

    }
}
