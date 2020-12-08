package niit.edu.cn.java10;
import java.lang.*;
/**
 * @author: 张国豪
 * @date: 2020/10/21 9:43
 * FileName: Car
 * @version: 1.0
 * Description: Car
 */
public class Car extends MotoVehicle{
    private int type;
    public Car(String No, String Brand, String Color ,int mileage,int type)
    {
        super.setNo(No);
        super.setBrand(Brand);
        super.setColor(Color);
        super.setMileage(mileage);
        this.type = type;
    }

    public Car(String No, String Brand, int type) {
        super.setNo(No);
        super.setBrand(Brand);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+
                "type='" + type + '\'' +
                '}';
    }
    public int calRent(int days)
    {
        int money = 0;
       switch (this.type)
       {
           case 1:money = days*600;break;
           case 2:money =  days*500;break;
           case 3:money =  days*300;break;
           case 4:money =  days*800;break;
           case 5:money =  days*1500;break;
           default:break;
       }
       this.setSummoney(money);
        return money;
    }

    public static void main(String[] args) {
        Car car = new Car("苏A~1234","别克","红色",100,1);
        System.out.println(car.toString());
        System.out.println(car.calRent(6));
    }
}
