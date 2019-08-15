package 线程;

public class Thread9 extends Thread {
    public void run(){
            System.out.println("休息中...");
            try {
                sleep(1000);

            } catch (InterruptedException ie) {
                System.out.println("谁叫我啊");
            }
        }

    public static void main(String[] args) {
        Thread9 t=new Thread9();
        t.start();
        t.interrupt();
    }
}
