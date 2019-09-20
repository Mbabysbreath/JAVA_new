package 线程.Hero;

/**
 * 通过继承Runable类创建多线程对象
 * @author ZhaoMin
 * @date 2019/9/20 0:17
 */
public class Battle implements Runnable{
    Hero h1;
    Hero h2;
    public Battle(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }
    @Override
    public void run() {
        while (!h2.isDead()) {
            h1.attackHero(h2);
        }
    }
}
