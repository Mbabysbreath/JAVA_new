package threadP20191202;

/**
 * 一、测试Thread中的常用方法：
 * 1.start():启动当前线程，调用当前线程的run()
 * 2.run():通常需要重写Thread类中的此方法，将创建的线程要执行的操作声明在此方法中
 * 3.currentThread():静态方法，返回执行当前代码的线程----》static
 * 4.getName():获取当前线程的名字
 * 5.setName()：设置当前线程的名字
 * 6.yield():释放当前CPU的执行权----》static，只让步给优先级相同或更高的线程
 * 7.join():在线程a中调用线程b的join().此时线程a进入阻塞状态，直到线程b完全执行完毕，
 *  线程a结束阻塞状态
 * 8.stop():已过时，强制结束当前线程
 * 9.sleep（long milltime）:让当前线程"睡眠"指定的milltime毫秒，在睡眠时，当前线程是阻塞状态
 * ----》static
 * 10.isAlive():判断当前线程释放存活----》boolean
 *
 * 二、线程通信常用的三个方法：不在Thread类中,在Object类中
 * wait()/notify()/nptifyAll()
 *
 * 三、线程的分类：
 * （1）守护线程：eg:gc()垃圾回收线程
 * （2）用户线程：eg:main()主线程
 * 关系：(1)守护线程依赖用户线程，当用户线程结束后，守护线程也会结束
 *      （2）若JVM中都是守护线程，当前JVM退出
 *      （3）将用户线程————》守护线程
 *          在start()方法前调用thread.setDaemon（true）
 * @author ZhaoMin
 * @date 2019/12/6 13:23
 */


public class ThreadMethodTest {
    public static void main(String[] args) {
        Thread.yield();
    }
}
