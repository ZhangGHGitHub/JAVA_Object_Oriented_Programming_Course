package niit.edu.cn.java1125;

import java.util.ArrayList;

/**
 * @author: 张国豪
 * @date: 2020/12/2 8:05
 * FileName: HWString
 * @version: 1.0
 * Description:
 */
public class HWString {

    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(6);

        System.out.println("镜像："+mirror(list));
    }
    public static ArrayList mirror(ArrayList list){
        ArrayList list2=list;
        for (int i = list.size()-1; i >=0 ; i--) {
            list2.add(list.get(i));
        }
        return list2;
    }
}
