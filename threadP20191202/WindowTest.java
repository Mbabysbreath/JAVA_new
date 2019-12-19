package threadP20191202;

/**
 * 例子：创建三个窗口卖票，总票数为100张,使用继承Thread类的方法
 * 存在线程安全问题，待解决
 * @author ZhaoMin
 * @date 2019/12/2 15:15
 */
class Window extends Thread{
    //static解决了线程共用100的问题
    // 但存在线程安全问题，开始三个窗口都卖了第100号票
    private static int ticket=100;
    public Window(String name){
        super(name);
    }
    @Override
    public void run() {
        while(true){
            if(ticket>0){
                System.out.println(getName()+":卖票，票号为："+ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        Window t1=new Window("窗口1");
        Window t2=new Window("窗口2");
        Window t3=new Window("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
