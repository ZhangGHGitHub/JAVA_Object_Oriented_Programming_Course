package niit.edu.cn.java10;

import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

/**
 * @author: 张国豪
 * @date: 2020/10/21 8:38
 * FileName: Pet
 * @version: 1.0
 * Description: Pet  父类，子类只能继承一个父类，其余可以用接口
 *
 */
public abstract class Pet {
    private String name ;
    private int health;
    private int love;

    public Pet()
    {}
    public Pet(String name,int health,int love)
    {
        this.name = name;
        this.health= health;
        this.love = love;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }
    	public void print() {
		System.out.print("宠物的自白：\n我的名字叫" + this.name +
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love );
	}
	public abstract void  eat();

    protected abstract void catching() ;
}
