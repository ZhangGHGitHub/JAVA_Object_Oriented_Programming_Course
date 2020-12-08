package niit.edu.cn.java1125;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: 张国豪
 * @date: 2020/12/2 8:04
 * FileName: Student1
 * @version: 1.0
 * Description:
 */
public class Student1 {

    //强化班和普通班在同一个map，单独遍历普通班和强化班的方法

    private String id;
    private String name;
    public Student1(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "学生的id是：" + getId() + ",\t\t学生的姓名是：" + getName();
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> common=new HashMap<>();
        ArrayList<Student> arrayList1 = new ArrayList<Student>();
        ArrayList<Student> arrayList2 = new ArrayList<Student>();
        arrayList1.add(new Student("1","张三"));
        arrayList1.add(new Student("2","李四"));
        arrayList1.add(new Student("3","小王"));
        arrayList1.add(new Student("4","小明"));
        arrayList1.add(new Student("5","小红"));
        arrayList2.add(new Student("10","蔡文冲"));
        arrayList2.add(new Student("11","潘正阳"));
        arrayList2.add(new Student("12","张玄道"));
        arrayList2.add(new Student("13","吴昊"));
        arrayList2.add(new Student("14","张晟扬"));

        common.put("普通班",arrayList1);
        common.put("强化班", arrayList2);
        for(String key:common.keySet())
        {
            for(int i=0;i<common.get(key).size();i++)
            {
                System.out.println(common.get(key).get(i));
            }
        }



//
//        System.out.println("--------------------------------------------------");
//
//        for (String key:common.keySet()
//        ) {
//
//            if (key.substring(0,2).equals("普通")) {
//                common.get(key);
//                System.out.println("普通班" +common.get(key));
//            }
//
//        }
//        for (String key:common.keySet()
//        ) {
//
//            if (key.substring(0,2).equals("强化")) {
//                //System.out.println("强化班"+common.get(key));
//
//
//            }
//
//        }
//
    }
}
