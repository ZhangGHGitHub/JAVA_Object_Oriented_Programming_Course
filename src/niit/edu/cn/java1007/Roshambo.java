package niit.edu.cn.java1007;
import java.math.*;
/**
 * @Author:张国豪
 * Date: 2020/10/7 10:41
 * FileName: Roshambo
 * Description: 剪刀石头布
 */
import java.util.Scanner;

public class Roshambo {

    public static void main(String[] args) {
         int computerGuess;
         int scissor = 0;
         int rock = 1;
         int paper = 2;
         computerGuess = (int)(Math.random()*3)+1;
        System.out.println("请输入剪刀石头或者布");
        int userGuess = new Scanner(System.in).nextInt();
        if(computerGuess == scissor)
        {
            if(userGuess == scissor)
            {
                System.out.println("The computer is scissor.");
                System.out.println("You are scissor too.");
                System.out.println("It is a draw");
            }
            else if(userGuess == rock)
            {
                System.out.println("The computer is scissor.");
                System.out.println("You are rock.");
                System.out.println("You won");
            }
            else if(userGuess == paper)
            {
                System.out.println("The computer is scissor.");
                System.out.println("You are paper.");
                System.out.println("You lost");
            }
        }
        else if(computerGuess == rock)
        {
            if(userGuess == scissor)
            {
                System.out.println("The computer is rock.");
                System.out.println("You are scissor.");
                System.out.println("You lost");
            }
            else if(userGuess == rock)
            {
                System.out.println("The computer is rock.");
                System.out.println("You are rock too.");
                System.out.println("It is a draw");
            }
            else if(userGuess == paper)
            {
                System.out.println("The computer is rock.");
                System.out.println("You are paper.");
                System.out.println("You won");
            }
        }
        else
        {
            if(userGuess == scissor)
            {
                System.out.println("The computer is paper.");
                System.out.println("You are scissor.");
                System.out.println("You won");
            }
            else if(userGuess == rock)
            {
                System.out.println("The computer is paper.");
                System.out.println("You are rock.");
                System.out.println("You lost");
            }
            else if(userGuess == paper)
            {
                System.out.println("The computer is paper.");
                System.out.println("You are paper too.");
                System.out.println("It is a draw");
            }
        }
        if(userGuess >paper || userGuess < scissor)
        {
            System.out.println("Error:Invalid Guess");
            System.exit(1);
        }
       // userGuess.close();

    }
}
