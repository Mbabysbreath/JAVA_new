package 线程.Hero;

/**
 * @author ZhaoMin
 * @date 2019/9/20 0:02
 */
public class TestThread1 {
    public static void main(String[] args) {
        Hero gareen=new Hero();
        gareen.name="盖伦";
        gareen.hp=600;
        gareen.damage=50;

        Hero teemo =new Hero();
        teemo.name="提莫";
        teemo.hp=300;
        teemo.damage=50;

        Hero bh =new Hero();
        bh.name="赏金猎人";
        bh.hp=432;
        bh.damage=51;

        Hero lessin =new Hero();
        lessin.name="盲僧";
        lessin.hp=400;
        lessin.damage=51;

        killThread killThread1=new killThread(gareen,teemo);
        killThread1.start();
        killThread killThread2=new killThread(bh,lessin);
        killThread2.start();
    }
}
