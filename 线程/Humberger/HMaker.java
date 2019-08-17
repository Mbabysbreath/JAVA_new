package 线程;
class Ham{
    static Object box=new Object();//x1,汉堡包箱子
    static int totalMaterial=6;//制作6个汉堡的材料量
    static int production=3;//顾客光顾之前，先做好3个
    static int sales=0;//销售量开始为0
}
class HMaker extends Thread{//厨师类
    void make(){//制作一个汉堡，通知营业员
        //拥有汉堡包箱子的monitor后，开始制作汉堡包
        synchronized (Ham.box){
            Ham.production++;
            System.out.println("厨师：这里有汉堡"+Ham.production+"个");
            Ham.box.notify();//通知营业员
        }
    }
    public void run(){
        while(Ham.production<Ham.totalMaterial){//有多少原料做多少汉堡
            try{
                sleep(3000);//做一个汉堡，等3秒
            }catch(InterruptedException ie){}
            make();
        }
    }
}
