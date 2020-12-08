package niit.edu.cn.java10;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        CPU cpu  = new CPU();
        cpu.setSpeed(2200);

        HardDisk hardDisk = new HardDisk();
        hardDisk.setAmount(200);

        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(hardDisk);

        pc.show();
    }
}
