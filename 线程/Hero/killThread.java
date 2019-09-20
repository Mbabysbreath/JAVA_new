package 线程.Hero;

/**
 * 通过继承线程类来创建多线程
 * @author ZhaoMin
 * @date 2019/9/19 23:57
 */
public class killThread extends Thread {
    private Hero h1;
    private Hero h2;

    public killThread(Hero h1,Hero h2){
        this.h1=h1;
        this.h2=h2;
    }
    @Override
    public void run() {
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
    }
}
