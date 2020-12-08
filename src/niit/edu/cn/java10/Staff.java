package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/22 22:18
 * FileName: Staff
 * @version: 1.0
 * Description: Staff
 */
public class Staff extends Employee{
    protected String chenghao;

    public Staff(String name, String address, int number, String email, String office, double wage, MyDate date,String chenghao) {
        super(name, address, number, email, office, wage, date);
        this.chenghao = chenghao;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tStaff \n\tchenghao: " + chenghao;
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(20202,1,1);
        Staff staff = new Staff("张三","地球",1234567890,"1234567@163.com","123办公室",3000,date,"高级教师");
        System.out.println(staff.toString());
    }
}
