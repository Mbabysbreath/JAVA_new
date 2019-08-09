public class Exception1 {
    void hi(){
        System.out.println("hi");
    }
    public static void main(String[] args) {
        System.out.println("开始程序");
        int a=1,b=0;
        // int[] ab={0};
        Exception1 ob=null;
        try{
            //  ab[10]=100;
            //int c=a/b;
            //  System.out.println(c);
            ob.hi(); int c=a/b;
        }catch(ArithmeticException ae){
            System.out.println("不能被0除");
        }catch(NullPointerException ne){
            System.out.println("创建对象");
            ob=new Exception1();
            ob.hi();
        }
        finally {
            System.out.println("退出程序");
        }
    }
}
