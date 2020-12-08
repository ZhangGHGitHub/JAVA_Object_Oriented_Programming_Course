package niit.edu.cn.java1118;

import niit.edu.cn.java10.Penguin;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author: 张国豪
 * @date: 2020/11/18 9:32
 * FileName: ArrayListEE
 * @version: 1.0
 * Description: ArrayList
 */
public class ArrayListEE {
    public static void main(String[] args) {
        Dog td = new Dog("大黄",90,80,"中华田园犬");
        Dog td1 = new Dog("大红",80,90,"哈士奇");
        Dog td2 = new Dog("大蓝",90,90,"泰迪");
        Dog td3 = new Dog("大金",80,90,"哈士奇");

//        ArrayList doglists = new ArrayList();
//        doglists.add(td);
//        doglists.add(td1);
//        doglists.add(td2);
//        doglists.add(td3);
//        System.out.println(doglists.size());
//        for (int i=0;i<doglists.size();i++)
//        {
//          //  String name =  doglists.get(i);
//            System.out.println(doglists.get(i).toString());
//        }
//        Dog dog=(Dog)doglists.remove(1);
//        System.out.println("删除了"+dog);

        LinkedList<Dog> linkedlist = new LinkedList<Dog>();
        linkedlist.add(td);
        linkedlist.add(td1);
        linkedlist.addFirst(td2);
        linkedlist.addLast(td3);

        for(Dog list:linkedlist)
        {
            System.out.println(list);
        }



//        Penguin p1 = new Penguin("大黄",90,80,"Q仔");
//        Penguin p2 = new Penguin("大红",80,90,"Q仔");
//        Penguin p3 = new Penguin("大蓝",90,90,"Q妹");
//        Penguin p4 = new Penguin("大金",80,90,"Q妹");
//
//        ArrayList penguinlists = new ArrayList();
//        penguinlists.add(p1);
//        penguinlists.add(p2);
//        penguinlists.add(p3);
//        penguinlists.add(p4);
//        System.out.println(penguinlists.size());
//        for (int i=0;i<penguinlists.size();i++)
//        {
//            //  String name =  doglists.get(i);
//            System.out.println(penguinlists.get(i).toString());
//        }
//        Penguin pn=(Penguin)penguinlists.remove(1);
//        System.out.println("删除了"+pn);


//11.31 11.32 11.33  11.6
    }
}
