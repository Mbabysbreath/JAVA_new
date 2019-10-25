package 线程;

/**同步代码块解决线程安区问题
 * @author ZhaoMin
 * @date 2019/10/23 9:08
 */
class TicketThread implements Runnable{
    private int tikets=100;
    Object lock=new Object();
    public void run(){
        while(true){
            synchronized (lock){
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if(tikets>0){
                Thread th= Thread.currentThread();//获取当前线程对象
                String name=th.getName();//获取当前线程的名称
                System.out.println(name+"-->卖出："+tikets--);
            }else{
                break;
            }
        }
            }
}
public class TestThread {
    public static void main(String[] args) {
        TicketThread mt=new TicketThread();
        new Thread(mt,"1窗").start();
        new Thread(mt,"2窗").start();
        new Thread(mt,"3窗").start();
        new Thread(mt,"4窗").start();

    }
}
