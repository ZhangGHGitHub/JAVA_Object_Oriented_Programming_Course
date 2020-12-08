package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/21 11:13
 * FileName: Person
 * @version: 1.0
 * Description: 11.2 11.3
 */
public class Person {
    public String name;
    public String address;
    public int number;
    public String email;

    public Person(String name, String address, int number ,String email)
    {
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
    }

    @Override
    public String toString() {
        return "姓名:" + name + "\n地址:" + address + "\n电话号码:" + number + "\n邮箱账号:" + email;
    }

    public static void main(String[] args) {
        Person p = new Person("张三","地球",1234567890,"1234567@163.com");
        System.out.println(p.toString());
    }
}
