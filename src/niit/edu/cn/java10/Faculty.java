package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/22 22:19
 * FileName: Faculty
 * @version: 1.0
 * Description: Faculty 教员
 */
public class Faculty extends Employee{
    public static int level1 = 1;
    public static int level2 = 2;
    public static int level3 = 3;
    public static int level4 = 4;

    public int level;
    protected int OfficeHours;

    public Faculty(String name, String address, int number, String email, String office, double wage, MyDate date,int level,int OfficeHours) {
        super(name, address, number, email, office, wage, date);
        this.level = level;
        this.OfficeHours = OfficeHours;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tFaculty" + "\nlevel:" + level + "\nOfficeHours:" + OfficeHours;
    }

    public static void main(String[] args) {
        MyDate date = new MyDate(20202,1,1);
        Faculty fac = new Faculty("张三","地球",1234567890,"1234567@163.com","123办公室",3000,date,4,24);
        System.out.println(fac.toString());
    }
}
