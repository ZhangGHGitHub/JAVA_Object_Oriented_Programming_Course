package niit.edu.cn.java1125;

import java.util.ArrayList;

/**
 * @author: 张国豪
 * @date: 2020/12/2 8:03
 * FileName: CountEvent
 * @version: 1.0
 * Description: CountEvent
 */
public class CountEvent {

    public static void main(String[] args) {
        java.util.ArrayList list = new ArrayList();
        list.add("one");
        list.add("peach");
        list.add("pear");
        list.add("plum");
        int n = 0;
        for (int i = 0; i < list.size(); i++) {
            String a = list.get(i).toString();
            int count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (Character.isLetter(a.charAt(j))) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                n++;
            }
        }
        System.out.println("偶数字符串个数：" + n);
    }

    public static int countEvent(ArrayList<String> list) {
        int count = 0;
        for (Object i : list) {

        }
        return count;
    }

}
