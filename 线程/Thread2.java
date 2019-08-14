class MyThread extends  Thread{//如果类继承了Thread类，就不能继承其他类了
    public void run(){//覆盖run方法
        for (int i=1;i<3;i++){
            System.out.println(super.getName()+":"+i);//super.getName()方法返回线程名称
                                                        // 形式为：Thread-号码，只有一个线程，所以本例为0开始
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
    }
}
