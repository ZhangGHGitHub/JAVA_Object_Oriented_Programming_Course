package niit.edu.cn.java1111;

/**
 * @author: 张国豪
 * @date: 2020/11/4 9:12
 * FileName: niit.edu.cn.java1111.TheftproofDoor
 * @version: 1.0
 * Description: 防盗门
 */
public class TheftproofDoor extends Door implements Lock {

    @Override
    public void lockup() {
        System.out.println("扣锁，拔走钥匙");
    }

    @Override
    public void openlock() {
        System.out.println("插钥匙开锁");
    }

    public static void main(String[] args) {
        TheftproofDoor td = new TheftproofDoor();
        td.close();
        td.openlock();
    }
}
class Door{
    public void open()
    {
        System.out.println("开门");
    }
    public void close()
    {
        System.out.println("关门");
    }
}
interface Lock{
    public abstract void lockup();

    public abstract void openlock();
}