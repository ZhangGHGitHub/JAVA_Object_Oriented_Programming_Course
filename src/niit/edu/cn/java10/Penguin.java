package niit.edu.cn.java10;
/**
 * 宠物企鹅。
 * @author 北大青鸟
 */
public class Penguin extends Pet {
//	String name = "无名氏"; // 昵称
//	int health = 100; // 健康值
//	int love = 0; // 亲密度
	String sex = "Q仔"; // 性别
	public Penguin(String name,int health,int love,String sex)
	{
		super(name,health,love);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) throws Exception {
		if("Q妹".equals(sex)||"Q仔".equals(sex)) {
			this.sex = sex;
		}else
		{
			throw new Exception("性别只能是Q妹或者是Q仔");
		}
	}

	/**
	 * 输出企鹅的信息。
	 */
	@Override
	public String toString()
	{
		String str ="宠物的自白：\n我的名字叫" + this.getName() +
				"，健康值是"	+ this.getHealth() + "，和主人的亲密度是"
				+ this.getLove() + "，性别是 " + this.sex + "。";
		return str;
	}
	@Override
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.getName() +
				"，健康值是"	+ this.getHealth() + "，和主人的亲密度是"
				+ this.getLove() + "，性别是 " + this.sex + "。");
	}
	@Override
	public void eat()
	{
		if(getHealth()>100) {
			setHealth(getHealth() + 3);
			System.out.println("企鹅健康加三");
		}
		else {
			System.out.println("企鹅打了个饱嗝，说饱了");
		}
	}

	@Override
	protected void catching() {

	}

	public void  swimming()
	{
		setHealth(getHealth()-5);
		setLove(getLove()+5);
	}

}

