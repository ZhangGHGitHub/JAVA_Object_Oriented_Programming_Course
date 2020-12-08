package niit.edu.cn.java1111;
import java.lang.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: 张国豪
 * @date: 2020/11/11 11:11
 * FileName: Course
 * @version: 1.0
 * Description: 课程类
 */
public class Course {
    private static void divide() throws Exception
    {
        System.out.println("请输入课程编号");
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        switch (input)
        {
            case 1: System.out.println("c#编程");break;
            case 2: System.out.println("java编程");break;
            case 3: System.out.println("python编程");break;
            case 4: System.out.println("c++编程");break;
            case 5: System.out.println("jsp编程");break;
            case 6: System.out.println("js编程");break;
            case 7: System.out.println("html编程");break;
            default:System.out.println("请输入1-7");break;

        }
    }
    public static void main(String[] args) {
        try {
            divide();
        }
        catch(InputMismatchException e)
        {
            System.out.println("输入的课程编号有误，请重新输入");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            System.out.println("输入的课程编号有误，请重新输入");
            e.printStackTrace();
        }finally
        {
            System.out.println("欢迎提出建议!感谢使用本程序");
        }
    }
}
