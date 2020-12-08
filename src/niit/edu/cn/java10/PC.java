package niit.edu.cn.java10;

public class PC {
    CPU cpu;
    HardDisk HD;

     public void setCPU(CPU cpu){
        this.cpu = cpu;
    }
    public  void setHardDisk(HardDisk h){
        this.HD = h;
    }
    public void show(){
        System.out.println(cpu.getSpeed() + "," + HD.getAmount());
    }
}