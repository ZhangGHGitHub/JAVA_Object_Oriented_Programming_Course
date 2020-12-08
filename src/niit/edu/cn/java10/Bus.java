package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/21 9:43
 * FileName: Bus
 * @version: 1.0
 * Description: Bus
 */
public class Bus extends Car {
    private int SeatCount;
//    public Bus(String No, String Brand, String Color ,int mileage,int seatCount)
//    {
//        super.setNo(No);
//        super.setBrand(Brand);
//        super.setColor(Color);
//        super.setMileage(mileage);
//        this.SeatCount = seatCount;
//    }

    public Bus(String No, String Brand, String Color, int mileage, int type,int seatCount) {
        super(No, Brand, Color, mileage, type);
        this.SeatCount = seatCount;
    }

    public Bus(String No, String Brand, int seatCount) {
        super(No, Brand,seatCount);
        this.SeatCount = seatCount;
    }

    public int getSeatCount() {
        return SeatCount;
    }

    public void setSeatCount(int seatCount) {
        SeatCount = seatCount;
    }

    @Override
    public int calRent(int days)
    {
        int money = 0;
        if (this.SeatCount <= 16) {
              money = days* 800;
        } else if (this.SeatCount > 16) {
            money = days*1500;
        }

        this.setSummoney(money);
        return money;
    }
    @Override
    public String toString() {
        return super.toString() +
                "SeatCount=" + SeatCount +
                '}';
    }

    public static void main(String[] args) {
        Bus car = new Bus("苏A~1234","依维柯","红色",100,1,10);
        System.out.println(car.toString());
    }
}
