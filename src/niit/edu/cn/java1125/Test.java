package niit.edu.cn.java1125;

import java.util.ArrayList;

/**
 * @author: 张国豪
 * @date: 2020/11/25 8:24
 * FileName: Test
 * @version: 1.0
 * Description: test
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Dallas");
        list.add("Denver");
        list.add("Dallas");
        list.add("Austin");
        list.add("Dallas");

        //list.add(new java.util.DateO);
        String city = list.get(0);
       // list.set(3,"Dallas");
       // System.out.println(list.get(1));

        for(int j=0;j<list.size();j++)
        {
            System.out.println(list.get(j));
        }
        for (int i = 0;i < list.size();i++) {
            list.remove("Dallas");
        }
        System.out.println("移除后");
        for(int j=0;j<list.size();j++)
        {
            System.out.println(list.get(j));
        }
    }


}
