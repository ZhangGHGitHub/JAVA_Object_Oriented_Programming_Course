package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/27 10:11
 * FileName: TestMain
 * @version: 1.0
 * Description: TestMain
 */
public class TestMain {
    public static void main(String[] args) { Penguin p = new Penguin("zs",65,80,"男");
    p.print();
    Master master =new Master("zs",65,80,"男",330.2);
    master.feed(p);

    }

}
