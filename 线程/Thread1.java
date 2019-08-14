class MyRunnable implements Runnable{
    String name;
    public MyRunnable(String name){
        this.name=name;
    }
    public void run(){//实现接口的抽象方法
        for(int i=0;i<3;i++)
        System.out.println(name+":"+i);
    }
}

public class Thread1 {
    public static void main(String[] args) {

        MyRunnable mr=new MyRunnable("myRunnable");
        Thread t=new Thread(mr);//mr是实现了Runnable接口的对象
        // System.out.println(t.isAlive());
        t.start();
       // System.out.println(t.isAlive());
    }
}
