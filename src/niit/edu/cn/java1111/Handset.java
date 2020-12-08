package niit.edu.cn.java1111;

/**
 * @author: 张国豪
 * @date: 2020/11/11 8:09
 * FileName: Handset
 * @version: 1.0
 * Description: 手机类
 */
public class  Handset {
    public String brand;
    public String type;

    public Handset() {
    }
    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void sendInfo() {
        System.out.println("发信息");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void info() {
        System.out.println("品牌" + this.brand + "型号" + this.type);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
  interface TeakePictures {
    public void takePicture();
}
  interface Network {
    public void networkConn();
}
  interface PlayWiring {
        void play(String incontent);
}

class AptitudeHandst extends Handset implements TeakePictures,Network
{

    @Override
    public void takePicture() {

    }

    @Override
    public void networkConn() {

    }
}
class CommonHandset extends Handset implements PlayWiring
{

    @Override
    public void play(String incontent) {

    }
}