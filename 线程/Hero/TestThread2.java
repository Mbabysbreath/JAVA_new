package 线程.Hero;

/**
 * @author ZhaoMin
 * @date 2019/9/20 0:28
 */
public class TestThread2 {
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

        Battle battle1=new Battle(gareen,teemo);//创建一个Battle对象
        //battle对象就可以实现Runnable接口，有run()方法
        //但直接调用该方法还不能启动新线程
        //必须借助线程对象的start()方法
        //所以在创建Thread对象的时候，把battle作为构造方法的参数传进去
        //这个线程启动的时候就会执行battle.run()方法了
        new Thread(battle1).start();

        Battle battle2 =new Battle(bh,lessin);
        new Thread(battle2).start();
    }
}
