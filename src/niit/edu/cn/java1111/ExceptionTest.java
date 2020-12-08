package niit.edu.cn.java1111;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
/**
 * @author: 张国豪
 * @date: 2020/11/11 10:30
 * FileName: ExceptionTest
 * @version: 1.0
 * Description: 异常
 */
public class ExceptionTest extends Exception {
    public static void main(String[] args) {

//            Scanner in = new Scanner(System.in);
//            System.out.print("请输入被除数:");
//            int num1 = in.nextInt();
//            System.out.print("请输入除数:");
//            int num2 = in.nextInt();
//            if(in.hasNextInt(num2))
//            {
//                if(num2!=0) {
//                    System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
//                    System.out.println("感谢使用本程序！");
//                }
//            }
//            else
//            {
//                System.out.print("请从新输入除数:");
//                num2 = in.nextInt();
//            }

        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            if(in.hasNextInt(num2))
            {
                if(num2!=0) {
                    System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));
                }
            }
        }
        catch(InputMismatchException e)
        {
            e.printStackTrace();
            System.out.println("异常");
            System.exit(1);
            /** 退出JAVA虚拟机*/
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("出错啦");
            return ;
        }
        finally
        {
            System.out.println("感谢使用本程序！");
        }
    }
}
