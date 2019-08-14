class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=4;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
public class Thread4 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread1 t2=new MyThread1();
        t1.setPriority(Thread.MIN_PRIORITY);//设为最低优先级
        t2.setPriority(Thread.MAX_PRIORITY);//设为最高优先级
        t1.start();
        t2.start();
    }
}
