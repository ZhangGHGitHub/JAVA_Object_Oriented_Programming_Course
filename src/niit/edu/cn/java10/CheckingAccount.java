package niit.edu.cn.java10;

import java.util.Date;

/**
 * @author: 张国豪
 * @date: 2020/10/27 22:43
 * FileName: CheckingAccount
 * @version: 1.0
 * Description: 支票账户
 */
public class CheckingAccount extends AccountBank{
    private int Overdraft;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
        this.Overdraft =  5000;
    }

    public int getOverdraft() {
        return Overdraft;
    }

    public void setOverdraft(int overdraft) {
        Overdraft = overdraft;
    }

    @Override
    public String toString() {
        return "信用账户：{" + super.toString() +
                "信用额度 =" + Overdraft +
                '}';
    }

    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount(1122, 20000);
        acc.setAnnuallnterstRate(4.5);
        Date D=new Date(2020-1900, 10-1, 7);
        acc.setDateCreated(D);
        acc.deposit(1000000);
        System.out.println(acc.toString());

    }
}
