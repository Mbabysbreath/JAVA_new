class SumThread extends Thread{//求出从from到to的所以整数之和
    int from,to;
    long sum;
    SumThread(int from,int to){
        this.from=from;
        this.to=to;
    }
    long getSum(){
        return sum;
    }
    public void fun(){
        for(int i=from;i<=to;i++){
            sum+=i;
        }
    }
}
public class Thread3 {
    public static void main(String[] args) {
        SumThread st=new SumThread(1,1000);
        st.start();
        try{
            st.join();//无限等待至st线程死亡
        }catch(InterruptedException ie){
            System.out.println("异常");
        }
        long sum=st.getSum();
        System.out.println(sum); st.isAlive();
    }
}
