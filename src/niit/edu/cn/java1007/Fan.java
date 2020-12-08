package niit.edu.cn.java1007;

/**
 * @author:张国豪 Date: 2020/10/7 14:35
 * FileName: Fan
 * Description: 9.8风扇
 */
public class Fan {
    /** 风速*/
    public final int SLOW = 1 ,MEDIUM = 2 ,FAST = 3;
    /** 风速*/
    private int speed = SLOW;
    /** 开关*/
    private boolean on = false;
    /** 半径*/
    private double radius = 5;
    /** 风扇颜色*/
    private String color = "blue";
    public Fan(){}
    public Fan(int speed ,double radius ,String color ,boolean on ){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString()
    {
        String str = "fan  ";
        if(on) {
            str +="颜色："+this.color+"半径："+this.radius+"转速："+this.speed;
        }
        else {
            str += "is off+ 颜色："+this.color+"半径："+this.radius;
        }
        return  str;
    }

    public static void main(String[] args) {
        /**，创建两个 Fan 对象。将第一个对象设置为最大速度、半径为 10、颜色为 yellow、状态为打开。
         * 将第二个对象设置为中等速度、半径为 5 、颜色为 blue、状态为关闭。
         * 通过调用它们的 toString 方法显示这些对象。*/
        Fan fan1 = new Fan(3,10,"yellow",true);
        System.out.println(fan1.toString());
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println(fan2.toString());
    }
}
