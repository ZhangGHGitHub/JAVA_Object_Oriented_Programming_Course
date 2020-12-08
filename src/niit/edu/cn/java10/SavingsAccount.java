package niit.edu.cn.java10;

import java.util.Date;

/**
 * @author: 张国豪
 * @date: 2020/10/27 22:42
 * FileName: SavingsAccount
 * @version: 1.0
 * Description: 存储账户
 */
public class SavingsAccount extends AccountBank{
    public SavingsAccount(int id , double balance)
    {
        super(id,balance);
    }

    @Override
    public String toString() {
        return "储蓄账户：{"+super.toString()+"}";
    }

    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount(1122, 20000);
        acc.setAnnuallnterstRate(4.5);
        Date D=new Date(2020-1900, 10-1, 7);
        acc.setDateCreated(D);
        acc.deposit(1000000);
        System.out.println(acc.toString());
    }
}
