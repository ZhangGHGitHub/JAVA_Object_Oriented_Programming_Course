package niit.edu.cn.java1007;
import java.math.*;
import java.util.Scanner;

import static java.lang.Math.sqrt;
/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Equation
 * Description: 一元二次方程
 */
public class Equation {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("请输入一元二次方程的三位数");
        Scanner sc = new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
        int b4ac = b * b - 4 * a * c;
        double result1 = ((-b + Math.sqrt(b4ac)) / 2) * a;
        double result2 = ((-b - Math.sqrt(b4ac)) / 2) * a;
        if(b4ac>0)
        {
            System.out.println(result1);
            System.out.println(result2);
        }
        if(b4ac==0)
        {
            System.out.println(result1);
            System.out.println(result2);
        }
        if(b4ac<0)
        {
            System.out.println("The equation has no real roots");
        }

    }
}
