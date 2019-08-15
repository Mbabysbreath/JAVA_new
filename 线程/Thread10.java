package 线程;

public class Thread10 extends Thread {
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println(getName()+" :"+i);
            yield();
            try{
                sleep(1000);
            }catch(InterruptedException ie){}
        }
    }

    public static void main(String[] args) {
        Thread10 t1=new Thread10();
        Thread10 t2=new Thread10();
        t1.start();
        t2.start();
    }
}
