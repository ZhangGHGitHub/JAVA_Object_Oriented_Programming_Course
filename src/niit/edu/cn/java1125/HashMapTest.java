package niit.edu.cn.java1125;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: 张国豪
 * @date: 2020/11/25 8:58
 * FileName: HashMapTest
 * @version: 1.0
 * Description: HashMapTest
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();
        countries.put("CN","中华人民共和国");
        countries.put("USA","美利坚合众国");
        countries.put("RU","俄罗斯联邦");
        countries.put("UK","法兰西共和国");
        countries.put("JP","日本");
        countries.put("DEU","德意志联邦共和国");
        //System.out.println(countries.get("CN"));
        countries.size();
        //System.out.println(countries.remove("JP"));
        //System.out.println(countries.remove("UK","法兰西共和国"));
        countries.containsKey("CN");
        countries.containsValue("中华人民共和国");

        for (String key:countries.keySet())
        {
            System.out.println(countries.get(key));
        }
        System.out.println(countries);
        System.out.println(countries.keySet());
        System.out.println(countries.values());

        //iterator迭代器
        //hasNext();
        //next();
        //使用迭代器进行输出
        //取出key集合
        Set keys = countries.keySet();
        Iterator it=keys.iterator();
        while(it.hasNext())
        {
            String key=(String)(it.next());
            System.out.println(countries.get(key));


        }
    }
}
class course
{
    public static void main(String[] args) {
        HashMap<String,String>  course = new HashMap<String,String>();
        course.put("Tom","CoreJava");
        course.put("John","Oracle");
        course.put("Susan","Oracle");
        course.put("Jerry","JDBC");
        course.put("Jim","Unix");
        course.put("Kevin","JSP");
        course.put("Lucy","JSP");

        course.put("Allen","JDBC");
        Set keys=course.keySet();
        //System.out.println(course.keySet());
        Iterator it = keys.iterator();
        while(it.hasNext())
        {
            String key=(String)(it.next());
            if(key.equals("Lucy"))
            {
                course.put("Lucy","CoreJava");
                System.out.println("Luck更改课程为："+course.get(key));
            }
        }
        it = keys.iterator();
        while(it.hasNext())
        {
            String key=(String)(it.next());
            System.out.println("老师："+key+"  课程："+course.get(key));
        }
        it = keys.iterator();
        while(it.hasNext())
        {
            String key=(String)(it.next());
            if("JSP".equals(course.get(key))) {
                System.out.println("教JSP课程的老师有："+key);
            }
        }
    }
}
class football
{
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(2006, "意大利");
        hm.put(2002, "巴西");
        hm.put(1998, "法国");
        hm.put(1990, "德国");
        hm.put(1986, "阿根廷");
        hm.put(1982, "意大利");
        hm.put(1978, "阿根廷");
        hm.put(1974, "德国");
        hm.put(1970, "巴西");
        hm.put(1966, "英格兰");
        hm.put(1962, "巴西");
        hm.put(1958, "巴西");
        hm.put(1954, "德国");
        hm.put(1950, "乌拉圭");
        hm.put(1938, "意大利");
        hm.put(1934, "意大利");
        hm.put(1930, "乌拉圭");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(hm.containsKey(input))
        {
            System.out.println(hm.get(input));
        }else
        {
            System.out.println("没有举办世界杯");
        }

    }
}
class Movies
{
    public static void main(String[] args) {
        HashMap<String,Integer> VariableHashMap = new HashMap<String,Integer>();
        


    }
}
