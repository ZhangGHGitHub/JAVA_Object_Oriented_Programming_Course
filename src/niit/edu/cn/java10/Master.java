package niit.edu.cn.java10;

/**
 * @author: ?????
 * @date: 2020/10/28 9:06
 * FileName: Master
 * @version: 1.0
 * Description: Master
 */
public class Master extends Pet{
    private String name;
    private double money;

    public Master(String a,int health,int love,String name,double money) {
        super();
    this.name=name;
    this.money=money;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {

    }
    @Override
    protected void catching() {

    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    public void feed(Penguin p)
    {
        p.eat();
    }
    public Pet getPet(String typeId)
    {
        Pet pet;
        pet = new TestDog("????",78,87,"???");
            if(typeId.equals(1))
            {

            }
            return pet;
    }
    public void play(Pet pet)
    {
        if(pet instanceof TestDog)
        {
            TestDog dog=(TestDog)pet;
            dog.catching();
        }
        if(pet instanceof Penguin)
        {
            Penguin pen=(Penguin)pet;
            pen.catching();
        }
    }

}
