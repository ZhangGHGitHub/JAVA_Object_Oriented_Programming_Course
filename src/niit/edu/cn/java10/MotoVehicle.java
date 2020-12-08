package niit.edu.cn.java10;

import java.awt.*;

/**
 * @author: 张国豪
 * @date: 2020/10/21 9:43
 * FileName: MotoVehicle
 * @version: 1.0
 * Description: 机动车类
 */
public class MotoVehicle {
    private String No;
    private String Brand;
    private String Color;
    private int Mileage;
    public int Summoney;
    public MotoVehicle(String No, String Brand, String Color ,int mileage)
    {
        this.No = No;
        this.Brand = Brand;
        this.Color = Color;
        this.Mileage = mileage;
    }

    public MotoVehicle() {
        this.No = "车牌号";
        this.Brand = "品牌";
        this.Color = "颜色";
        this.Mileage = 0;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMileage() {
        return Mileage;
    }

    public void setMileage(int mileage) {
        Mileage = mileage;
    }

    public int getSummoney() {
        return Summoney;
    }

    public void setSummoney(int Summoney) {
        this.Summoney += Summoney;
    }

    @Override
    public String toString() {
        return "MotoVehicle{" +
                "No=" + No +
                ", Brand='" + Brand + '\'' +
                ", Color='" + Color + '\'' +
                ", Mileage=" + Mileage +
                ", SumMoney=";
    }

    public static void main(String[] args) {

    }
}
