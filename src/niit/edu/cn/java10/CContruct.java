package niit.edu.cn.java10;

public class CContruct {
    public static void  main(String[] args) {
        A a = new A(3);
        fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();



    }

}
class A extends B{
    public A(int t){
        System.out.println("A's constructor  is   invoked");
    }
}
class B{
      public B(){
          System.out.println("B's constructor  is   invoked");
      }
}
class fruit
{
    public fruit(){
        System.out.println("fruit's constructor  is   invoked");
    }
}

class Orange extends fruit
{
    public Orange(){
        System.out.println("Orange's constructor  is   invoked");
    }
}

class Apple extends fruit
{
    public Apple(){
        System.out.println("Apple's constructor  is   invoked");
    }
}

class GoldenDelicious extends Apple
{
    public GoldenDelicious(){
        System.out.println("GoldenDelicious's constructor  is   invoked");
    }
}

class McIntosh extends Apple
{
    public McIntosh(){
        System.out.println("McIntosh's constructor  is   invoked");
    }
}