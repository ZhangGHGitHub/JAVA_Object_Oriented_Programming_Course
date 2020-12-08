package niit.edu.cn.java1007;
/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Circle版本
 * Description: 圆
 */
public class Circle {
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

    public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println(circle.getPerimeter());
    System.out.println(circle.getArea());


    }
}
