package 线程;

import 线程.Hero.Hero;

/**
 * @author ZhaoMin
 * @date 2019/9/22 9:34
 */
public class Lock {
    public static void main(String[] args) {
       final Hero a=new Hero();
       a.name="a";
       final Hero b=new Hero();
       b.name="b";
       final Hero c=new Hero();
       c.name="c";
       Thread t1=new Thread(){
           @Override
           public void run() {
               synchronized (a){
                   System.out.println("t1已占有a");
                   try{
                       Thread.sleep(10000);
                   }catch (Exception e){
                       e.printStackTrace();
                   }
                   System.out.println("t1试图占有b");
                   System.out.println("t1等待中...");
                   synchronized (b){
                       System.out.println(" t1 do someting");
                   }
               }
           }
       };
       t1.start();
       Thread t2=new Thread(){
           @Override
           public void run() {
               synchronized(b){
                   System.out.println("t2已占有b");
               try{
                   Thread.sleep(10000);
               }catch(InterruptedException e){
                   e.printStackTrace();
               }
                   System.out.println("t2试图占有c");
                   System.out.println("t2等待中。。。");
               synchronized (c){
                   System.out.println("t2 do something");
               }
           }
       }
    };
       t2.start();
       Thread t3=new Thread(){
           @Override
           public void run() {
               synchronized (c) {
                   System.out.println("t3已经占有c");
                   try {
                       Thread.sleep(10000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("t3尝试占有a");
                   System.out.println("t3等待中。。");
                   synchronized (a) {
                       System.out.println("t3 do something");
                   }
               }
           }
       };
       t3.start();

    }
}
