package niit.edu.cn.java1111;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: 张国豪
 * @date: 2020/11/11 8:25
 * FileName: ATM
 * @version: 1.0
 * Description:ATM界面类
 */
public class ATM extends JFrame implements ActionListener {
    BankCard bankCard;
    JButton queryButton;
    JButton drawWithButton;
    JButton exitButton;
    JLabel infoLable;
    public ATM(BankCard bankCard)
    {
        this.bankCard = bankCard;
        init();
        /*窗体标题*/
        setTitle("天地银行|Bank");
        /*窗体大小*/
        setSize(800,500);
        /*窗体居中显示*/
        setLocationRelativeTo(null);
        /*窗体关闭按钮*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*窗体背景颜色*/
        getContentPane().setBackground(SystemColor.yellow);
        /*窗体是否可见*/
        setVisible(true);
    }
    private void init()
    {
        this.setLayout(null);
        queryButton = new JButton("查询");
        queryButton.setBounds(600,100,80,30);
        queryButton.addActionListener(this);
        this.add(queryButton);


        drawWithButton = new JButton("取款");
        drawWithButton.setBounds(600,300,80,30);
        drawWithButton.addActionListener(this);
        this.add(drawWithButton);

        exitButton = new JButton("退卡");
        exitButton.setBounds(10,400,80,30);
        exitButton.addActionListener(this);
        this.add(exitButton);

        infoLable = new JLabel("欢迎使用天地银行");
        infoLable.setBounds(220,150,200,30);
        Font font =new Font("微软雅黑",Font.BOLD,20);
        infoLable.setFont(font);
        this.add(infoLable);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==queryButton)
        {
            JOptionPane.showMessageDialog(null,bankCard.getBanlance());
        }
        if(e.getSource()==drawWithButton)
        {
             new drawWith(bankCard);
        }
        if(e.getSource()==exitButton)
        {
            JOptionPane.showMessageDialog(null,"欢迎光临");
            this.dispose();
        }
    }



    public static void main(String[] args) {
        BankCard myBankCard = new BankCard("01","01",20000);
        new ATM(myBankCard);
    }


}

class drawWith extends JFrame
{
    BankCard bankCard;
    JButton drawWithButton;
    JButton returnButton;
    public drawWith(BankCard bankCard)
    {
        this.bankCard = bankCard;
        init();
        /*窗体标题*/
        setTitle("取款界面|Bank");
        /*窗体大小*/
        setSize(800,500);
        /*窗体居中显示*/
        setLocationRelativeTo(null);
        /*窗体关闭按钮*/
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*窗体背景颜色*/
        getContentPane().setBackground(SystemColor.yellow);
        /*窗体是否可见*/
        setVisible(true);

    }
    public void init()
    {
        setLayout(null);
        drawWithButton = new JButton("1000");
        drawWithButton.setBounds(600,100,80,30);
        drawWithButton.addActionListener(this::actionPerformed);
        add(drawWithButton);

        returnButton = new JButton("返回");
        returnButton.setBounds(10,400,80,30);
        returnButton.addActionListener(this::actionPerformed);
        add(returnButton);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == drawWithButton)
        {
            bankCard.withDraw(1000);
            JOptionPane.showMessageDialog(null,"取款成功");
        }
        if(e.getSource() == returnButton)
        {
            this.dispose();
        }

    }

}
class BankCard
{
    private String id;
    private String password;
    private double banlance;
    public BankCard(String id,String password,double banlance)
    {
        this.id = id;
        this.password = password;
        this.banlance = banlance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
    /**取钱*/
    public String withDraw(double money)
    {
        if(money>this.banlance)
        {
         return "取款失败";
        }
        else
        {
            banlance -=money;
        }
        return "取款成功";
    }
    public void deposit(double money)
    {
        banlance +=money;
    }
}