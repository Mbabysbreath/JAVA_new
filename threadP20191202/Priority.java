package threadP20191202;

/**
 * 1.创建线程的方法：
 * （1）继承Thread类：
 *     a.创建一个继承于Thread类的子类
 *     b.重写Thread类的run()-->将此线程执行的操作声明在run()中
 *     c.创建Thread类的子类的对象
 *     d.通过此对象调用start()
 *
 * （2）实现Runnable接口ThreadTest1
 * 2.线程常见的方法：见ThreadMethodTest.java
 * 3.线程的优先级：
 *   （1）MAX_PRIORITY:10
 *   （1）MAX_PRIORITY:1
 *   （1）MAX_PRIORITY:5
 *
 *  （1）getPriority();获取线程的优先级
 *  （2）setPriority(int p);设置线程的优先级
 *  (3)说明：高优先级的线程要抢占低优先级线程的CPU执行权，
 *           但是只是从概率上来讲，高优先级的线程高概率的情况下被执行，
 *           并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行
 * @author ZhaoMin
 * @date 2019/12/2 14:23
 */
class MyThread1 extends Thread{
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run() {
        System.out.println("第一种创建线程");
        for(int i=0;i<20;i++){
            if(i%2==0)
            System.out.println(getName()+": 优先级："+getPriority()+" "+i);
        }

    }
}
public class Priority{
    public static void main(String[] args) {
        //设置线程名称：1：setName() 2:构造方法
        MyThread1 t1=new MyThread1("线程1");
       // t1.setName("线程1");
        //设置分线程的优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        //匿名内部类创建线程：如果改线程只使用一次
       /* new Thread(){
            @Override
            public void run() {
                System.out.println("匿名内部类创建线程");
                System.out.println(getName()+":"+getPriority());
            }
        }.start();*/
        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i=0;i<20;i++){
            if(i%2==1){
                System.out.println(Thread.currentThread().getName()+"： 优先级："+
                        Thread.currentThread().getPriority()+" :"+i);
            }
        }

    }

}
