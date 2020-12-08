package niit.edu.cn.java1125;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author: 张国豪
 * @date: 2020/11/25 8:40
 * FileName: Exercise11_06
 * @version: 1.0
 * Description:
 */
public class Exercise11_06 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Loan());
        list.add(new Date());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
class Loan
{

}
