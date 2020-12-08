package niit.edu.cn.java1007;
/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Random
 * Description: 随机数
 */
import java.math.*;
public class Random {
    public static void main(String[] args) {
        int random = (int)(Math.random()*12+1);
        switch (random)
        {
            case 1:System.out.println("一月");;break;
            case 2:System.out.println("二月");break;
            case 3:System.out.println("三月");break;
            case 4:System.out.println("四月");break;
            case 5:System.out.println("五月");break;
            case 6:System.out.println("六月");break;
            case 7:System.out.println("七月");break;
            case 8:System.out.println("八月");break;
            case 9:System.out.println("九月");break;
            case 10:System.out.println("十月");break;
            case 11:System.out.println("十一月");break;
            case 12:System.out.println("十二月");break;
            default:;
        }
        //System.out.println(random);
    }
}
