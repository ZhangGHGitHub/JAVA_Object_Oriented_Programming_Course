package niit.edu.cn.java1125;

import java.util.HashMap;

/**
 * @author: 张国豪
 * @date: 2020/12/2 8:09
 * FileName: Movie
 * @version: 1.0
 * Description: Movie
 */
public class Movie {
    public static void main(String[] args) {
        HashMap<String,Integer> movie=new HashMap<>();
        movie.put("《唐人街探案2》",155754);
        movie.put("《姜子牙》",562547);
        movie.put("《釜山行》",2455121);
        movie.put("《活着》",454514);
        movie.put("《哪吒》",76411);
        movie.put("《生化危机1》",101244);
        movie.put("《极限挑生》",2455120);
        int max=0;
        for (String key:movie.keySet()
        ) {
            if (movie.get(key)>=max) {
                max=movie.get(key);
            }
        }
        for (String key1:movie.keySet()
        ) {
            if (movie.get(key1) == max) {
                System.out.println("拥有下载量最多的电影是："+key1+"\t下载量是："+max);
            }
        }

    }
}
