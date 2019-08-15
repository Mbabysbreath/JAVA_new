package 线程;
/*每隔1秒输出一个换行符，每隔0.1秒输出一个整数*/
class NewLine extends Thread{
    public void run(){
        for(int i=1;i<=10;i++) {
            System.out.println();
            try {
                sleep(1000);
            } catch (InterruptedException ie) {
            }
        }
    }
}
public class Thread7 extends Thread {
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.print(i);
            try{
                sleep( 100);
            }catch(InterruptedException ie){}
        }
    }

    public static void main(String[] args) {
        Thread7 t1=new Thread7();
        NewLine n=new NewLine();
        t1.start();
        n.start();
    }
}
