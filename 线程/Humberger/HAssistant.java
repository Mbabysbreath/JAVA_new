package 线程;

class HAssistant extends Thread {
    void sell(){//销售一个汉堡
        synchronized (Ham.box){
            if(Ham.production==Ham.sales){//销售量与生产量相等，箱子为空
                System.out.println("营业员：请稍等！");
                try{
                    Ham.box.wait();//返还箱子的monitor权限，等待
                }catch(InterruptedException ie){ }//厨师唤醒营业员时，抛出异常
            }
            Ham.sales++;
            System.out.println("营业员：汉堡包来了，共："+Ham.sales+"个");
        }
    }
    public void run(){
        while(Ham.sales<Ham.totalMaterial){
            System.out.println("<顾客订购汉堡>");
            sell();
            try{
                sleep(1000);//每隔一秒，销售一个汉堡
            }catch(InterruptedException ie){}
        }
    }
}
