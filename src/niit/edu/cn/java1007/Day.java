package niit.edu.cn.java1007;
/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Day
 * Description: 星期
 */
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        System.out.println("请输入一个数字");
        int day = new Scanner(System.in).nextInt();
        System.out.println("请输入一个数字");
        int day2 = new Scanner(System.in).nextInt();
        switch ((day+day2)%7)
        {
            case 1:System.out.println(day+"天之后是周一");break;
            case 2:System.out.println(day+"天之后是周二");break;
            case 3:System.out.println(day+"天之后是周三");break;
            case 4:System.out.println(day+"天之后是周四");break;
            case 5:System.out.println(day+"天之后是周五");break;
            case 6:System.out.println(day+"天之后是周六");break;
            case 7:System.out.println(day+"天之后是周日");break;
            default:;
        }
        //System.out.println(random);
    }
}
