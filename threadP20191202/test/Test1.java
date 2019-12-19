package threadP20191202.test;

/**
 *完成继承Thread的方式创建分线程，并遍历100以内的自然数
 * 1.说明两个问题：
 * （1）我们不能通过直接调用run()的方式启动吸纳
 * （2）再启动一个线程，不可以让已经start()的线程去执行
 * 会抛出IllegalThreadStateException异常
 *
 * @author ZhaoMin
 * @date 2019/12/6 8:25
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=1;i<100;i++){
            System.out.println(getName()+":"+i);
        }
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
public class Test1 {
    public static void main(String[] args) {
        Thread thread1=new MyThread();
        MyThread2 runnable=new MyThread2();
        Thread thread2=new Thread(runnable);
        thread1.start();
        thread2.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                 //   System.out.println("1"+"2");
                    Thread.currentThread().setName("a");
                    System.out.println(Thread.currentThread().getName()+":"+0);
                }
            }
        }).start();
    }
}
