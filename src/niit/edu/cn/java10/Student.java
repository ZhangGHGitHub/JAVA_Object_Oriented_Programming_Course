package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/22 22:18
 * FileName: Student
 * @version: 1.0
 * Description: 学生类
 */
public class Student extends Person{
    public final static int DAYI = 1;
    public final static int DAER = 2;
    public final static int DASAN = 3;
    public final static int DASI = 4;
    public int classStation;

    public Student(String name, String address, int number, String email,int classStation) {
        super(name, address, number, email);
        this.classStation = classStation;
    }

    @Override
    public String toString() {
        return super.toString()+"\nStudent:大几："+classStation;
    }

    public static void main(String[] args) {
        Student stu = new Student("张三","地球",1234567890,"1234567@163.com",3);
        System.out.println(stu.toString());
    }
}
