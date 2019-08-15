package 线程;

public class Thread6 extends Thread {
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(getName()+":"+i);
            try{
                sleep(1000);
            }catch(InterruptedException ie){}
        }
    }

    public static void main(String[] args) {
        Thread6 t1=new Thread6();
        t1.start();
    }


}
