package niit.edu.cn.java10;

/**
 * @author: 张国豪
 * @date: 2020/10/14 8:56
 * FileName: testDog
 * @version: 1.0
 * Description: testDog
 */
public class TestDog extends Pet{
//    private String name ;
//    private int health;
//    private int love;
    private String strain;

    public TestDog(String name,int health,int love,String strain){
        super(name,health,love);
        this.strain = strain;
    }
    @Override
    public void  print()
    {
        super.print();
     System.out.println("，我的品种是"+this.getStrain());
    }

    @Override
    public void eat() {
        if(getHealth()>100) {
            setHealth(getHealth() + 3);
            System.out.println("狗狗健康加三");
        }
        else {
            System.out.println("狗打了个饱嗝，说饱了");
        }
    }

    @Override
    protected void catching() {
        System.out.println("play");
    }
//    public TestDog(String name, int health, int love, String strain)
//    {
//        this.name = name;
//        this.health = health;
//        this.love = love;
//        this.strain = strain;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getHealth() {
//        return health;
//    }
//
//    public void setHealth(int health) {
//        this.health = health;
//    }
//
//    public int getLove() {
//        return love;
//    }
//
//    public void setLove(int love) {
//        this.love = love;
//    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

//    @Override
//    public String toString()
//    {
//        String str = "狗名：" + name + "，健康度：" + health + "，亲密度：" + love + ",品种：" + strain;
//        return str;
//    }

//    public static void main(String[] args) {
//        TestDog testDog = new TestDog();
//        testDog.setName("唐僧");
//        testDog.setHealth(99);
//        testDog.setLove(99);
//        testDog.setStrain("拉布大多");
//        System.out.println(testDog);
//    }
}
