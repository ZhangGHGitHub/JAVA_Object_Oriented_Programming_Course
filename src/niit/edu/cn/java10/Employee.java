package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/22 22:18
 * FileName: Employee
 * @version: 1.0
 * Description: Employee
 */
public class Employee extends Person{
    public String office;
    public double wage;
    public MyDate date;

    public Employee(String name, String address, int number, String email, String office, double wage, MyDate date) {
        super(name, address, number, email);
        this.office = office;
        this.wage = wage;
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tEmployee" + "\n\tOfffice:" + office + "\n\twage:" + wage +"\n\tdate:"+date.getYear()+"."+date.getMonth()+"."+date.getDay();
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(20202,1,1);
        Employee emp = new Employee("张三","地球",1234567890,"1234567@163.com","123办公室",3000,date);
        System.out.println(emp.toString());
    }
}
