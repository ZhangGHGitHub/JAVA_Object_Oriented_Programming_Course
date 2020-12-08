package niit.edu.cn.java10;

import java.util.Date;

/**
 * @author:张国豪 Date: 2020/10/7 14:07
 * FileName: AccountBank
 * Description: 9.7简单银行月利率的计算   11.3
 */
public class AccountBank {
    /** 账户*/
    private int id = 0;
    /** 余额*/
    private double balance = 0;
    /** 当前年利率*/
    private double annuallnterstRate = 0;
    /** 账户开户日期*/
    private Date dateCreated;
    public AccountBank(int id , double balance)
    {
        this.id = id;
        this.balance = balance;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getAnnuallnterstRate() {
        return annuallnterstRate;
    }

    public void setAnnuallnterstRate(double annuallnterstRate) {
        this.annuallnterstRate = annuallnterstRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**月利率*/
    public double getMonthlyInterestRate()
    {
        return balance*annuallnterstRate/12/100;
    }
    /** 取钱*/
    public void withDraw(double money)
    {
        balance = balance - money;
    }
    /**存钱*/
    public void deposit(double money)
    {
        balance = balance + money;
    }

    @Override
    public String toString() {
        return  "账户id：" + id +
                ", 余额：" + balance +
                ", 年利率：" + annuallnterstRate +
                ", 开户日期：" + dateCreated +
                ',';
    }

    public static void main(String[] args) {
        AccountBank acc = new AccountBank(1122, 20000);
        acc.setAnnuallnterstRate(4.5);
        Date D=new Date(2020-1900, 10-1, 7);
        acc.setDateCreated(D);


        System.out.println("余额："+acc.getBalance());
        acc.withDraw(2500);
        System.out.println("余额："+acc.getBalance());
        acc.deposit(3000);
        System.out.println("余额："+acc.getBalance());
        System.out.println("利率"+acc.getMonthlyInterestRate());
        System.out.println(acc.getDateCreated());


    }

}
