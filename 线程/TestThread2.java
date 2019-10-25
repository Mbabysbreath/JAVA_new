package 线程;

/**
 * 同步方法解决线程安全问题
 * 静态方法也可以用synshronized修饰
 * @author ZhaoMin
 * @date 2019/10/24 11:57
 */
//定义Ticket1类实现Runnable接口
class Ticket1 implements Runnable{
    private  int tickets=10;
    public void run(){
        while(true){
            saleTickets();
            if(tickets<=0){
                break;
            }
        }
    }
//定义一个saleTickets()同步方法
    private  synchronized void saleTickets() {
        if(tickets>0){
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+
            "-->卖出票："+tickets--);
        }
    }
}
public class TestThread2 {
    public static void main(String[] args) {
        Ticket1 ticket=new Ticket1();//创建Ticket对象
        //创建并开启四个线程
        new Thread(ticket,"线程一").start();
        new Thread(ticket,"线程二").start();
        new Thread(ticket,"线程三").start();
        new Thread(ticket,"线程四").start();
    }
}
