package niit.edu.cn.java1125;

import java.util.HashMap;

/**
 * @author: 张国豪
 * @date: 2020/12/2 8:03
 * FileName: Student
 * @version: 1.0
 * Description: 学生类
 */
    public class Student {
    /*
    定义一个学生类Student，封装id和name属性，提供一个全参构造器，并覆写toSting方法。
    定义Map<String,List<Student>>类型，创建两个Map的对象，
    用来存放学校中两种不同类型的班级“普通班”和“强化班”的学生信息。
    自定义一组学生信息，将其放入不同班级，
    并对两种不同类型的班级学生信息遍历输出。（15分）*/

        private String id;
        private String name;

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

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "学生的id是：" + getId() + ",\t\t学生的姓名是：" + getName();
        }

        public static void main(String[] args) {
            HashMap<String,Student> common=new HashMap<String,Student>();
            HashMap<String,Student> intensify=new HashMap<String,Student>();
            common.put("普通1",new Student("1","张三"));
            common.put("普通2",new Student("2","李四"));
            common.put("普通3",new Student("3","小王"));
            common.put("普通4",new Student("4","小明"));
            common.put("普通5",new Student("5","小红"));

            for (String key:common.keySet()
            ) {
                System.out.println("普通班学生：   "+common.get(key));
            }

            System.out.println("--------------------------------------------------");

            intensify.put("强化1",new Student("10","蔡文冲"));
            intensify.put("强化2",new Student("11","潘正阳"));
            intensify.put("强化3",new Student("12","张玄道"));
            intensify.put("强化4",new Student("13","吴昊"));
            intensify.put("强化5",new Student("14","张晟扬"));
            for (String key:intensify.keySet()
            ) {
                System.out.println("强化班学生：   "+intensify.get(key));
            }



            for (String key:common.keySet()
            ) {

                if (key.substring(0,3).equals("普通")) {
                    System.out.println("学生：   "+common.get(key));
                }

            }

        }
}
