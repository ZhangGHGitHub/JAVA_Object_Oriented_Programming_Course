package niit.edu.cn.java1014;

import niit.edu.cn.java10.AccountBank;

import java.util.*;
/**
 * @author: 张国豪
 * @date: 2020/10/14 10:35
 * FileName: ATM
 * @version: 1.0
 * Description: ATM机
 */
public class ATM {
    public static void main(String[] args) {
        AccountBank[] accounts = new AccountBank[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new AccountBank(1, 100);
        }
        System.out.print("（账户id）Enter an id:");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        while (id < 0 || id > 9) {
            System.out.print("（重新输入）The if is nonExistent,please input again:");
            id = input.nextInt();
        }
        mainMenu();
        int choice = input.nextInt();
        boolean judge = choice == 1 || choice == 2 || choice == 3;
        while (judge) {
            switch (choice) {
                case 1:
                    System.out.println("（余额）The balance is "+accounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("（取多少）Enter an amount to withdraw: ");
                    double withdraw = input.nextDouble();
                    accounts[id].withDraw(withdraw);
                    break;
                case 3:
                    System.out.print("（存多少）Enter an amount to deposit:");
                    double deposit=input.nextDouble();
                    accounts[id].deposit(deposit);
                    break;
                default:break;
            }
            mainMenu();
            choice=input.nextInt();
            judge = choice == 1 || choice == 2 || choice == 3;
        }
        ATM.main(args);
    }
    public static void mainMenu(){
        System.out.println("Main menu");
        System.out.println("1:（查余额） check balance ");
        System.out.println("2:（取） withdraw ");
        System.out.println("3: （存）deposit ");
        System.out.println("4:（退出） exit ");
        System.out.print("（选择）Enter a choice: ");
    }

}
