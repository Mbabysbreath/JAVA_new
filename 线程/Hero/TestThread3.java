package 线程.Hero;

/**
 * 使用匿名类创建多线程对象：
 * 继承Thread,重写run()方法
 * 好处：便于访问外部局部变量
 * @author ZhaoMin
 * @date 2019/9/20 0:50
 */
public class TestThread3 {
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
        //匿名类
        Thread t1=new Thread(){
            @Override
            public void run() {
                while(!teemo.isDead()){
                    gareen.attackHero(teemo);//访问外部局部变量teemo,JDK7以后，
                    // 不用必须把外部局部变量声明为final
                }
            }
        };
        t1.start();
        Thread t2=new Thread(){
            @Override
            public void run() {
                while(!lessin.isDead()){
                    bh.attackHero(lessin);//访问外部局部变量teemo,JDK7以后，
                    // 不用必须把外部局部变量声明为final
                }
            }
        };
        t2.start();
    }
}
