package 线程;
public class Thread8 extends Thread {
    public void run() {
        char[] val = new char[]{'文', '字', '的', '打', '印', '效', '果'};
        for (int i = 0; i < val.length; i++) {
                System.out.print(val[i]);
                try {
                    sleep(1000);
                } catch (InterruptedException ie) {
                }
        }
    }
    public static void main(String[] args) {
        Thread8 t=new Thread8();
        t.start();
    }
}
