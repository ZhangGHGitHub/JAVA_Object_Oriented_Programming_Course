package niit.edu.cn.java10;
import java.util.Scanner;

/**
 * @author: 张国豪
 * @date: 2020/10/21 10:06
 * FileName: CarRental
 * @version: 1.0
 * Description: 租车类
 */
public class                                                                                                                                                                                                                                                                                                                       CarRental {
        public static void main(String[] args) {
            String no,brand,mtype;
            int seatCount,days,rent,type;
            Car car;
            Bus bus;
            Scanner input = new Scanner(System.in);
            System.out.println("欢迎您来到汽车租赁公司！");
            System.out.print("请输入要租赁的天数：");
            days=input.nextInt();
            System.out.print("请输入要租赁的汽车类型（1：轿车      2、客车）:");
            mtype = input.next();
            if("1".equals(mtype))
            {
                System.out.print("请输入要租赁的汽车品牌（1、宝马    2、别克）:");
                brand=input.next();
                System.out.print("请输入轿车的型号");
                if("1".equals(brand))
                {
                    System.out.print("1、550i：");
                } else {
                    System.out.print("2、商务舱GL8  3、林荫大道");
                }
                type = input.nextInt();
                System.out.println(type);
                no="京BK5543";//简单起见，直接指定汽车牌号
                System.out.println("分配给您的汽车牌号是:"+no);
                car =new Car(no,brand,type);
                rent=car.calRent(days);
            }
            else{
                System.out.print("请输入要租赁的客车品牌（1、金杯 2、金龙）:");
                brand=input.next();
                System.out.print("请输入客车的座位数:");
                seatCount=input.nextInt();
                no="京AU8769";//简单起见，直接指定汽车牌号
                System.out.println("分配给您的汽车牌号是:"+no);
                bus=new Bus(no,brand,seatCount);
                rent=bus.calRent(days);
            }
            System.out.println("顾客您好！您需要支付的租赁费用是"+rent);

        }
}
