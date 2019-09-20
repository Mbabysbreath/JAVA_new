package 线程.Hero;

/**启动线程是start()方法，run()并不能启动一个新的线程
 * @author ZhaoMin
 * @date 2019/9/19 23:44
 */
import java.util.*;
public class Hero {
    public String name;//名字
    public float hp;//血量
    public int damage;//武力值

    public void attackHero(Hero h){
        try{
            Thread.sleep(1000);//攻击一次停1s
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        h.hp-=h.damage;
        System.out.format("%s正在攻击%s,%s的血变成了%f%n",name,h.name,h.name,h.hp);
        if(h.isDead()){
            System.out.format("%s死了%n",h.name);
        }
    }
    public boolean isDead(){
        return 0>=hp?true:false;
    }
}
